package FlightControls.Interfaces;

public interface IRightAileron extends IFlightControl {
    int fullDown();
    int down(int degree);
    int up(int degree);
    int fullUp();
}
