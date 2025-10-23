/**
 * This class represents a text editor which has a strategy for formatting text.
 */
public class TextEditor {
  private final ITextFormatter strategy;

  /**
   * Constructor.
   * @param strategy The strategy to format the text.
   */
  public TextEditor(ITextFormatter strategy){
    this.strategy = strategy;
  }

  /**
   * This method formats text using the editor's strategy.
   * @param text the text that is to be formatted
   * @return A string with the formatted text.
   */
  public String formatText(String text){
    return strategy.format(text);
  }
}
