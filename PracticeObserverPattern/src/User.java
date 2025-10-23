public class User implements Observer{
  private String name;
  public User(String name){
    this.name = name;
  }

  @Override
  public void update(boolean status) {
    if (status) {
      System.out.println(name + " was let know that the product is in stock");
    }else{
      System.out.println(name + " was let know that the product is not in stock");
    }
  }
}
