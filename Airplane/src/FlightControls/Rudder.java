package FlightControls;

import FlightControls.Interfaces.IRudder;

public class Rudder extends FlightControl implements IRudder {
    private int MaxDegree = 45;
    public Rudder(String manufacturer, String type, String id) {
        super(manufacturer, type, id);
        this.degree = 0;
    }

    public int left(int degree) {
        this.degree -= degree;
        if (this.degree < -MaxDegree) {
            this.degree = -MaxDegree;
        }
        return this.degree;
    }

    public int right(int degree) {
        this.degree += degree;
        if (this.degree > MaxDegree) {
            this.degree = MaxDegree;
        }
        return this.degree;
    }

    public int fullLeft() {
        degree = -MaxDegree;
        return degree;
    }

    public int fullRight() {
        degree = MaxDegree;
        return degree;
    }
}
