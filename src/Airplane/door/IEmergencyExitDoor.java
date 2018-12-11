package Airplane.door;

public interface IEmergencyExitDoor {
    String version();

    void close(); // war vorher boolean

    void lock(); // war vorher boolean

    void unlock(); // war vorher boolean

    void open(); // war vorher boolean

    void activateEscapeSlide(); // war vorher boolean
}
