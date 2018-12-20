package Airplane.FlightControls.AbstractClasses;

import Airplane.FlightControls.Interfaces.ISteplessRotable;

abstract class SteplessRotable extends FlightControl implements ISteplessRotable {
    final int maxDegree;
    final int minDegree;

    SteplessRotable(String manufacturer, String type, int maxDegree, int minDegree) {
        super(manufacturer, type);
        this.maxDegree = maxDegree;
        this.minDegree = minDegree;
    }

}
