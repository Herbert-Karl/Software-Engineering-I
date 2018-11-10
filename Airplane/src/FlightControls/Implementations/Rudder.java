package FlightControls.Implementations;

import FlightControls.AbstractClasses.HorizontalRotable;
import FlightControls.Interfaces.IRudder;

public class Rudder extends HorizontalRotable implements IRudder {
    public Rudder(String manufacturer, String type, String id) {
        super(manufacturer, type, id, 45, 0);
    }
}
