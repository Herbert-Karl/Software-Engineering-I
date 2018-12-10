package Airplane.door;

public interface IEmergencyExitDoor {
    String version();
    void close();
    void lock();
    void unlock();
    void open();
    void activateEscapeSlide();
}
