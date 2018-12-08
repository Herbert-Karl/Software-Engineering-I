package Airplane.Lights;

public interface ILeftNavigationLight {
    String version();
    void setLightType(String type);
    void setPosition(String position);
    void on();
    void off();
}
