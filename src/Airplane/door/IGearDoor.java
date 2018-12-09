package Airplane.door;

public interface IGearDoor {
    public String version();

    public void setGearDoorType(String type); // war vorher GearDoorType

    public void close(); // war vorher boolean

    public void lock(); // war vorher boolean

    public void unlock(); // war vorher boolean

    public void open(); // war vorher boolean
}
