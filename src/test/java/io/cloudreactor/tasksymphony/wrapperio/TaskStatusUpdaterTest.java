package io.cloudreactor.tasksymphony.wrapperio;

import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.JsonNode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.Test;

import java.util.Map;
import java.util.concurrent.TimeoutException;

public class TaskStatusUpdaterTest {
  @Test
  public void smokeTest() throws Exception {
    logger.info("smokeTest()");
    TaskStatusUpdater statusUpdater = new TaskStatusUpdater(true, 2373, null);

    logger.info("created updater");
    MockProcessWrapper wrapper = new MockProcessWrapper(2373);

    logger.info("created wrapper");

    Thread wrapperThread = new Thread(wrapper);
    wrapperThread.start();
    logger.info("started wrapper");

    boolean sent = false;

    try (MockProcessWrapper w = wrapper) {

      logger.info("Sending update 1 ...");
      sent = statusUpdater.sendUpdate(1L, 2L, 3L, 4L, "hi", null);
      logger.info("Done update 1.");
      assertTrue(sent);

      logger.info("Waiting for update 1...");
      JsonNode update = wrapper.waitForNextUpdate(5000L);
      logger.info("Done waiting for update 1, got " + update.toPrettyString());

      assertEquals(update.get("success_count").asInt(), 1);
      assertEquals(update.get("error_count").asInt(), 2);
      assertEquals(update.get("skipped_count").asInt(), 3);
      assertEquals(update.get("expected_count").asInt(), 4);
      assertEquals(update.get("last_status_message").asText(), "hi");

      logger.info("Sending update 2 ...");
      sent = statusUpdater.sendUpdateAndIgnoreError(109L, null, null, null, null, null);
      logger.info("Done update 2.");
      assertTrue(sent);

      logger.info("Waiting for update 2...");
      update = wrapper.waitForNextUpdate(5000L);
      logger.info("Done waiting for update 2, got " + update.toPrettyString());

      assertEquals(update.get("success_count").asInt(), 109);
      assertFalse(update.has("error_count"));
    }
  }

  @Test
  public void testSendUpdateAndIgnoreError() {
    TaskStatusUpdater updater = new TaskStatusUpdater() {
      @Override
      public boolean sendUpdate(final Long successCount, final Long errorCount,
                                final Long skippedCount, final Long expectedCount,
                                final String lastStatusMessage, final Map<String, Object> extraProps,
                                Long maxRetries, Long timeoutMillis, long backoffDurationMillis)
              throws UpdateException, TimeoutException, InterruptedException {

        switch (successCount.intValue()) {
          case 1:
            throw new MaxRetriesExceededException(1L, null);

          case 2:
            throw new MessageConversionException(null, null);

          case 3:
            throw new TimeoutException();

          default:
            throw new InterruptedException();
        }
      }
    };

    for (long i = 1; i <= 4; i++) {
      updater.sendUpdateAndIgnoreError(i, null, null, null, null,
              null);
    }
  }

  static final Logger logger = LoggerFactory.getLogger(TaskStatusUpdaterTest.class);
}


