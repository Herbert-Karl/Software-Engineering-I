package Airplane.flight_controls01;

public class DroopNose implements IDroopNose {
    private String manufacturer;
    private String type;
    private String id;
    private int degree;

    public DroopNose(String manufacturer, String type, String id, int degree) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.degree = degree;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void neutral() {

    }

    @Override
    public void fullDown() {

    }

    @Override
    public void down(int degree) {

    }

    @Override
    public void up(int degree) {

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

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
}
