import java.util.ArrayList;

public class CostOptimizer implements ICostOptimizer {

    private String manufacturer;
    private String type;
    private String id;
    private boolean isOn;
    private ArrayList<CheckPoint> checkPointList;
    private int costIndex;

    public CostOptimizer(String manufacturer, String type, String id, boolean isOn,
                         ArrayList<CheckPoint> checkPointList, int costIndex) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isOn = isOn;
        this.checkPointList = checkPointList;
        this.costIndex = costIndex;
    }


    public String version()  {


        return "<"+id+"> - " + "<"+type+">" ;
    }

    public void on() {
        isOn = true;
    }

    public int add(CheckPoint checkPoint) {

        checkPointList.add(checkPoint);

        return checkPointList.size();
    }

    public int remove(int checkPoint) {

        checkPointList.remove(checkPoint);
        return checkPointList.size();
    }

    public int optimize(ArrayList<CheckPoint> checkPointList) {
        //TODO
    }

    public boolean validate(int costIndex) {
        if(costIndex <= 4 || costIndex >= 1)
            return true;
        else
            return false;

    }

    public void off() {
        isOn = false;

    }
}
