package Airport.Airport;

public class Apron{
    Airport airport;
    ApronControl apronControl;

    public Apron(Airport airport, ApronControl apronControl){
        this.airport = airport;
        this.apronControl = apronControl;
    }
}