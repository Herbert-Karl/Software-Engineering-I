package Airplane.light;

public interface IRightNavigationLight {
    String version();
    void on();
    void off();
    void setLightType(String type);
    void setPosition(String position);
}
