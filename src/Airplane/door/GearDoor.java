package Airplane.door;

public class GearDoor extends Door {

    // constructor - converts GearDoorType to String for version()!
    public GearDoor(GearDoorType typeOfDoor)
    {
        super(typeOfDoor.toString());
    }
}