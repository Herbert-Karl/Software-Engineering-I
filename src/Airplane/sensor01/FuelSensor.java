package Airplane.sensor01;

public class FuelSensor implements IFuelSensor {
    private String manufacturer;
    private String type;
    private String id;
    private boolean isAlarmReserve;
    private boolean isAlarmMajor;
    private boolean isAlarmCritical;

    public FuelSensor(String manufacturer, String type, String id, boolean isAlarmReserve, boolean isAlarmMajor, boolean isAlarmCritical) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isAlarmReserve = isAlarmReserve;
        this.isAlarmMajor = isAlarmMajor;
        this.isAlarmCritical = isAlarmCritical;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void measure() {

    }

    @Override
    public void alarmReserve(int threshold) {

    }

    @Override
    public void alarmMajor(int threshold) {

    }

    @Override
    public void alarmCritical(int threshold) {

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

    public boolean isAlarmReserve() {
        return isAlarmReserve;
    }

    public void setAlarmReserve(boolean alarmReserve) {
        isAlarmReserve = alarmReserve;
    }

    public boolean isAlarmMajor() {
        return isAlarmMajor;
    }

    public void setAlarmMajor(boolean alarmMajor) {
        isAlarmMajor = alarmMajor;
    }

    public boolean isAlarmCritical() {
        return isAlarmCritical;
    }

    public void setAlarmCritical(boolean alarmCritical) {
        isAlarmCritical = alarmCritical;
    }
}
