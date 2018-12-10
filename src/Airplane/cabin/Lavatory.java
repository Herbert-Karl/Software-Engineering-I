package Airplane.cabin;

public class Lavatory implements ILavatory {
    private String manufacturer;
    private String type;
    private String id;
    private boolean isLocked;
    private boolean isCleaned;

    public Lavatory(String manufacturer, String type, String id, boolean isLocked, boolean isCleaned) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isLocked = isLocked;
        this.isCleaned = isCleaned;
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

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isCleaned() {
        return isCleaned;
    }

    public void setCleaned(boolean cleaned) {
        isCleaned = cleaned;
    }
}
