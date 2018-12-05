package Airplane.Management;

public interface IRouteManagement {

    String version();
    void on();
    int add(CheckPoint checkPoint);
    int remove(CheckPoint checkPoint);
    void printCheckPoints();
    void setCostIndex(int value);
    void off();
}
