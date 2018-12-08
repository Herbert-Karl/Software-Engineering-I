package Airplane.seat;

public class FirstClassSeat implements IFirstClassSeat {
    private String manufacturer;
    private String type;
    private String id;
    private Passenger passenger;
    private int level;
    private INonSmokingSign nonSmokingSign;
    private ISeatBeltSign seatBeltSign;
    private IReadingLight readingLight;

    @Override
    public String version() {
        return null;
    }

    @Override
    public void assign(Passenger passenger) {

    }

    @Override
    public void readingLightOff() {

    }

    @Override
    public void readingLightOn() {

    }

    @Override
    public void upRight() {

    }

    @Override
    public void level1() {

    }

    @Override
    public void level2() {

    }

    @Override
    public void level3() {

    }

    @Override
    public void flat() {

    }
}
