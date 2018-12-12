package Airplane.seat;

import Airport.base.Passenger;

public class TouristClassSeat extends Seat implements ITouristClassSeat {
    public TouristClassSeat(String manufacturer, String type, String id, Passenger passenger, int level, INonSmokingSign nonSmokingSign, ISeatBeltSign seatBeltSign) {
        super(manufacturer, type, id, passenger, level, nonSmokingSign, seatBeltSign);
    }

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
