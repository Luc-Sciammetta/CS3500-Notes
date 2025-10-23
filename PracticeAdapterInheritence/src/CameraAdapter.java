/**
 * An adapter for a film camera that allows it to be used as a digital camera.
 */
public class CameraAdapter extends FilmCamera implements IDigitalCamera{
  private final IFilmCamera filmCamera; // The film camera being adapted
  public CameraAdapter(IFilmCamera camera){
    filmCamera = camera;
  }

  /**
   * Takes a photo using the film camera's snapping mechanism.
   */
  @Override
  public void takePhoto() {
    filmCamera.snapPicture();
  }
}
