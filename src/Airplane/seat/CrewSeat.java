package Airplane.seat;

public class CrewSeat implements ICrewSeat {
    String manufacturer;
    String type;
    String id;
    IReadingLight readingLight;

    public CrewSeat(String manufacturer, String type, String id, IReadingLight readingLight) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.readingLight = readingLight;
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

    public IReadingLight getReadingLight() {
        return readingLight;
    }

    public void setReadingLight(IReadingLight readingLight) {
        this.readingLight = readingLight;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void readingLightOn() {

    }

    @Override
    public void readingLightOff() {

    }
}
