package Airplane.sensor03;

public class PitotTube implements IPitotTube {
    private String manufacturer;
    private String type;
    private String id;
    private int velocity;
    private boolean isCleaned;

    public PitotTube(String manufacturer, String type, String id, int velocity, boolean isCleaned) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.velocity = velocity;
        this.isCleaned = isCleaned;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public int measureStaticPreasure() {
        return 0;
    }

    @Override
    public int measureTotalPreasure() {
        return 0;
    }

    @Override
    public void measureVelocity() {

    }

    @Override
    public void clean() {

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

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public boolean isCleaned() {
        return isCleaned;
    }

    public void setCleaned(boolean cleaned) {
        isCleaned = cleaned;
    }
}
