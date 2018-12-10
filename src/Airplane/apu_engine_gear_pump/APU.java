package Airplane.apu_engine_gear_pump;

public class APU implements IAPU {
    private String manufacturer;
    private String type;
    private String id;
    private boolean isStarted;
    private int rpm;

    public APU(String manufacturer, String type, String id, boolean isStarted, int rpm) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isStarted = isStarted;
        this.rpm = rpm;
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

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void start() {

    }

    @Override
    public void increaseRPM(int value) {

    }

    @Override
    public void decreaseRPM(int value) {

    }

    @Override
    public void shutdown() {

    }
}
