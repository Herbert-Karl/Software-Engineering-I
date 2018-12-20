package Airplane.door;

public class EmergencyExitDoor extends Door {

    private boolean isEscapeSlideActivated;

    // constructor
    public EmergencyExitDoor()
    {
        super("EmergencyExitDoor");
        isEscapeSlideActivated = false;
    }

    //Activates the EscapeSlide (even if it´s already active)
    public void activateEscapeSlide()
    {
        isEscapeSlideActivated = true;
    }
}
