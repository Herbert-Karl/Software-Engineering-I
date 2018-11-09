package FlightControls.Interfaces;

public interface ISlat extends IFlightControl {
    int fullDown();
    int down(int degree);
    int up(int degree);
}
