package Airplane.FlightControls.Interfaces;

public interface IHorizontalRotable extends ISteplessRotable {
    int left(int degree);

    int right(int degree);

    int fullLeft();

    int fullRight();
}
