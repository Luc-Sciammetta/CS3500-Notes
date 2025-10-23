
public class Main {
  public static void main(String[] args) {
    TextEditor editor1 = new TextEditor(new UppercaseFormatter());
    System.out.println(editor1.formatText("hello"));
    TextEditor editor2 = new TextEditor(new LowercaseFormatter());
    System.out.println(editor2.formatText("HELLOOOO"));
    TextEditor editor3 = new TextEditor(new CapitalizeFormatter());
    System.out.println(editor3.formatText("pIZZA"));

    //hybrid strategy
    TextEditor editor4 = new TextEditor(new CapitalizeWord());
    System.out.println(editor4.formatText("hELLO wORLD i lIKE pIZZA"));
  }
}