package Airplane.light;

public interface ILeftNavigationLight {
    String version();
    void on();
    void off();
    void setLightType(String type);
    void setPosition(String position);
}
