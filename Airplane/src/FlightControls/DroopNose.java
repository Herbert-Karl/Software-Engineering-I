package FlightControls;

import FlightControls.Interfaces.IDroopNose;

public class DroopNose extends FlightControl implements IDroopNose{
    private int MaxDegree = 45;

    public DroopNose(String manufacturer, String type, String id) {
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
