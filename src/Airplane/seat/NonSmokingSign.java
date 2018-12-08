package Airplane.seat;

public class NonSmokingSign implements INonSmokingSign {
    private String uuid;
    private String manufacturer;
    private String type;
    private String id;
    private boolean isOn;

    @Override
    public String version() {
        return null;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }
}
