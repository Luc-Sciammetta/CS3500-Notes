/**
 * Represents a basic coffee
 */
public class BasicCoffee implements Coffee{
  /**
   * Gets the description of this coffee
   * @return A string of the description
   */
  @Override
  public String getDescription() {
    return "A Basic Coffee"; //this is the base description
  }

  /**
   * Gets the cost of this coffee
   * @return the cost of this coffee
   */
  @Override
  public double getCost() {
    return 2.0; //this is the base price
  }
}
