package io.cloudreactor.tasksymphony.wrapperio;

import java.io.IOException;
import java.net.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/** This class allows JVM processes managed by the CloudReactor wrapper script
 *  to send their status by communicating with the wrapper script, which in
 *  turn, communicates with the CloudReactor API server. Communication with the
 *  wrapper script is done over UDP sockets, so it is unreliable in theory, but
 *  in practice, since it's all on localhost, it's pretty reliable.
 *
 *  This class can be created in a disabled state, in which case all operations
 *  are no-ops.
 *
 *  @author <a href="mailto:jtsay@cloudreactor.io">Jeff Tsay</a>
 *  @since 0.1.0
 */
public class TaskStatusUpdater implements AutoCloseable {
  /** Create a new instance, using the environment variables
   *  <code>PROC_WRAPPER_ENABLE_STATUS_UPDATE_LISTENER</code>
   *  (which should be mapped to <code>TRUE</code> to enable) and
   *  <code>PROC_WRAPPER_STATUS_UPDATE_SOCKET_PORT</code> (which should be mapped to
   *  a valid port number) to set the enabled flag and the port number, respectively.
   *
   *  @since 0.1.0
   */
  public TaskStatusUpdater() {
    String value = System.getenv("PROC_WRAPPER_ENABLE_STATUS_UPDATE_LISTENER");

    _isEnabled = (value != null) && value.toUpperCase(Locale.US).equals("TRUE");

    value = System.getenv("PROC_WRAPPER_STATUS_UPDATE_SOCKET_PORT");

    if ((value == null) || value.trim().isEmpty()) {
      _outboundPort = DEFAULT_STATUS_UPDATE_PORT;
    } else {
      _outboundPort = Integer.parseInt(value);
    }

    if (_outboundPort <= 0) {
      throw new IllegalArgumentException("Port " + _outboundPort + " is not a valid port number.");
    }

    value = System.getenv("PROC_WRAPPER_STATUS_UPDATE_SOCKET_BIND_PORT");

    if ((value == null) || value.trim().isEmpty()) {
      _bindPort = null;
    } else {
      _bindPort = Integer.valueOf(value);

      if (_bindPort.intValue() == _outboundPort) {
        throw new IllegalArgumentException("Outbound port and bind port are both " + _outboundPort);
      }
    }

    try {
      _localhostInetAddress = InetAddress.getByName("localhost");
    } catch (UnknownHostException uhe) {
      throw new IllegalStateException("Can't get address of localhost");
    }

    logger.info("TaskStatusUpdater isEnabled = {}, outboundPort = {}, bindPort = {}",
      _isEnabled, _outboundPort, _bindPort);
  }

  /** Create a new instance, that optionally disabled and uses the argument
   *  port for communication with the wrapper script.
   *  @param isEnabled true to enable communication, false to disable
   *  @param outboundPort The port used to communicate with the wrapper script using UDP sockets.
   *  @param bindPort The port the socket is bound to. Should be different
   *  from the outbound port. If null, any available port will be used.
   *  @throws IllegalArgumentException if either port number is invalid
   *  @since 0.1.0
   */
  public TaskStatusUpdater(final boolean isEnabled, final int outboundPort,
    final Integer bindPort) {
    if (outboundPort <= 0) {
      throw new IllegalArgumentException("Outbound port " + outboundPort + " is not a valid port number.");
    }

    if (bindPort != null) {
      final int iBindPort = bindPort.intValue();

      if (iBindPort <= 0) {
        throw new IllegalArgumentException("Bind port " + iBindPort + " is not a valid port number.");
      }

      if (iBindPort == outboundPort) {
        throw new IllegalArgumentException("Outbound port and bind port are both " + outboundPort);
      }
    }

    _isEnabled = isEnabled;
    _outboundPort = outboundPort;
    _bindPort = bindPort;

    try {
      _localhostInetAddress = InetAddress.getByName("localhost");
    } catch (UnknownHostException uhe) {
      throw new IllegalStateException("Can't get address of localhost");
    }
  }

  /** Create a new instance, that is enabled and uses the argument port for
   *  communication with the wrapper script.
   *  @param outboundPort The port used to communicate with the wrapper script using UDP sockets.
   *  @throws IllegalArgumentException if the port number is invalid
   *  @since 0.1.0
   */
  public TaskStatusUpdater(final int outboundPort) {
    this(true, outboundPort, null);
  }

  /** Send an update message to the process wrapper script, if status updates are enabled.
   *  The wrapper script will coalesce updates to save bandwidth so this method can
   *  be called as often as desired. This method can also be called concurrently by
   *  multiple threads.
   *
   * @param successCount The number of successful items. If null, no value will be sent.
   * @param errorCount The number of unsuccessful items. If null, no value will be sent.
   * @param skippedCount The number of skipped items. If null, no value will be sent.
   * @param expectedCount The number of expected items. If null, no value will be sent.
   * @param lastStatusMessage A message indicating the last status. If null, no value will be sent.
   * @param extraProps A map containing string keys mapped to additional properties to send
   * Each property value must be something serializable in JSON, including lists and
   * hashes. If null, no additional properties will be sent.
   * @param maxRetries If null, the default number of attempts will be used (10).
   * If non-null and non-negative, the value is the maximum number of times an
   * update will be retried before throwing a <code>TimeoutException</code>.
   * If non-null and negative, the update will be retried indefinitely until
   * successful, subject to the timeout limit.
   * @param timeoutMillis If null, the default timeout will be used (10 minutes).
   * If non-null and non-negative, the value is the maximum duration this call can
   * take before throwing a <code>MaxRetriesExceedException</code>.
   * If non-null and negative, no time limit will apply.
   * @param backoffDurationMillis The duration to wait, in milliseconds, after an
   * unsuccessful socket operation, before the next retry. If -1, the default
   * duration will be used.
   * @return true if the update succeeded, false if status updates are disabled.
   * @throws MessageConversionException if <code>extraProps</code> contains
   * values that cannot be serialized to JSON.
   * @throws MaxRetriesExceededException if the number of allowed retries was exceeded
   * @throws TimeoutException if the operation timed out
   * @throws UnknownHostException if localhost can't be resolved
   * @throws InterruptedException if the current thread is interrupted while
   * waiting after an IOException occurred
   * @since 0.1.0
   */
  public boolean sendUpdate(final Long successCount, final Long errorCount,
    final Long skippedCount, final Long expectedCount,
    final String lastStatusMessage, final Map<String, Object> extraProps,
    Long maxRetries, Long timeoutMillis, long backoffDurationMillis)
    throws MessageConversionException, MaxRetriesExceededException,
      TimeoutException, InterruptedException {

    if (!_isEnabled) {
      if (logger.isTraceEnabled()) {
        logger.trace("sendUpdate() exiting early since updater is disabled.");
      }
      return false;
    }

    if (backoffDurationMillis < 0L) {
      backoffDurationMillis = DEFAULT_BACKOFF_DURATION_MILLIS;
    }

    final byte[] message = makeMessage(successCount, errorCount,
      skippedCount, expectedCount, lastStatusMessage, extraProps);

    final DatagramPacket packet = new DatagramPacket(message, message.length,
      _localhostInetAddress, _outboundPort);

    final long maxAttempts = (maxRetries == null) ? DEFAULT_MAX_ATTEMPTS :
      (maxRetries.longValue() + 1);

    final long timeoutMillisValue = (timeoutMillis == null) ? DEFAULT_TIMEOUT_MILLIS :
      timeoutMillis.longValue();

    final Long deadlineMillis = (timeoutMillisValue < 0L) ?
      null : Long.valueOf(System.currentTimeMillis() + timeoutMillisValue);

    long attemptCount = 0L;

    do {
      attemptCount += 1L;

      logger.debug("Sending update, attempt {}", attemptCount);

      synchronized (this) {
        DatagramSocket sock = null;
        try {
          sock = acquireSocket();
          sock.send(packet);
          notifyAll();
          return true;
        } catch (IOException ioe) {
          logger.warn("Got IOException when sending update message", ioe);

          if (sock != null) {
            try {
              sock.close();
            } catch (Exception ex) {
              logger.debug("Can't close socket", ex);
            }
          }
          this._socket = null;

          if ((maxAttempts > 0) && (attemptCount >= maxAttempts)) {
            throw new MaxRetriesExceededException(maxAttempts - 1, ioe);
          }

          if ((deadlineMillis != null) &&
              (System.currentTimeMillis() > deadlineMillis.longValue())) {
            throw new TimeoutException("sendUpdate() timed out after " + timeoutMillis + " ms");
          }

          logger.info("Waiting {} ms before retrying ...", backoffDurationMillis);
          wait(backoffDurationMillis);
        }
      }
    } while (true);
  }

  /** Send an update message to the process wrapper script, using the default values
   *  for retries, timeout, and backoff duration.
   * @param successCount The number of successful items. If null, no value will be sent.
   * @param errorCount The number of unsuccessful items. If null, no value will be sent.
   * @param skippedCount The number of skipped items. If null, no value will be sent.
   * @param expectedCount The number of expected items. If null, no value will be sent.
   * @param lastStatusMessage A message indicating the last status. If null, no value will be sent.
   * @param extraProps A map containing string keys mapped to additional properties to send
   * Each property value must be something serializable in JSON, including lists and
   * hashes. If null, no additional properties will be sent.
   * @return true if the update succeeded, false if status updates are disabled.
   * @throws MessageConversionException if <code>extraProps</code> contains
   * values that cannot be serialized to JSON.
   * @throws MaxRetriesExceededException if the number of allowed retries was exceeded
   * @throws TimeoutException if the operation timed out
   * @throws UnknownHostException if localhost can't be resolved
   * @throws InterruptedException if the current thread is interrupted while
   * waiting after an IOException occurred
   * @since 0.1.0
   */
  public boolean sendUpdate(final Long successCount, final Long errorCount,
    final Long skippedCount, final Long expectedCount,
    final String lastStatusMessage, final Map<String, Object> extraProps)
    throws MessageConversionException, MaxRetriesExceededException,
      TimeoutException, InterruptedException {
    return sendUpdate(successCount, errorCount, skippedCount, expectedCount,
      lastStatusMessage, extraProps, null, null, -1L);
  }

  /** Return true if communication is enabled.
   *  @return true if communication is enabled
   *  @since 0.1.0
   */
  public boolean isEnabled() {
    return _isEnabled;
  }

  /** Return the port used to communicate with the wrapper script.
   *  @return the port used to communicate with the wrapper script.
   *  @since 0.1.0
   */
  public int getOutboundPort() {
    return _outboundPort;
  }

  /** Return the port this instance binds to. If this instance binds to
   *  any available port, return null.
   *  @return the port this instance binds to, or null if this instance binds
   *  to any available port
   *  @since 0.1.0
   */
  public Integer getBindPort() {
    return _bindPort;
  }

  /** Close the underlying socket if it exists.
   * @throws SocketException if closing the socket causes an exception
   * @since 0.1.0
   */
  @Override
  public synchronized void close() {
    if (_socket != null) {
      _socket.close();
      _socket = null;
    }
  }

  byte[] makeMessage(final Long successCount, final Long errorCount,
    final Long skippedCount, final Long expectedCount,
    final String lastStatusMessage, final Map<String, Object> extraProps)
    throws MessageConversionException {

    final Map<String, Object> props = new HashMap<String, Object>(
      ((extraProps == null) ? 0 : extraProps.size()) + 7);

    if (successCount != null) {
      props.put("success_count", successCount);
    }

    if (errorCount != null) {
      props.put("error_count", errorCount);
    }

    if (skippedCount != null) {
      props.put("skipped_count", skippedCount);
    }

    if (expectedCount != null) {
      props.put("expected_count", expectedCount);
    }

    if (lastStatusMessage != null) {
      props.put("last_status_message", lastStatusMessage);
    }

    if (extraProps != null) {
      props.putAll(extraProps);
    }

    try {
      return (mapper.writeValueAsString(props) + "\n").getBytes();
    } catch (JsonProcessingException jpe) {
      throw new MessageConversionException(jpe, props);
    }
  }

  /** The default port used to communicated with the wrapper script (2373). */
  public final static int DEFAULT_STATUS_UPDATE_PORT = 2373;

  /** The default number of attempts allowed for each call to updateStatus(). */
  public final static long DEFAULT_MAX_ATTEMPTS = 10L;

  /** The default timeout, in milliseconds, before updateStatus() fails.
   *  This value is equivalent to 10 minutes.
   */
  private final static long DEFAULT_TIMEOUT_MILLIS = 10L * 60L * 1000L;

  /** The default duration, in milliseconds, to wait after a socket operation
   *  fails. This value is equivalent to 30 seconds.
   */
  private final static long DEFAULT_BACKOFF_DURATION_MILLIS = 30L * 1000L;

  private DatagramSocket acquireSocket() throws java.net.SocketException {
    if (_socket != null) {
      return _socket;
    }

    if (_bindPort == null) {
      _socket = new DatagramSocket();
    } else {
      _socket = new DatagramSocket(_bindPort);
    }
    return _socket;
  }

  private final boolean _isEnabled;
  private final int _outboundPort;
  private final Integer _bindPort;
  private final InetAddress _localhostInetAddress;
  private DatagramSocket _socket = null;

  private final static ObjectMapper mapper = new ObjectMapper();
  private final static Logger logger = LoggerFactory.getLogger(TaskStatusUpdater.class);
}
