package Airplane.door;

public interface ICrewDoor {
    String version();

    void close(); // war vorher boolean

    void lock(); // war vorher boolean

    void unlock(); // war vorher boolean

    void open(); // war vorher boolean
}
