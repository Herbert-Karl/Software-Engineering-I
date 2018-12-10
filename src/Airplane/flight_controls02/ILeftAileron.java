package Airplane.flight_controls02;

public interface ILeftAileron {
    String version();
    void neutral();
    void fullUp();
    void fullDown();
    void up(int degree);
    void down(int degree);
}
