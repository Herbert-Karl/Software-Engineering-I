package Airplane.FlightControls.Implementations;

import Airplane.FlightControls.AbstractClasses.VerticalRotable;
import Airplane.FlightControls.Interfaces.IElevator;

class Elevator extends VerticalRotable implements IElevator {

    public Elevator(String manufacturer, String type, String id) {
        super(manufacturer, type, id, 45, -45);
    }
}
