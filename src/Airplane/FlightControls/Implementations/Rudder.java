package Airplane.FlightControls.Implementations;

import Airplane.FlightControls.AbstractClasses.HorizontalRotable;
import Airplane.FlightControls.Interfaces.IRudder;

class Rudder extends HorizontalRotable implements IRudder {
    public Rudder(String manufacturer, String type) {
        super(manufacturer, type, 45, 0);
    }
}
