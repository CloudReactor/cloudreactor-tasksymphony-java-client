package io.cloudreactor.tasksymphony.wrapperio;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
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
   *  <code>PROC_WRAPPER_STATUS_UPDATE_SOCKET_PORT</code> (which should be
   *  mapped to a valid port number) to set the enabled flag and the port
   *  number, respectively.
   *
   *  @since 0.1.0
   */
  public TaskStatusUpdater() {
    String value = System.getenv("PROC_WRAPPER_ENABLE_STATUS_UPDATE_LISTENER");

    isEnabled = (value != null) && value.toUpperCase(Locale.US).equals("TRUE");

    value = System.getenv("PROC_WRAPPER_STATUS_UPDATE_SOCKET_PORT");

    if ((value == null) || value.trim().isEmpty()) {
      outboundPort = DEFAULT_STATUS_UPDATE_PORT;
    } else {
      outboundPort = Integer.parseInt(value);
    }

    if (outboundPort <= 0) {
      throw new IllegalArgumentException("Port " + outboundPort
          + " is not a valid port number.");
    }

    value = System.getenv("PROC_WRAPPER_STATUS_UPDATE_SOCKET_BIND_PORT");

    if ((value == null) || value.trim().isEmpty()) {
      bindPort = null;
    } else {
      bindPort = Integer.valueOf(value);

      if (bindPort.intValue() == outboundPort) {
        throw new IllegalArgumentException(
            "Outbound port and bind port are both " + outboundPort);
      }
    }

    try {
      localhostInetAddress = InetAddress.getByName("localhost");
    } catch (UnknownHostException uhe) {
      throw new IllegalStateException("Can't get address of localhost");
    }

    LOGGER.info(
        "TaskStatusUpdater isEnabled = {}, outboundPort = {}, bindPort = {}",
        isEnabled, outboundPort, bindPort);
  }

  /** Create a new instance, that optionally disabled and uses the argument
   *  port for communication with the wrapper script.
   *  @param isEnabled true to enable communication, false to disable
   *  @param outboundPort The port used to communicate with the wrapper script
   *                      using UDP sockets.
   *  @param bindPort The port the socket is bound to. Should be different
   *  from the outbound port. If null, any available port will be used.
   *  @throws IllegalArgumentException if either port number is invalid
   *  @since 0.1.0
   */
  public TaskStatusUpdater(final boolean isEnabled, final int outboundPort,
    final Integer bindPort) {
    if (outboundPort <= 0) {
      throw new IllegalArgumentException("Outbound port " + outboundPort
          + " is not a valid port number.");
    }

    if (bindPort != null) {
      final int iBindPort = bindPort.intValue();

      if (iBindPort <= 0) {
        throw new IllegalArgumentException("Bind port " + iBindPort
            + " is not a valid port number.");
      }

      if (iBindPort == outboundPort) {
        throw new IllegalArgumentException(
            "Outbound port and bind port are both " + outboundPort);
      }
    }

    this.isEnabled = isEnabled;
    this.outboundPort = outboundPort;
    this.bindPort = bindPort;

    try {
      localhostInetAddress = InetAddress.getByName("localhost");
    } catch (UnknownHostException uhe) {
      throw new IllegalStateException("Can't get address of localhost");
    }
  }

  /** Create a new instance, that is enabled and uses the argument port for
   *  communication with the wrapper script.
   *  @param outboundPort The port used to communicate with the wrapper script
   *                      using UDP sockets.
   *  @throws IllegalArgumentException if the port number is invalid
   *  @since 0.1.0
   */
  public TaskStatusUpdater(final int outboundPort) {
    this(true, outboundPort, null);
  }

  /** Send an update message to the process wrapper script, if status updates
   *  are enabled. The wrapper script will coalesce updates to save bandwidth so
   *  this method can be called as often as desired. This method can also be
   *  called concurrently by multiple threads.
   *
   * @param successCount The number of successful items. If null, no value will
   *                     be sent.
   * @param errorCount The number of unsuccessful items. If null, no value will
   *                   be sent.
   * @param skippedCount The number of skipped items. If null, no value will be
   *                     sent.
   * @param expectedCount The number of expected items. If null, no value will
   *                      be sent.
   * @param lastStatusMessage A message indicating the last status. If null, no
   *                          value will be sent.
   * @param extraProps A map containing string keys mapped to additional
   *                   properties to send. Each property value must be something
   *                   serializable in JSON, including lists and dictionaries.
   *                   If null, no additional properties will be sent.
   * @param maxRetries If null, the default number of attempts will be used
   *                   (10).
   * If non-null and non-negative, the value is the maximum number of times an
   * update will be retried before throwing a <code>TimeoutException</code>.
   * If non-null and negative, the update will be retried indefinitely until
   * successful, subject to the timeout limit.
   * @param timeoutMillis If null, the default timeout will be used (10
   *                      minutes).
   * If non-null and non-negative, the value is the maximum duration this call
   * can take before throwing a <code>MaxRetriesExceedException</code>.
   * If non-null and negative, no time limit will apply.
   * @param backoffDurationMillis The duration to wait, in milliseconds, after
   * an unsuccessful socket operation, before the next retry. If -1, the default
   * duration will be used.
   * @return true if the update succeeded, false if status updates are disabled.
   * @throws MessageConversionException if <code>extraProps</code> contains
   * values that cannot be serialized to JSON.
   * @throws MaxRetriesExceededException if the number of allowed retries was
   * exceeded
   * @throws TimeoutException if the operation timed out
   * @throws InterruptedException if the current thread is interrupted while
   * waiting after an IOException occurred
   * @since 0.1.0
   */
  public boolean sendUpdate(final Long successCount, final Long errorCount,
    final Long skippedCount, final Long expectedCount,
    final String lastStatusMessage, final Map<String, Object> extraProps,
    final Long maxRetries, final Long timeoutMillis,
    final long backoffDurationMillis)
    throws UpdateException, TimeoutException, InterruptedException {

    if (!isEnabled) {
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("sendUpdate() exiting early since updater is disabled.");
      }
      return false;
    }

    long backoffMillis = (backoffDurationMillis < 0L)
        ? DEFAULT_BACKOFF_DURATION_MILLIS : backoffDurationMillis;

    final byte[] message = makeMessage(successCount, errorCount,
      skippedCount, expectedCount, lastStatusMessage, extraProps);

    final DatagramPacket packet = new DatagramPacket(message, message.length,
        localhostInetAddress, outboundPort);

    final long maxAttempts = (maxRetries == null) ? DEFAULT_MAX_ATTEMPTS
        : (maxRetries.longValue() + 1);

    final long timeoutMillisValue = (timeoutMillis == null)
        ? DEFAULT_TIMEOUT_MILLIS : timeoutMillis.longValue();

    final Long deadlineMillis = (timeoutMillisValue < 0L)
        ? null : Long.valueOf(System.currentTimeMillis() + timeoutMillisValue);

    long attemptCount = 0L;

    do {
      attemptCount += 1L;

      LOGGER.debug("Sending update, attempt {}", attemptCount);

      synchronized (this) {
        DatagramSocket sock = null;
        try {
          sock = acquireSocket();
          sock.send(packet);
          notifyAll();
          return true;
        } catch (IOException ioe) {
          LOGGER.warn("Got IOException when sending update message", ioe);

          if (sock != null) {
            try {
              sock.close();
            } catch (Exception ex) {
              LOGGER.debug("Can't close socket", ex);
            }
          }
          this.socket = null;

          if ((maxAttempts > 0) && (attemptCount >= maxAttempts)) {
            throw new MaxRetriesExceededException(maxAttempts - 1, ioe);
          }

          if ((deadlineMillis != null)
              && (System.currentTimeMillis() > deadlineMillis.longValue())) {
            throw new TimeoutException("sendUpdate() timed out after "
                + timeoutMillis + " ms");
          }

          LOGGER.info("Waiting {} ms before retrying ...", backoffMillis);
          wait(backoffMillis);
        }
      }
    } while (true);
  }

  /** Send an update message to the process wrapper script, using the default
   *  values for retries, timeout, and backoff duration.
   * @param successCount The number of successful items. If null, no value will
   *                     be sent.
   * @param errorCount The number of unsuccessful items. If null, no value will
   *                   be sent.
   * @param skippedCount The number of skipped items. If null, no value will be
   *                     sent.
   * @param expectedCount The number of expected items. If null, no value will
   *                      be sent.
   * @param lastStatusMessage A message indicating the last status. If null, no
   *                          value will be sent.
   * @param extraProps A map containing string keys mapped to additional
   *                   properties to send
   * Each property value must be something serializable in JSON, including lists
   * and dictionaries. If null, no additional properties will be sent.
   * @return true if the update succeeded, false if status updates are disabled.
   * @throws MessageConversionException if <code>extraProps</code> contains
   * values that cannot be serialized to JSON.
   * @throws MaxRetriesExceededException if the number of allowed retries was
   * exceeded
   * @throws TimeoutException if the operation timed out
   * @throws InterruptedException if the current thread is interrupted while
   * waiting after an IOException occurred
   * @since 0.1.0
   */
  public boolean sendUpdate(final Long successCount, final Long errorCount,
    final Long skippedCount, final Long expectedCount,
    final String lastStatusMessage, final Map<String, Object> extraProps)
    throws UpdateException, TimeoutException, InterruptedException {
    return sendUpdate(successCount, errorCount, skippedCount, expectedCount,
      lastStatusMessage, extraProps, null, null, -1L);
  }

  /** Send an update message to the process wrapper script, using the default
   *  values or retries, timeout, and backoff duration. Swallow the exceptions
   *  that could result from failing to send the update, retuning false instead.
   * @param successCount The number of successful items. If null, no value will
   *                     be sent.
   * @param errorCount The number of unsuccessful items. If null, no value will
   *                   be sent.
   * @param skippedCount The number of skipped items. If null, no value will be
   *                     sent.
   * @param expectedCount The number of expected items. If null, no value will
   *                      be sent.
   * @param lastStatusMessage A message indicating the last status. If null, no
   *                          value will be sent.
   * @param extraProps A map containing string keys mapped to additional
   *                   properties to send. Each property value must be something
   *                   serializable in JSON, including lists and dictionaries.
   *                   If null, no additional properties will be sent.
   * @return true if the update succeeded, false if status updates are disabled
   * or if the update failed.
   * @since 0.4.0
   */
  public boolean sendUpdateAndIgnoreError(final Long successCount,
    final Long errorCount, final Long skippedCount, final Long expectedCount,
    final String lastStatusMessage, final Map<String, Object> extraProps) {
    try {
      return sendUpdate(successCount, errorCount, skippedCount, expectedCount,
              lastStatusMessage, extraProps, null, null, -1L);
    } catch (UpdateException uex) {
      LOGGER.info("Ignoring update exception", uex);
      return false;
    } catch (TimeoutException tex) {
      LOGGER.info("Ignoring timeout exception", tex);
      return false;
    } catch (InterruptedException iex) {
      LOGGER.info("Ignoring interrupted exception", iex);
      return false;
    }
  }

  /** Return true if communication is enabled.
   *  @return true if communication is enabled
   *  @since 0.1.0
   */
  public boolean isEnabled() {
    return isEnabled;
  }

  /** Return the port used to communicate with the wrapper script.
   *  @return the port used to communicate with the wrapper script.
   *  @since 0.1.0
   */
  public int getOutboundPort() {
    return outboundPort;
  }

  /** Return the port this instance binds to. If this instance binds to
   *  any available port, return null.
   *  @return the port this instance binds to, or null if this instance binds
   *  to any available port
   *  @since 0.1.0
   */
  public Integer getBindPort() {
    return bindPort;
  }

  /** Close the underlying socket if it exists.
   * @since 0.1.0
   */
  @Override
  public synchronized void close() {
    if (socket != null) {
      socket.close();
      socket = null;
    }
  }

  /** Return a byte array that encodes the parameters for a wrapper script
   *  to read. This is normally a JSON-encoded dictionary, with a newline at the
   *  end.
   *
   * @param successCount The number of successful items. If null, no value will
   *                     be sent.
   * @param errorCount The number of unsuccessful items. If null, no value will
   *                   be sent.
   * @param skippedCount The number of skipped items. If null, no value will be
   *                     sent.
   * @param expectedCount The number of expected items. If null, no value will
   *                      be sent.
   * @param lastStatusMessage A message indicating the last status. If null, no
   *                          value will be sent.
   * @param extraProps A map containing string keys mapped to additional
   *                   properties to send. Each property value must be something
   *                   serializable in JSON, including lists and dictionaries.
   *                   If null, no additional properties will be sent.
   * @return A byte array that encodes the parameters
   * @throws MessageConversionException if the message cannot be encoded
   */
  protected byte[] makeMessage(final Long successCount,
    final Long errorCount, final Long skippedCount, final Long expectedCount,
    final String lastStatusMessage, final Map<String, Object> extraProps)
    throws MessageConversionException {

    final Map<String, Object> props = new HashMap<>(
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
      return (MAPPER.writeValueAsString(props) + "\n").getBytes(
          StandardCharsets.UTF_8);
    } catch (JsonProcessingException jpe) {
      throw new MessageConversionException(jpe, props);
    }
  }

  /** The default port used to communicated with the wrapper script (2373). */
  public static final int DEFAULT_STATUS_UPDATE_PORT = 2373;

  /** The default number of attempts allowed for each call to updateStatus(). */
  public static final long DEFAULT_MAX_ATTEMPTS = 10L;

  /** The default timeout, in milliseconds, before updateStatus() fails.
   *  This value is equivalent to 10 minutes.
   */
  private static final long DEFAULT_TIMEOUT_MILLIS = 10L * 60L * 1000L;

  /** The default duration, in milliseconds, to wait after a socket operation
   *  fails. This value is equivalent to 30 seconds.
   */
  private static final long DEFAULT_BACKOFF_DURATION_MILLIS = 30L * 1000L;

  private DatagramSocket acquireSocket() throws java.net.SocketException {
    if (socket != null) {
      return socket;
    }

    if (bindPort == null) {
      socket = new DatagramSocket();
    } else {
      socket = new DatagramSocket(bindPort);
    }
    return socket;
  }

  private final boolean isEnabled;
  private final int outboundPort;
  private final Integer bindPort;
  private final InetAddress localhostInetAddress;
  private DatagramSocket socket = null;

  private static final ObjectMapper MAPPER = new ObjectMapper();
  private static final Logger LOGGER = LoggerFactory.getLogger(
    TaskStatusUpdater.class);
}
