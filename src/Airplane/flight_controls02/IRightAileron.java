package Airplane.flight_controls02;

public interface IRightAileron {
    String version();
    void neutral();
    void fullUp();
    void fullDown();
    void up(int degree);
    void down(int degree);
}
