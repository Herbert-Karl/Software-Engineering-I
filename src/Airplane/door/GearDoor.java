package Airplane.door;

public class GearDoor extends Door {

    private GearDoorType type;

    // constructor
    public GearDoor(String ID, GearDoorType typeOfDoor)
    {
        setGearDoor(ID, "GearDoor");
        type = typeOfDoor;
    }
}
