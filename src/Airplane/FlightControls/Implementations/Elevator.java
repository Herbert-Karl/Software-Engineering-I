package Airplane.FlightControls.Implementations;

import Airplane.FlightControls.AbstractClasses.VerticalRotable;
import Airplane.FlightControls.Interfaces.IElevator;

class Elevator extends VerticalRotable implements IElevator {

    public Elevator(String manufacturer, String type) {
        super(manufacturer, type, 45, -45);
    }
}
