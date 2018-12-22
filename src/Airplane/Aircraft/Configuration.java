package Airplane.Aircraft;

public class Configuration {
    protected int numberOfEngines;
    protected int numberOfFirstClassSeat;
    protected int numberOfBusinessClassSeat;
    protected int numberOfTouristSeat;
    protected int numberOfCrewSeat;

    public Configuration(int numberOfEngines, int numberOfFirstClassSeat, int numberOfBusinessClassSeat, int numberOfTouristSeat,
                         int numberOfCrewSeat) {

        this.numberOfFirstClassSeat = numberOfFirstClassSeat;
        this.numberOfBusinessClassSeat = numberOfBusinessClassSeat;
        this.numberOfTouristSeat = numberOfTouristSeat;
        this.numberOfCrewSeat = numberOfCrewSeat;
    }

}