package FlightControls;

import FlightControls.Interfaces.IFlightControl;

public abstract class FlightControl implements IFlightControl {
    private String manufacturer;
    private String type;
    private String id;
    protected int degree;

    FlightControl(String manufacturer, String type, String id) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.degree = 0;
    }

    public int neutral() {
        degree = 0;
        return degree;
    }

    public String version() {
        return id + "(" + type + " : " + manufacturer + ")";
    }
}
