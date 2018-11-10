package FlightControls;

public interface IFlightControlController {
    void startup();
    void taxi();
    void takeOff();
    void climbing();
    void leftTurn();
    void rightTurn();
}
