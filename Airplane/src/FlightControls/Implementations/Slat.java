package FlightControls.Implementations;

import FlightControls.AbstractClasses.VerticalRotable;
import FlightControls.Interfaces.ISlat;

public class Slat extends VerticalRotable implements ISlat {

    public Slat(String manufacturer, String type, String id) {
        super(manufacturer, type, id, 0, -45);
    }
}
