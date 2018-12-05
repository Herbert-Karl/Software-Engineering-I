package Airplane.FlightControls.AbstractClasses;

import Airplane.FlightControls.Interfaces.IVerticalRotable;

public abstract class VerticalRotable extends SteplessRotable implements IVerticalRotable {
    protected VerticalRotable(String manufacturer, String type, String id, int maxDegree, int minDegree) {
        super(manufacturer, type, id, maxDegree, minDegree);
    }

    public int down(int degree) {
        this.degree = -degree;
        if (this.degree < minDegree) {
            this.degree = minDegree;
        }
        return this.degree;
    }

    public int up(int degree) {
        this.degree = degree;
        if (this.degree > maxDegree) {
            this.degree = maxDegree;
        }
        return this.degree;
    }

    public int fullDown() {
        degree = minDegree;
        return degree;
    }

    public int fullUp() {
        degree = maxDegree;
        return degree;
    }
}
