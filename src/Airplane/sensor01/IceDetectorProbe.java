package Airplane.sensor01;

public class IceDetectorProbe implements IIceDetectorProbe {
    private String manufacturer;
    private String type;
    private String id;
    private boolean isActivated;
    private boolean isIceDetected;

    public IceDetectorProbe(String manufacturer, String type, String id, boolean isActivated, boolean isIceDetected) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isActivated = isActivated;
        this.isIceDetected = isIceDetected;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void activate() {

    }

    @Override
    public void detect() {

    }

    @Override
    public void detect(String surface) {

    }

    @Override
    public void detect(String surface, String pattern) {

    }

    @Override
    public void deactivate() {

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

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public boolean isIceDetected() {
        return isIceDetected;
    }

    public void setIceDetected(boolean iceDetected) {
        isIceDetected = iceDetected;
    }
}
