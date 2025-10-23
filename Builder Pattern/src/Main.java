class Main {
  public static void main(String[] args) {
    ObjectIWantToCreate newObject = ObjectIWantToCreate.getBuilder()
            .setParam1("Hello this is param 1")
            .build();

    System.out.println(newObject.getParam1());

  }
}