/**
 * An abstract class that houses the core functionality of a decorator
 */
public abstract class CoffeeDecorator implements Coffee{
  private final Coffee current; // the coffee being decorated

  /**
   * Constructor for the CoffeeDecorator
   * @param current the coffee to be decorated
   */
  public CoffeeDecorator(Coffee current){
    this.current = current;
  }

  /**
   * Gets the description of the coffee
   * @return A string containing the description of the coffee
   */
  @Override
  public String getDescription() {
    return current.getDescription(); // this calls back to itself kinda like recursion
  }

  /**
   * Gets the cost of the coffee
   * @return a double which is the cost of the coffee
   */
  @Override
  public double getCost() {
    return current.getCost(); // this calls back to itself kinda like recursion
  }
}
