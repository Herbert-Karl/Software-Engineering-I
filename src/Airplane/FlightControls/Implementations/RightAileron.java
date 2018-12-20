package Airplane.FlightControls.Implementations;

import Airplane.FlightControls.AbstractClasses.VerticalRotable;
import Airplane.FlightControls.Interfaces.IRightAileron;

class RightAileron extends VerticalRotable implements IRightAileron {

    public RightAileron(String manufacturer, String type) {
        super(manufacturer, type, 45, 0);
    }
}
