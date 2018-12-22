/*
group 17
*/
package Airport.ApronControl;
import Airport.Airport.Airport;


public class Apron{
    private Airport airport;
    private ApronControl apronControl;

    public Apron(Airport airport, ApronControl apronControl) {
        this.airport = airport;
        this.apronControl = apronControl;
    }

    public Apron(){}

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