package Airplane.sensor02;

public class FireDetector implements IFireDetector {
    private String manufacturer;
    private String type;
    private String id;
    private boolean isAlarm;

    public FireDetector(String manufacturer, String type, String id, boolean isAlarm) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isAlarm = isAlarm;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public boolean scan(String air) {
        return false;
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

    public boolean isAlarm() {
        return isAlarm;
    }

    public void setAlarm(boolean alarm) {
        isAlarm = alarm;
    }
}
