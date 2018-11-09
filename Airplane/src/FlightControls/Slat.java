package FlightControls;

import FlightControls.Interfaces.ISlat;

public class Slat extends FlightControl implements ISlat {
    private int MaxDegree = 45;

    public Slat(String manufacturer, String type, String id) {
        super(manufacturer, type, id);
        this.degree = 0;
    }

    public int down(int degree) {
        this.degree -= degree;
        if (this.degree < -MaxDegree) {
            this.degree = -MaxDegree;
        }
        return this.degree;
    }

    public int up(int degree) {
        this.degree += degree;
        if (this.degree > MaxDegree) {
            this.degree = MaxDegree;
        }
        return this.degree;
    }

    public int fullDown() {
        degree = -MaxDegree;
        return degree;
    }
}
