package io.cloudreactor.tasksymphony.wrapperio;

import java.util.Map;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/** An exception indicating that update properties could not be serialized
 * properly as JSON.
 *
 *  @author <a href="mailto:jtsay@cloudreactor.io">Jeff Tsay</a>
 *  @since 0.1.0
 */
public class MessageConversionException extends UpdateException {
  /** Create a new exception.
   *
   * @param cause The cause of the exception. May be null.
   * @param props The Map that could not be converted.
   */
  MessageConversionException(final Exception cause,
      final Map<String, Object> props) {
    super("Properties could not be converted to JSON", cause);
    this.props = props;
  }

  /** Get the property map that could not be serialized.
   *  @return the property map that could not be serialized
   *  @since 0.1.0
   */
  @SuppressFBWarnings
  public Map<String, Object> getProps() {
    return props;
  }

  private final Map<String, Object> props;
}
