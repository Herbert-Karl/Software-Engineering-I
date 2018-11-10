package FlightControls.Implementations;

import FlightControls.AbstractClasses.VerticalRotable;
import FlightControls.Interfaces.IRightAileron;

public class RightAileron extends VerticalRotable implements IRightAileron {

    public RightAileron(String manufacturer, String type, String id) {
        super(manufacturer, type, id, 45, 0);
    }
}
