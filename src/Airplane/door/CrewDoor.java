package Airplane.door;

public class CrewDoor implements ICrewDoor {
    String manufacturer;
    String type;
    String id;
    boolean isClosed;
    boolean isLocked;

    public CrewDoor(String manufacturer, String type, String id, boolean isClosed, boolean isLocked) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isClosed = isClosed;
        this.isLocked = isLocked;
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
}
