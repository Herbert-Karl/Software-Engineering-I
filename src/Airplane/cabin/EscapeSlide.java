package Airplane.cabin;

public class EscapeSlide implements IEscapeSlide {
    String manufacturer;
    String type;
    String id;
    boolean isActivated;

    public EscapeSlide(String manufacturer, String type, String id, boolean isActivated) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isActivated = isActivated;
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

    @Override
    public String version() {
        return null;
    }

    @Override
    public void activate() {

    }

    @Override
    public void test() {

    }
}
