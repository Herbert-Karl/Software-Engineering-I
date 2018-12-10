package Airplane.flight_controls01;

public interface IElevator {
    String version();
    void neutral();
    void fullDown();
    void fullUp();
    void down(int degree);
    void up(int degree);
}
