import java.util.Random;

public class FuelFlowSensor implements  IFuelFlowSensor{
    private String manufacturer;
    private String type;
    private String id;
    private int fuelFlow;

    @Override
    public String version() {
        return type+" "+id;
    }

    @Override
    public void measure() {
        Random random = new Random();
        fuelFlow=random.nextInt(60);    //in GPH angegeben

    }
}
