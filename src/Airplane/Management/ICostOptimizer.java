package Airplane.Management;

import java.util.ArrayList;

public interface ICostOptimizer {

    String version();
    void on();
    int add(CheckPoint checkPoint);
    int remove(int checkPoint);
    int optimize(ArrayList<CheckPoint> checkPointList);
    boolean validate(int costIndex);
    void off();
}
