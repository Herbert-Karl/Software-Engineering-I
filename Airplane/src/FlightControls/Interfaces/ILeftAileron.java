package FlightControls.Interfaces;

public interface ILeftAileron extends IFlightControl{
    int fullDown();
    int down(int degree);
    int up(int degree);
    int fullUp();
}
