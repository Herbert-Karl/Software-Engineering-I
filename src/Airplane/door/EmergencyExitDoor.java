package Airplane.door;

public class EmergencyExitDoor implements IEmergencyExitDoor {
    private String manufacturer;
    private String type;
    private String id;
    private boolean isClosed;
    private boolean isLocked;
    private boolean isEscapeSlideActivated;

    @Override
    public String version() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void lock() {

    }

    @Override
    public void unlock() {

    }

    @Override
    public void open() {

    }

    @Override
    public void activateEscapeSlide() {

    }
}
