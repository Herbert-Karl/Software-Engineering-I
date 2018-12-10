package Airplane.sensor04;

public interface ICamera {
    String version();
    void setType(String type);
    void on();
    String record();
    void zoomIn(double factor);
    void off();
}
