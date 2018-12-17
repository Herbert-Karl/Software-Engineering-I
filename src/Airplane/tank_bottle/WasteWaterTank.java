package Airplane.tank_bottle;

public class WasteWaterTank implements IWasteWaterTank {
    private String manufacturer;
    private String type;
    private String id;
    private int capacity;
    private boolean isLocked;

    public WasteWaterTank(String manufacturer, String type, String id, boolean isLocked) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isLocked = isLocked;
        this.capacity = 1000;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    @Override
    public String version() {
        return "<" + id + "> - <" + type + ">";
    }

    @Override
    public void lock() {
        this.isLocked = true;
    }

    @Override
    public void unlock() {
        this.isLocked = false;
    }

    @Override
    public void add(int amount) {
        if (this.capacity >= amount) {
            this.capacity -= amount;
        }
    }

    @Override
    public void pumpOut() {
        this.capacity = 1000;
    }
}
