import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{
  private String name;
  private boolean inStock;
  private List<Observer> observers;

  public Product(String name, boolean inStock){
    this.name = name;
    this.inStock = inStock;
    observers = new ArrayList<>();
  }

  /**
   * Switches the status of the product's stock value
   */
  public void switchStockStatus(boolean status){
    inStock = status;
    notifyObservers(); //notifies all of the observers that this has changed
  }

  /**
   * adds an observer so that they can be notified about this product
   */
  @Override
  public void addObserver(Observer o) {
    observers.add(o);
  }

  /**
   * removes an observer so that they can stop being notified about this product
   */
  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  /**
   * notifies all observers about this product using the user's .update() method.
   */
  @Override
  public void notifyObservers() {
    for (Observer o : observers){
      o.update(inStock);
    }
  }
}
