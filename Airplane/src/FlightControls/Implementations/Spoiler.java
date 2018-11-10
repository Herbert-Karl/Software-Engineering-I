package FlightControls.Implementations;

import FlightControls.AbstractClasses.VerticalRotable;
import FlightControls.Interfaces.ISpoiler;

public class Spoiler extends VerticalRotable implements ISpoiler {
    public Spoiler(String manufacturer, String type, String id) {
        super(manufacturer, type, id, 45, 0);
    }
}
