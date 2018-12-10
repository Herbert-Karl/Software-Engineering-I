package Airplane.Management;

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
        return costIndex <= 5 && costIndex >= 1;

    }

    public void off() {
        isOn = false;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public ArrayList<CheckPoint> getCheckPointList() {
        return checkPointList;
    }

    public void setCheckPointList(ArrayList<CheckPoint> checkPointList) {
        this.checkPointList = checkPointList;
    }

    public int getCostIndex() {
        return costIndex;
    }

    public void setCostIndex(int costIndex) {
        this.costIndex = costIndex;
    }
}
