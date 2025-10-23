import java.util.List;

public class Main {
  public static void main(String[] args) {
    IDigitalCamera cam1 = new DigitalCamera(); //make a digital camera
    IFilmCamera cam2 = new FilmCamera(); //make a film camera
    CameraAdapter camAdapter = new CameraAdapter(cam2); //adapt the film camera to digital

    List<IDigitalCamera> lst = List.of(cam1, camAdapter);
    for (IDigitalCamera cam : lst){
      cam.takePhoto(); //take a photo with each camera
    }

    //keep in mind that the camera adapter has access to both take photo methods and they have the same output
    camAdapter.takePhoto();
    camAdapter.snapPicture();
  }
}