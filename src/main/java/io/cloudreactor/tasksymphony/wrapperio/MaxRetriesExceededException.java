package io.cloudreactor.tasksymphony.wrapperio;

/** An exception indicating that the maximum number of retries has been
 *  exceeded
 *
 *  @author <a href="mailto:jtsay@cloudreactor.io">Jeff Tsay</a>
 *  @since 0.1.0
 */
public class MaxRetriesExceededException extends Exception {
  MaxRetriesExceededException(final long maxRetriesAllowed, final Exception cause) {
    super("Maximum number of retries (" + maxRetriesAllowed + ") exceeded", cause);
    this.maxRetriesAllowed = maxRetriesAllowed;
  }

  /** Return the maximum number of retries allowed, which was exceeded.
   *  @return the maximum number of retries allowed
   *  @since 0.1.0
   */
  public long getMaxRetriesAllowed() {
    return this.maxRetriesAllowed;
  }

  private final long maxRetriesAllowed;
}
