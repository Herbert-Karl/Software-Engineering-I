package Airplane.management;

public interface IRouteManagement {
    String version();
    void on();
    void add(CheckPoint checkPoint);
    void remove(CheckPoint checkPoint);
    void printCheckPoints();
    void setCostIndex(int value);
    void off();
}
