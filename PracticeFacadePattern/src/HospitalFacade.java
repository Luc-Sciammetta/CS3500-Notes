import java.util.ArrayList;
import java.util.List;

/**
 * This hides the complexity of the hospital system by providing a simple class
 * The user can interact with this class without needing to know the details of how the system works.
 */
public class HospitalFacade {

  private Reception reception; // Handles patient registration
  private List<Doctor> doctors; // List of doctors in the hospital
  private Billing billing; // Handles billing for patients
  private RoomService roomService; // Handles room allocation for patients

  public HospitalFacade(){
    reception = new Reception();
    doctors = new ArrayList<>();
    billing = new Billing();
    roomService = new RoomService();
  }

  /**
   * This method allows the user to admit a patient without needing to know the details of how the system works.
   * All the necessary steps are handled internally by the facade.
   */
  public void admitPatient(String name, int id, String department){
    reception.registerPatient(name);
    Doctor doc = new Doctor();
    doc.assign(department);
    doctors.add(doc);
    billing.generateBill(id);
    roomService.allocateRoom(id);
  }
}
