package Airplane.Lights;

public interface IRightNavigationLight {
    String version();
    void setLightType(String type);
    void setPosition(String position);
    void on();
    void off();
}
