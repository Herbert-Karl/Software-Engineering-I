package Airplane.Management;

public interface IRouteManagement {

    public String version();
    public void on();
    public int add(CheckPoint checkPoint);
    public int remove(CheckPoint checkPoint);
    public void printCheckPoints();
    public void setCostIndex(int value);
    public void off();
}
