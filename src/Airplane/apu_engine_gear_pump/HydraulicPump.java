package Airplane.apu_engine_gear_pump;

public class HydraulicPump implements IHydraulicPump {
    private String manufacturer;
    private String type;
    private String id;
    private int amountOfOil;

    public HydraulicPump(String manufacturer, String type, String id) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.amountOfOil = 1000;
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

    public int getAmountOfOil() {
        return amountOfOil;
    }

    public void setAmountOfOil(int amountOfOil) {
        this.amountOfOil = amountOfOil;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void compress() {

    }

    @Override
    public void compress(int amount) {

    }

    @Override
    public void decompress() {

    }

    @Override
    public void refillOil() {

    }

    @Override
    public void refillOil(int amount) {

    }
}
