package Airplane.seat;

import Airport.base.Passenger;

public interface IFirstClassSeat {
    String version();
    void assign(Passenger passenger);
    void readingLightOn();
    void readingLightOff();
    void upRight();
    void level1();
    void level2();
    void level3();
    void flat();
}
