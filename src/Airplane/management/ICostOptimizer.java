package Airplane.management;

import java.util.ArrayList;

public interface ICostOptimizer {
    String version();
    void on();
    void add(CheckPoint checkPoint);
    void remove(CheckPoint checkPoint);
    int optimize(ArrayList<CheckPoint> checkPointList);
    boolean validate(int costIndex);
    void off();
}
