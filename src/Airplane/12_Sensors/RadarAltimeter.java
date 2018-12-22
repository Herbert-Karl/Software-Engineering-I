import java.util.Random;

public class RadarAltimeter implements IRadarAltimeter{
    private String manufacturer;
    private String type;
    private String id;
    private boolean isOn;
    private int altitude;

    @Override
    public String version() {
        return type+" "+id;
    }

    @Override
    public void on() {
        isOn=true;
    }

    @Override
    public void send(String radioWave) {

        System.out.print(radioWave);

    }

    @Override
    public int receive(String radioWave) {
        return 0;
    }

    @Override
    public int measureAltitude() {
        Random random = new Random();
        return random.nextInt(10000);
    }

    @Override
    public void off() {
        isOn=false;
    }
}
