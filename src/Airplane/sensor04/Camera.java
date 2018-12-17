package Airplane.sensor04;

public class Camera implements ICamera {
    private String manufacturer;
    private CameraType type;
    private String id;
    private boolean isOn;
    private double factor;

    public Camera(String manufacturer, CameraType type, String id, boolean isOn, double factor) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isOn = isOn;
        this.factor = factor;
    }

    @Override
    public String version() {
        return "<" + id + "> - <" + type + ">";
    }

    @Override
    public void setType(String type) {
        this.setType(CameraType.valueOf(type));
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public String record() {
        return "Recording...";
    }

    @Override
    public void zoomIn(double factor) {
        this.factor += factor;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public CameraType getType() {
        return type;
    }

    public void setType(CameraType type) {
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

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }
}
