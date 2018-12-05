package Airport.Management;

import java.util.ArrayList;

public interface ICostOptimizer {

    public String version();
    public void on();
    public int add(CheckPoint checkPoint);
    public int remove(int checkPoint);
    public int optimize(ArrayList<CheckPoint> checkPointList);
    public boolean validate(int costIndex);
    public void off();
}
