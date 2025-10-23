public class Doctor {
  private String department;

  public void assign(String department){
    this.department = department;
    System.out.println("Assigned Doctor to "+department);
  }
}
