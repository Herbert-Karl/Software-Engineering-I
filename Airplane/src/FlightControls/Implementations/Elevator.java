package FlightControls.Implementations;

import FlightControls.AbstractClasses.VerticalRotable;
import FlightControls.Interfaces.IElevator;

public class Elevator extends VerticalRotable implements IElevator {

    public Elevator(String manufacturer, String type, String id) {
        super(manufacturer, type, id, 45, -45);
    }
}
