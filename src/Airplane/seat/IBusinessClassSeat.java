package Airplane.seat;

public interface IBusinessClassSeat {
    String version();
    void assign(Passenger passenger);
    void readingLightOn();
    void readingLightOff();
    void upRight();
    void level1();
    void level2();
}
