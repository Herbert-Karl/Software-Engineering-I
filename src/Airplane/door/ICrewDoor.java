package Airplane.door;

public interface ICrewDoor {
    String version();
    void close();
    void lock();
    void unlock();
    void open();
}

