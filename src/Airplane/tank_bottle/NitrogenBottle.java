package Airplane.tank_bottle;

public class NitrogenBottle implements INitrogenBottle {
    private String manufacturer;
    private String type;
    private String id;
    private int capacity;
    private int currentAmount;

    public NitrogenBottle(String manufacturer, String type, String id, int currentAmount) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.currentAmount = currentAmount;
        this.capacity = 250;
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
    public void takeOut(int amount) {

    }

    @Override
    public void refill() {

    }

    @Override
    public void refill(int amount) {

    }
}
