import java.util.ArrayList;
import java.util.List;

public class Reception {
  private List<String> patients = new ArrayList<>();

  public void registerPatient(String name){
    patients.add(name);
    System.out.println("Registered "+name);
  }
}
