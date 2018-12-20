package Airplane.FlightControls.AbstractClasses;

import Airplane.FlightControls.Interfaces.IFlightControl;
import Core.Versionable;

public abstract class FlightControl extends Versionable implements IFlightControl{
    protected int degree;


    protected FlightControl(String manufacturer, String type) {
        super(type, manufacturer);
        this.degree = 0;
    }

    public int neutral() {
        degree = 0;
        return degree;
    }
}
