package FlightControls;

import FlightControls.Interfaces.ISpoiler;

public class Spoiler extends FlightControl implements ISpoiler {
    private int MaxDegree = 45;

    public Spoiler(String manufacturer, String type, String id) {
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

    public int fullUp() {
        degree = +MaxDegree;
        return degree;
    }
}
