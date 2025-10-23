public class Main {
  public static void main(String[] args) {
    Product phone = new Product("IPhone 17", false);
    Observer person1 = new User("Joe");
    Observer person2 = new User("Mary");
    Observer person3 = new User("Felix");

    //you can add observers
    phone.addObserver(person1);
    phone.addObserver(person2);
    phone.addObserver(person3);

    phone.switchStockStatus(true);
    phone.removeObserver(person3); //you can remove observers
    phone.switchStockStatus(false);
  }
}