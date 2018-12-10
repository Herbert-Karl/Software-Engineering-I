package Airplane.sensor02;

public class ShockSensor implements IShockSensor {
    private String manufacturer;
    private String type;
    private String id;
    private boolean isCalibrated;
    private boolean isShockDetected;

    public ShockSensor(String manufacturer, String type, String id, boolean isCalibrated, boolean isShockDetected) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isCalibrated = isCalibrated;
        this.isShockDetected = isShockDetected;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void calibrate() {

    }

    @Override
    public void calibrate(double level) {

    }

    @Override
    public int measure() {
        return 0;
    }

    @Override
    public void alarm() {

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

    public boolean isCalibrated() {
        return isCalibrated;
    }

    public void setCalibrated(boolean calibrated) {
        isCalibrated = calibrated;
    }

    public boolean isShockDetected() {
        return isShockDetected;
    }

    public void setShockDetected(boolean shockDetected) {
        isShockDetected = shockDetected;
    }
}
