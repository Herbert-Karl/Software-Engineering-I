package Airplane.cabin;

public class WasteSystem implements IWasteSystem {
    private String manufacturer;
    private String type;
    private String id;
    private String[] waste;
    private boolean isOn;
    private boolean isCleaned;

    @Override
    public String version() {
        return null;
    }

    @Override
    public void on() {

    }

    @Override
    public int deposit(String[] waste) {
        return 0;
    }

    @Override
    public void off() {

    }

    @Override
    public void clean() {

    }
}
