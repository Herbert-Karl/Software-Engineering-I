import java.util.Random;

public class FuelSensor implements IFuelSensor{
    private String manufacturer;
    private String type;
    private String id;
    private boolean isAlarmReserve;
    private boolean isAlarmMajor;
    private boolean isAlarmCritical;
    private int fuel;


    @Override
    public String version() {
        return type+" "+id;
    }

    @Override
    public void measure() {                     // funktioniert noch nicht
        Random random = new Random();
        fuel = random.nextInt(45000);  //in Gallons

    }

    @Override
    public void alarmMajor(int threshold) {
        if(fuel>=threshold)
        {isAlarmMajor= true;}
        else{isAlarmMajor=false;}
    }

    @Override
    public void alarmCritical(int threshold) {
        if(fuel>=threshold)
        {isAlarmCritical= true;}
        else{isAlarmCritical= false;}
    }

    @Override
    public void alarmReserve(int threshold) {
        if(fuel>=threshold)
        { isAlarmReserve= true;}
        else{isAlarmReserve= false;}
    }
}
