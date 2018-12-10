package Airplane.door;

public interface IGearDoor {
    String version();
    void setGearDoorType(String type);
    void close();
    void lock();
    void unlock();
    void open();
}
