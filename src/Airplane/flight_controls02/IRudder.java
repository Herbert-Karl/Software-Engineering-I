package Airplane.flight_controls02;

public interface IRudder {
    String version();
    void neutral();
    void fullLeft();
    void fullRight();
    void left(int degree);
    void right(int degree);
}
