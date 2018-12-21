import java.util.Random;

public class PilotTube implements IPilotTube{
    private String manufacturer;
    private String type;
    private String id;
    private boolean isCleaned;
    private int velocity;


    @Override
    public String version() {
        return type+" "+id;
    }

    @Override
    public int measureStaticPressure() {
        Random random = new Random();
        return random.nextInt(200);
    }

    @Override
    public int measureTotalPressure() {
        int P = measureStaticPressure();
        int density = 3;

        return (int)(P + 0.5*density*Math.pow(velocity,2));
    }

    @Override
    public int measureVelocity() {
        Random random = new Random();
        velocity=random.nextInt(550);          //in mph
        return  velocity;
    }

    @Override
    public void clean() {
        isCleaned=true;
    }
}


