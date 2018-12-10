package Airplane.flight_controls02;

public interface ISpoiler {
    String version();
    void neutral();
    void fullUp();
    void up(int degree);
    void down(int degree);
}
