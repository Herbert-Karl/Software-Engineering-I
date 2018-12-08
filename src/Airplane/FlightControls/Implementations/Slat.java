package Airplane.FlightControls.Implementations;

import Airplane.FlightControls.AbstractClasses.VerticalRotable;
import Airplane.FlightControls.Interfaces.ISlat;

class Slat extends VerticalRotable implements ISlat {

    public Slat(String manufacturer, String type, String id) {
        super(manufacturer, type, id, 0, -45);
    }
}
