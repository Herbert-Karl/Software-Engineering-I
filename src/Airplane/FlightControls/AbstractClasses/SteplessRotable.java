package Airplane.FlightControls.AbstractClasses;

import Airplane.FlightControls.Interfaces.ISteplessRotable;

abstract class SteplessRotable extends FlightControl implements ISteplessRotable {
    final int maxDegree;
    final int minDegree;

    SteplessRotable(String manufacturer, String type, String id, int maxDegree, int minDegree) {
        super(manufacturer, type, id);
        this.maxDegree = maxDegree;
        this.minDegree = minDegree;
    }

}
