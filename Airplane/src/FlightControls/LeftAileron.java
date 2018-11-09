package FlightControls;

import FlightControls.Interfaces.ILeftAileron;

public class LeftAileron extends FlightControl implements ILeftAileron {

    private int MaxDegree = 45;

    public LeftAileron(String manufacturer, String type, String id) {
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

    public int fullUp() {
        degree = MaxDegree;
        return degree;
    }
}
