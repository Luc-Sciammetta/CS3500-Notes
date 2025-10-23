/**
 * This shows how to make a factory w/ 2 products and 2 product factories
 * The same can be done with interfaces, but this implementation is done with abstract classes
 */
public class Factories {
  abstract class Product{
    /**
     * This is where you'll put any methods that you want both of your products to have
     */
    public abstract void someProductFunctionality();
  }

  public class ProductA extends Product{ //product A
    @Override
    public void someProductFunctionality(){
      System.out.println("Something here...");
    }
  }

  public class ProductB extends Product{ //product B
    @Override
    public void someProductFunctionality(){
      System.out.println("Something also goes here...");
    }
  }

  /**
   * An abstract class that says how a factory should be made
   */
  abstract class Factory{ 
    public abstract Product createProduct();
  }

  public class ProductAFactory extends Factory{
    /**
     * This is where you actually create the product A object
     * @return
     */
    @Override
    public Product createProduct() {
      return new ProductA();
    }
  }

  public class ProductBFactory extends Factory{
    /**
     * and this is where you actually create the product B object
     * @return
     */
    @Override
    public Product createProduct() {
      return new ProductB();
    }
  }

  public void main(String[] args){
    /**
     * This is how calling the factory and creating the object actually looks like.
     */
    Factory myFactory = new ProductAFactory();
    Product myA = myFactory.createProduct();
    myA.someProductFunctionality();

    Factory myFactoryB = new ProductBFactory();
    Product myB = myFactoryB.createProduct();
    myB.someProductFunctionality();
  }
}
