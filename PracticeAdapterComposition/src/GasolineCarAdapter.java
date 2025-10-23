/**
 * This is the adapter (Object adapter), that uses COMPOSITION to adapt
 *
 * If i wanted to have the gasolinecaradapter to be able to be used wherever a gasoline car can be
 * i would also implement IGasolineCar. but do this lightly as this increases coupling
 */
public class GasolineCarAdapter implements IElectricCar{
  private final IGasolineCar gasolineCar; //what we want to adapt
  public GasolineCarAdapter(IGasolineCar car){
    this.gasolineCar = car;
  }

  /**
   * This method does the adapting. It calls our fill up method in the charge() method, so that
   * we can use the charge() method and still fill up the gas tank
   */
  @Override
  public void charge() {
    gasolineCar.fillUp();
  }
}
