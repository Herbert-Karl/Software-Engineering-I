package FlightControls.Implementations;

import FlightControls.AbstractClasses.VerticalRotable;
import FlightControls.Interfaces.IDroopNose;

public class DroopNose extends VerticalRotable implements IDroopNose {

    public DroopNose(String manufacturer, String type, String id) {
        super(manufacturer, type, id, 0, -45);
    }
}
