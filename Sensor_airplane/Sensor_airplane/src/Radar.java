public class Radar implements IRadar{
    private String manufacturer;
    private String type;
    private String id;
    private boolean isOn;

    @Override
    public String version() {
        return type+" "+id;
    }

    @Override
    public void on() {
        isOn=true;
    }

    @Override
    public boolean scan(String environment) {
        if (!environment.isEmpty()) {
            if (environment.contains("o")) {
                return  true;
            }
        }
        return false;
    }

    @Override
    public void off() {
        isOn=false;
    }


}
