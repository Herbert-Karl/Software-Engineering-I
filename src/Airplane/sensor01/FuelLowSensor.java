package Airplane.sensor01;

public class FuelLowSensor implements IFuelLowSensor {
    private String manufacturer;
    private String type;
    private String id;
    private int fuelFlow;

    public FuelLowSensor(String manufacturer, String type, String id, int fuelFlow) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.fuelFlow = fuelFlow;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void measure() {

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

    public int getFuelFlow() {
        return fuelFlow;
    }

    public void setFuelFlow(int fuelFlow) {
        this.fuelFlow = fuelFlow;
    }
}
