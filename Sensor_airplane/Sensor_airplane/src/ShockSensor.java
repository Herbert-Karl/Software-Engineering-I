public class ShockSensor implements IShockSensor{
    private String manufacturer;
    private String type;
    private String id;
    private boolean isCalibrated;
    private boolean isShockDetectted;

    @Override
    public String version() {
        return type+" "+id;
    }

    @Override
    public void calibrate() {
        isCalibrated=true;
    }

    @Override
    public void calibrate(double level) {
        isCalibrated=true;
    }

    @Override
    public int measure() {
        return 5;
    }

    @Override
    public void arlarm() {
        isShockDetectted=true;
    }
}
