import java.util.Random;

public class TemperatureSensor implements ITemperatureSensor{
    private String manufacturer;
    private String type;
    private String id;
    private boolean isAlarm;
    private int temperature;

    @Override
    public String version() {
        return type+" "+id;
    }

    @Override
    public void measure() {
        Random random = new Random();
        temperature= -40;
        temperature+=random.nextInt(120);
    }

    @Override
    public void alarm(int threshold) {
        if (temperature >= threshold ){
            isAlarm= true;
        }
        isAlarm= false;
    }
}
