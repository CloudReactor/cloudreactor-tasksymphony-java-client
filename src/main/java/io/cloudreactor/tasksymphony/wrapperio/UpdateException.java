package io.cloudreactor.tasksymphony.wrapperio;

/** An exception indicating that a problem occurred sending an update.
 *
 *  @author <a href="mailto:jtsay@cloudreactor.io">Jeff Tsay</a>
 *  @since 0.3.0
 */
public abstract class UpdateException extends RuntimeException {
    public UpdateException(final String message) {
        super(message);
    }

    public UpdateException(final Throwable cause) {
        super(cause);
    }

    public UpdateException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
