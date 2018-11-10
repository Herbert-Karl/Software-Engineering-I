package FlightControls.AbstractClasses;

import FlightControls.Interfaces.ISteplessRotable;

abstract class SteplessRotable extends FlightControl implements ISteplessRotable {
    int maxDegree;
    int minDegree;

    SteplessRotable(String manufacturer, String type, String id, int maxDegree, int minDegree) {
        super(manufacturer, type, id);
        this.maxDegree = maxDegree;
        this.minDegree = minDegree;
    }

}
