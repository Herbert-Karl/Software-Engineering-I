package FlightControls.AbstractClasses;

import FlightControls.Interfaces.IFlightControl;

public abstract class FlightControl implements IFlightControl {
    protected int degree;
    private String manufacturer;
    private String type;
    private String id;


    public FlightControl(String manufacturer, String type, String id) {
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
