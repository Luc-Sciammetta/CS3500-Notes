public class Main {
  public static void main(String[] args) {
    Coffee myCoffee = new BasicCoffee();
    myCoffee = new MilkDecorator(myCoffee);
    myCoffee = new SugarDecorator(myCoffee);
    myCoffee = new WhippedCreamDecorator(myCoffee);
    System.out.println(myCoffee.getDescription());
    System.out.println(myCoffee.getCost());

    //you can stack decorators of the same type
    Coffee marcusCoffee = new BasicCoffee();
    marcusCoffee = new SugarDecorator(marcusCoffee);
    marcusCoffee = new SugarDecorator(marcusCoffee);
    marcusCoffee = new SugarDecorator(marcusCoffee);
    marcusCoffee = new MilkDecorator(marcusCoffee);
    System.out.println(marcusCoffee.getDescription());
    System.out.println(marcusCoffee.getCost());

    Coffee crazyCoffee = new BasicCoffee();
    for (int i = 0; i < 1811; i++) {
      crazyCoffee = new WhippedCreamDecorator(crazyCoffee);
      crazyCoffee = new WhippedCreamDecorator(crazyCoffee);
      crazyCoffee = new WhippedCreamDecorator(crazyCoffee);
      crazyCoffee = new WhippedCreamDecorator(crazyCoffee);
      crazyCoffee = new WhippedCreamDecorator(crazyCoffee);
    }
    System.out.println(crazyCoffee.getDescription());
    System.out.println(crazyCoffee.getCost());
  }
}