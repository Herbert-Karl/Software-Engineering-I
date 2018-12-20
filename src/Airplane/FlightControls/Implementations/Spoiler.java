package Airplane.FlightControls.Implementations;

import Airplane.FlightControls.AbstractClasses.VerticalRotable;
import Airplane.FlightControls.Interfaces.ISpoiler;

class Spoiler extends VerticalRotable implements ISpoiler {
    public Spoiler(String manufacturer, String type) {
        super(manufacturer, type, 45, 0);
    }
}
