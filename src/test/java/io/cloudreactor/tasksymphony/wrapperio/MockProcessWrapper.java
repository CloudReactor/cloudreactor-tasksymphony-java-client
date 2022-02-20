package io.cloudreactor.tasksymphony.wrapperio;

import java.net.*;

import com.fasterxml.jackson.databind.JsonNode;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class MockProcessWrapper implements Runnable, AutoCloseable {
  MockProcessWrapper(final int port) {
    _port = port;
  }

  @Override
  public synchronized void run() {
    logger.debug("running ...");

    try {
      DatagramSocket ds = new DatagramSocket(_port);
      ds.setSoTimeout(1000);

      byte[] buffer = new byte[2048];
      _isRunning = true;

       while (!_shouldStop) {
         // It's inefficient to allocate every time, but this is test code.
         DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
         try {
           logger.debug("receiving ...");
           ds.receive(packet);
           logger.debug("ingesting ...");
           ingestPacket(packet);
           logger.debug("done ingesting");
         } catch (SocketTimeoutException ste) {
           logger.trace("Socket timeout (expected)");
         } catch (Exception ex) {
           logger.warn("Caught exception receiving or processing packet", ex);
         }

         wait(1L);
       }

       _isRunning = false;
       notifyAll();
     } catch (Exception ex) {
        throw new RuntimeException("run() failed", ex);
     }

     logger.debug("Done running");
  }

  void ingestPacket(DatagramPacket packet) {
    byte[] sourceBuf = packet.getData();
    int sourceOffset = packet.getOffset();
    int sourceLength = packet.getLength();

    for (int i = 0; i < sourceLength; i++) {
      byte b = sourceBuf[sourceOffset + i];
      char c = (char) (b & 0xff);
      if (c == '\n') {
        try {
          _lastUpdate = objectMapper.readTree(_partialMessage, 0,_partialMessageOffset);
        } catch (Exception ex) {
          String s = null;

          try {
            s = new String(_partialMessage, 0, _partialMessageOffset);
          } catch (Exception ex2) {
            logger.warn("Can't read string from buffer", ex2);
          }
          logger.error("Couldn't decode message: " + s, ex);
          _lastUpdate = null;
        } finally {
          _partialMessageOffset = 0;
        }
      } else {
        if (_partialMessageOffset >= _partialMessage.length) {
          _partialMessageOffset = 0;
          logger.error("Buffer overflow");
        }

        _partialMessage[_partialMessageOffset] = b;
        _partialMessageOffset += 1;
      }
    }
  }

  synchronized void stop() {
    _shouldStop = true;
    notifyAll();
  }

  synchronized JsonNode getLastUpdate() {
    return _lastUpdate;
  }

  synchronized JsonNode waitForNextUpdate(long timeout)
  throws InterruptedException {
    do {
      if (_lastUpdate == null) {
        logger.debug("Waiting");
        wait(timeout);
        logger.debug("Done waiting");
      } else {
        final JsonNode rv = _lastUpdate;
        _lastUpdate = null;
        return rv;
      }
    } while (true);
  }


  @Override
  public synchronized void close() throws Exception {
    stop();

    while (_isRunning) {
      wait();
    }
  }

  int _port;
  boolean _shouldStop = false;
  boolean _isRunning = false;
  final byte[] _partialMessage = new byte[64 * 1024];
  int _partialMessageOffset = 0;
  JsonNode _lastUpdate = null;

  private static final Logger logger = LoggerFactory.getLogger(MockProcessWrapper.class);
  private static final ObjectMapper objectMapper = new ObjectMapper();
}
