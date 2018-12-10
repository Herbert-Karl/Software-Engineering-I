package Airplane.door;

public class GearDoor implements IGearDoor {
    private String manufacturer;
    private GearDoorType type;
    private String id;
    private boolean isClosed;
    private boolean isLocked;

    public GearDoor(String manufacturer, GearDoorType type, String id, boolean isClosed, boolean isLocked) {
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

    public GearDoorType getType() {
        return type;
    }

    public void setType(GearDoorType type) {
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
    public void setGearDoorType(String type) {

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
