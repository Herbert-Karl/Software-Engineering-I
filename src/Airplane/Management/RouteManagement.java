package Airplane.Management;

import java.util.ArrayList;

public class RouteManagement implements IRouteManagement{

    private String manufacturer;
    private String type;
    private String id;
    private boolean isOn;
    private ArrayList<CheckPoint> checkPointList;
    private double costIndex;

    public RouteManagement(String manufacturer, String type, String id, boolean isOn,
                           ArrayList<CheckPoint> checkPointList, double costIndex) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isOn = isOn;
        this.checkPointList = checkPointList;
        this.costIndex = costIndex;
    }


    public String version() {
        return "<"+id+"> - " + "<"+type+">" ;

    }

    public void on() {
        isOn = true;
    }

    public int add(CheckPoint checkPoint) {

        checkPointList.add(checkPoint);
        return checkPointList.size();

    }

    public int remove(CheckPoint checkPoint ) {

        checkPointList.remove(checkPoint);
        return checkPointList.size();

    }

    public void printCheckPoints() {
        System.out.print(checkPointList.toString());

    }

    public void setCostIndex(int value) {

        costIndex = (Math.random() * value)+1;
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

    public double getCostIndex() {
        return costIndex;
    }

    public void setCostIndex(double costIndex) {
        this.costIndex = costIndex;
    }
}

