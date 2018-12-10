package Airplane.apu_engine_gear_pump;

public class Engine implements IEngine {
    private String manufacturer;
    private String type;
    private String id;
    private boolean isStarted;
    private int rpm;
    private boolean isFire;

    public Engine(String manufacturer, String type, String id, boolean isStarted, int rpm, boolean isFire) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isStarted = isStarted;
        this.rpm = rpm;
        this.isFire = isFire;
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

    public boolean isFire() {
        return isFire;
    }

    public void setFire(boolean fire) {
        isFire = fire;
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

    @Override
    public void extinguishFire() {

    }
}
