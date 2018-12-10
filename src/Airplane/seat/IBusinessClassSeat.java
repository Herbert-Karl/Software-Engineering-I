package Airplane.seat;

public interface IBusinessClassSeat {
    String version();

    void assign(Passenger passenger);

    void readingLightOff();

    void readingLightOn();

    void upRight();

    void level1();

    void level2();
}
