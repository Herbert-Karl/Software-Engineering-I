package Airplane.Aircraft;

public class Configuration extends Body {
    protected int numberOfEngines;
    protected int numberOfFirstClassSeat;
    protected int numberOfBusinessClassSeat;
    protected int numberOfTouristSeat;
    protected int numberOfCrewSeat;


    public Configuration(Airplane airplane) {
        super(airplane);
    }
}