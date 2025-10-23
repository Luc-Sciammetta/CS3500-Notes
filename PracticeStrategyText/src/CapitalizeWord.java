/**
 * This class formats text by capitalizing the first letter of every word (and making the rest
 * lowercase)
 * This is a HYBRID between CapitalizeFormatter and LowercaseFormatter
 */
public class CapitalizeWord implements ITextFormatter{
  /**
   * This method capitalized the first word in a block of text
   * @param text the text that is to be formatted.
   * @return A string containing the formatted text
   */
  @Override
  public String format(String text) {
    ITextFormatter lowercase = new LowercaseFormatter();
    ITextFormatter capitalize = new CapitalizeFormatter();
    String[] words = text.split(" ");
    StringBuilder finalText = new StringBuilder();
    for (String word : words){
      word = lowercase.format(word);
      word = capitalize.format(word);
      finalText.append(word).append(" ");
    }
    return finalText.toString();
  }
}
