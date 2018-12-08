package Airplane.seat;

public class BusinessClassSeat implements IBusinessClassSeat {
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
}
