package Airplane.seat;

public class CrewSeat implements ICrewSeat {
    private String manufacturer;
    private String type;
    private String id;
    private IReadingLight readingLight;

    @Override
    public String version() {
        return null;
    }

    @Override
    public void readingLightOff() {

    }

    @Override
    public void readingLightOn() {

    }
}
