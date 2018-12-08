package Airplane.FlightControls.Implementations;

import Airplane.FlightControls.AbstractClasses.HorizontalRotable;
import Airplane.FlightControls.Interfaces.IRudder;

class Rudder extends HorizontalRotable implements IRudder {
    public Rudder(String manufacturer, String type, String id) {
        super(manufacturer, type, id, 45, 0);
    }
}
