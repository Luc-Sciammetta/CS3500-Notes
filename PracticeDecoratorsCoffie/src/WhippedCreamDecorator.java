/**
 * This class is a decorator for adding sugar to a coffee.
 * It extends the CoffeeDecorator class.
 */
public class WhippedCreamDecorator extends CoffeeDecorator{
  /**
   * Constructor for the WhippedCreamDecorator
   * @param addon the coffee to be decorated with whipped cream
   */
  public WhippedCreamDecorator(Coffee addon){
    super(addon);
  }

  /**
   * Gets the description of the coffee with whipped cream added
   * @return A string containing the description of the coffee with whipped cream
   */
  @Override
  public String getDescription(){
    return super.getDescription() + " + Whipped Cream";
  }
  /**
   * Gets the cost of the coffee with whipped cream added
   * @return a double which is the cost of the coffee with whipped cream
   */
  @Override
  public double getCost(){
    return super.getCost() + 0.25;
  }
}
