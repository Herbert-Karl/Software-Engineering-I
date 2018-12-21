import java.util.Random;

public class Camera implements ICamera{
    private String manufacturer;
    private String type;
    private String id;
    private boolean isOn;
    private double factor;

    @Override
    public String version() {
        return type+" "+id;
    }

    @Override
    public CameraType setType(String type) {
        CameraType ct = CameraType.valueOf(type);
        return ct;
    }

    @Override
    public void on() {
        isOn=true;
    }

    @Override
    public String record() {
        String a = "";
        char c;
        for(int i=0; i <= 50; i++) {
            Random random = new Random();
            int ascii = random.nextInt(255);
            c = ((char) ascii);
            a= a+c;
        }
        return a;
    }

    @Override
    public double zoomIn(boolean factor) {
        Random random = new Random();
        double x = random.nextDouble()*500;
        return x;
    }

    @Override
    public void off() {
        isOn = false;
    }
}
