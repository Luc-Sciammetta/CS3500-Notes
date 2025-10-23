/**
 * A decorator for adding milk to a coffee
 */
public class MilkDecorator extends CoffeeDecorator{
  /**
   * Constructor for the MilkDecorator
   * @param addon the coffee to be decorated with milk
   */
  public MilkDecorator(Coffee addon){
    super(addon); // calls the constructor of CoffeeDecorator with the coffee to be decorated
  }

  /**
   * Gets the description of the coffee with milk added
   * @return A string containing the description of the coffee with milk
   */
  @Override
  public String getDescription(){
    return super.getDescription() + " + Milk";
  }

/**
   * Gets the cost of the coffee with milk added
   * @return a double which is the cost of the coffee with milk
   */
  @Override
  public double getCost(){
    return super.getCost() + 0.5;
  }
}
