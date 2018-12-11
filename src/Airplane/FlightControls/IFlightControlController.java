package Airplane.FlightControls;

public interface IFlightControlController {
    void neutral();

    void startup();

    void taxi();

    void takeOff();

    void climbing();

    void leftTurn();

    void rightTurn();

    void landing();
}
