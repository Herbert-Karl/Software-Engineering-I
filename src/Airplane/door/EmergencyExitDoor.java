package Airplane.door;

public class EmergencyExitDoor implements IEmergencyExitDoor {
    private String manufacturer;
    private String type;
    private String id;
    private boolean isClosed;
    private boolean isLocked;
    private boolean isEscapeSlideActivated;

    public EmergencyExitDoor(String manufacturer, String type, String id, boolean isClosed, boolean isLocked, boolean isEscapeSlideActivated) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isClosed = isClosed;
        this.isLocked = isLocked;
        this.isEscapeSlideActivated = isEscapeSlideActivated;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isEscapeSlideActivated() {
        return isEscapeSlideActivated;
    }

    public void setEscapeSlideActivated(boolean escapeSlideActivated) {
        isEscapeSlideActivated = escapeSlideActivated;
    }

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
