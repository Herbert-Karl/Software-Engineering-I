package Airplane.FlightControls.Interfaces;

public interface IVerticalRotable extends ISteplessRotable {
    int up(int degree);

    int down(int degree);

    int fullUp();

    int fullDown();
}
