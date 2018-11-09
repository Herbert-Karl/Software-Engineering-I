package FlightControls.Interfaces;

public interface IDroopNose extends IFlightControl{
    int fullDown();
    int down(int degree);
    int up(int degree);
}
