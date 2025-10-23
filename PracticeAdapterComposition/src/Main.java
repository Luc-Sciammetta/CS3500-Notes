import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    IElectricCar car1 = new ElectricCar(); //electric car1
    IElectricCar car2 = new ElectricCar(); //electric car 2
    IGasolineCar car3 = new GasolineCar(); //gas powered car

    GasolineCarAdapter adaptedCar3 = new GasolineCarAdapter(car3); //this adapts the gas powered
    // car into an electric car so that we can call the .charge() method on it (in the for loop)

    List<IElectricCar> listOfCars = new ArrayList<>();
    listOfCars.add(car1);
    listOfCars.add(car2);
    listOfCars.add(adaptedCar3);

    for (IElectricCar listOfCar : listOfCars) {
      listOfCar.charge(); //this method can be called on all cars now
      //keep in mind that for the gas car, it wont't say charged to 100%, but will say it filled
      //the tank up
    }
  }
}