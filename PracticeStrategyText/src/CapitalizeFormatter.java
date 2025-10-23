/**
 * This class capitalizes the first letter of a block of text.
 */
public class CapitalizeFormatter implements ITextFormatter{
  /**
   * This method makes the first letter capitalized, and the rest in lowercase.
   * @param text the text that is to be formatted.
   * @return A String containing the formatted text.
   */
  @Override
  public String format(String text) {
    String firstLetter = text.substring(0, 1);
    String rest = text.substring(1);
    return firstLetter.toUpperCase() + rest.toLowerCase();
  }
}
