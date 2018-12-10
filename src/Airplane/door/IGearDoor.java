package Airplane.door;

public interface IGearDoor {
    String version();

    void setGearDoorType(String type); // war vorher GearDoorType

    void close(); // war vorher boolean

    void lock(); // war vorher boolean

    void unlock(); // war vorher boolean

    void open(); // war vorher boolean
}
