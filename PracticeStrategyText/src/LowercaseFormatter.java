/**
 * This class makes text lowercase.
 */
public class LowercaseFormatter implements ITextFormatter{
  /**
   * This method makes all of the inputted text to lowercase
   * @param text the text that is to be formatted.
   * @return a formatted string where all of the text is lowercase.
   */
  @Override
  public String format(String text) {
    return text.toLowerCase();
  }
}
