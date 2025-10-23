/**
 * This class is a decorator for adding sugar to a coffee.
 * It extends the CoffeeDecorator class.
 */
public class SugarDecorator extends CoffeeDecorator{
  /**
   * Constructor for the SugarDecorator
   * @param addon the coffee to be decorated with sugar
   */
  public SugarDecorator(Coffee addon){
    super(addon);
  }

  /**
   * Gets the description of the coffee with sugar added
   * @return A string containing the description of the coffee with sugar
   */
  @Override
  public String getDescription(){
    return super.getDescription() + " + Sugar";
  }
  /**
   * Gets the cost of the coffee with sugar added
   * @return a double which is the cost of the coffee with sugar
   */
  @Override
  public double getCost(){
    return super.getCost() + 0.25;
  }
}
