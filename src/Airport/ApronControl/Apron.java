/*
group 17
*/

import Airport.Airport.Airport;
import Airport.Airport.ApronControl;

public class Apron{
    private Airport airport;
    private ApronControl apronControl;

    public Apron(Airport airport, ApronControl apronControl) {
        this.airport = airport;
        this.apronControl = apronControl;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public ApronControl getApronControl() {
        return apronControl;
    }

    public void setApronControl(ApronControl apronControl) {
        this.apronControl = apronControl;
    }
}