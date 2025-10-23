/**
 * This class formats text by making all of the text uppercase.
 */
public class UppercaseFormatter implements ITextFormatter{
  /**
   * This method makes all of the text uppercase.
   * @param text the text that is to be formatted.
   * @return a String with all uppercase text.
   */
  @Override
  public String format(String text) {
    return text.toUpperCase();
  }
}
