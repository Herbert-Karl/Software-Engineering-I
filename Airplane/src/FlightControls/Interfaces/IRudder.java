package FlightControls.Interfaces;

public interface IRudder extends IFlightControl {
    int fullLeft();

    int fullRight();

    int right(int degree);

    int left(int degree);
}
