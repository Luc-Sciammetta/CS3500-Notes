public class ObjectIWantToCreate {
  //variable declarations go here
  private String param1;
  private ObjectIWantToCreate(String param1){
    //this is the constructor that the builder calls
    //it is private because you don't want the programmer to call this
    //otherwise you defeat the point of a builder.

    //initialize any variables/parameters here.
    this.param1 = param1;
  }

  //Object methods go here
  public String getParam1() {
    return param1;
  }

  public static ObjectBuilder getBuilder(){
    return new ObjectBuilder();
  }

  //----------------------------------------------------------------
  //this is the builder class that builds an object
  public static class ObjectBuilder {
    //any parameters that you would put in the NewObject constructor (that you want the programmer
    //to be able to customize would go here.
    private String param1;

    //put as many of these "setter" methods as there are parameters, as this is what will allow
    //the programmer to "set" these values to what they want.
    public ObjectBuilder setParam1(String str){
      this.param1 = str;
      return this;
    }

    //this will create an object of NewObject, calling the private constructor.
    public ObjectIWantToCreate build(){
      return new ObjectIWantToCreate(param1);
    }
  }
}