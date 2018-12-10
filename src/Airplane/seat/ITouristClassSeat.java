package Airplane.seat;

import Airport.base.Passenger;

public interface ITouristClassSeat {
    String version();
    void assign(Passenger passenger);
    void upRight();
    void level1();
}
