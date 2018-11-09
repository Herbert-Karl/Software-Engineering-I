package FlightControls.Interfaces;

public interface ISpoiler extends IFlightControl {
    int fullUp();
    int down(int degree);
    int up(int degree);
}
