package FlightControls.Implementations;

import FlightControls.AbstractClasses.VerticalRotable;
import FlightControls.Interfaces.ILeftAileron;

public class LeftAileron extends VerticalRotable implements ILeftAileron {

    public LeftAileron(String manufacturer, String type, String id) {
        super(manufacturer, type, id, 45, 0);
        this.degree = 0;
    }
}
