package Airplane.door;

public class EmergencyExitDoor extends Door {

    private boolean isEscapeSlideActivated;

    public EmergencyExitDoor(String ID, String typeOfDoor)
    {
        setDoor(ID,"EmergencyExitDoor", typeOfDoor);
        isEscapeSlideActivated = false;
    }

    //Activates the EscapeSlide (even if it´s already active)
    public void activateEscapeSlide()
    {
        isEscapeSlideActivated = true;
    }
}
