package Airplane.tank_bottle;

public class DeIcingSystem implements IDeIcingSystem {
    private String manufacturer;
    private String type;
    private String id;
    private int capacity;
    private boolean isActivated;
    private int currentAmount;

    public DeIcingSystem(String manufacturer, String type, String id, boolean isActivated, int currentAmount) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isActivated = isActivated;
        this.currentAmount = currentAmount;
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

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void activate() {

    }

    @Override
    public void deIce(int amount) {

    }

    @Override
    public void refill() {

    }

    @Override
    public void deactivate() {

    }
}
