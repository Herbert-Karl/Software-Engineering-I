import java.util.Random;

public class ExhaustGasTemperatureSensor implements IExhaustGasTempertureSensor{
    private String manufacturer;
    private String type;
    private String id;
    private int temperature;
    private boolean isAlarmMajor;
    private boolean isAlarmCritical;



    @Override
    public String version() {
        return type+" "+id;
    }

    @Override
    public void measure() {
        Random random = new Random();
        temperature=random.nextInt(350); //Temperature range between 0 and 350 degrees Celcius
    }

    @Override
    public void alarmMajor(int threshold) {
        if(temperature>=threshold)
        {isAlarmMajor= true;}
        else{isAlarmMajor= false;}
    }

    @Override
    public void alarmCritical(int threshold) {
        if(temperature>=threshold)
        {isAlarmCritical= true;}
        else{isAlarmCritical= false;}
    }
}
