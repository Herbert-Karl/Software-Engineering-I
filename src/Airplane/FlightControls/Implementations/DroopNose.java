package Airplane.FlightControls.Implementations;

import Airplane.FlightControls.AbstractClasses.VerticalRotable;
import Airplane.FlightControls.Interfaces.IDroopNose;

class DroopNose extends VerticalRotable implements IDroopNose {

    public DroopNose(String manufacturer, String type, String id) {
        super(manufacturer, type, id, 0, -45);
    }
}
