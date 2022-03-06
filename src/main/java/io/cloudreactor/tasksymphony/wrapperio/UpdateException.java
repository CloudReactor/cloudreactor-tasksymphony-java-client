package io.cloudreactor.tasksymphony.wrapperio;

/**
 * An exception indicating that a problem occurred sending an update.
 *
 * @author <a href="mailto:jtsay@cloudreactor.io">Jeff Tsay</a>
 * @since 0.3.0
 */
public abstract class UpdateException extends RuntimeException {
  /**
   * Create a new UpdateException.
   *
   * @param message A message indicating the problem. May be null.
   * @param cause The exception that caused the problem. May be null.
   */
  UpdateException(final String message, final Throwable cause) {
    super(message, cause);
  }
}
