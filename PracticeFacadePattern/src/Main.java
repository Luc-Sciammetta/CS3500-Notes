public class Main {
  public static void main(String[] args) {
    /**
     * Here what the coder will see is only teh admit patient method. They wont see any of the reception/doctor/billing/roomService methods
     * They also dont need to worry about it either
     */
    HospitalFacade facade = new HospitalFacade();
    facade.admitPatient("Joe", 1, "dentistry");
    facade.admitPatient("Mary", 2, "emergency room");
  }
}