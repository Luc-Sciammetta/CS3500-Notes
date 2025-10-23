/**
 * This interface represents a coffee with functionality of getting it's description and cost
 */
public interface Coffee {
  /**
   * Gets the description of the coffee
   * @return A string containing what's in the coffee
   */
  String getDescription();

  /**
   * Gets the cost of the coffee
   * @return a double which is the cost of the coffee
   */
  double getCost();
}
