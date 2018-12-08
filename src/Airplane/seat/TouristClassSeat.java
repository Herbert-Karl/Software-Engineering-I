package Airplane.seat;

public class TouristClassSeat implements ITouristClassSeat {
    private String manufacturer;
    private String type;
    private String id;
    private Passenger passenger;
    private int level;
    private INonSmokingSign nonSmokingSign;
    private ISeatBeltSign seatBeltSign;

    @Override
    public String version() {
        return null;
    }

    @Override
    public void assign(Passenger passenger) {

    }

    @Override
    public void upRight() {

    }

    @Override
    public void level1() {

    }
}
