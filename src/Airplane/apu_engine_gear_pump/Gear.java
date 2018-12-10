package Airplane.apu_engine_gear_pump;

import java.util.ArrayList;

public class Gear implements IGear {
    String manufacturer;
    GearType type;
    String id;
    ArrayList<Wheel> wheels;
    boolean isDown;

    public Gear(String manufacturer, GearType type, String id, ArrayList<Wheel> wheels, boolean isDown) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.wheels = wheels;
        this.isDown = isDown;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public GearType getType() {
        return type;
    }

    public void setType(GearType type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    public boolean isDown() {
        return isDown;
    }

    public void setDown(boolean down) {
        isDown = down;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public GearType setType(String type) {
        return null;
    }

    @Override
    public void down() {

    }

    @Override
    public void up() {

    }

    @Override
    public void setBrake() {

    }

    @Override
    public void setBrake(int percentage) {

    }

    @Override
    public void releaseBrake() {

    }
}
