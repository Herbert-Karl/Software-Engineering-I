package Airplane.flight_controls01;

public interface IDroopNose {
    String version();
    void neutral();
    void fullDown();
    void down(int degree);
    void up(int degree);
}
