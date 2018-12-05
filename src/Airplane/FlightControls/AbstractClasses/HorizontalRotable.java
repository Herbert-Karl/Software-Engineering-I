package Airplane.FlightControls.AbstractClasses;

import Airplane.FlightControls.Interfaces.IHorizontalRotable;

public abstract class HorizontalRotable extends SteplessRotable implements IHorizontalRotable {
    protected HorizontalRotable(String manufacturer, String type, String id, int maxDegree, int minDegree) {
        super(manufacturer, type, id, maxDegree, minDegree);
    }

    public int left(int degree) {
        this.degree = -degree;
        if (this.degree < minDegree) {
            this.degree = minDegree;
        }
        return this.degree;
    }

    public int right(int degree) {
        this.degree = degree;
        if (this.degree > maxDegree) {
            this.degree = maxDegree;
        }
        return this.degree;
    }

    public int fullLeft() {
        degree = minDegree;
        return degree;
    }

    public int fullRight() {
        degree = maxDegree;
        return degree;
    }
}
