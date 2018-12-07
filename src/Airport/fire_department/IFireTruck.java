package Airport.fire_department;

public interface IFireTruck
{
    int forward(int speedInMPH);

    int backward(int speedInMPH);

    int stop();

    boolean setFlashingLightON();

    boolean setFlashingLightOFF();

    boolean extinguish(int amount,
                       IEngine engine);

    boolean extinguish(boolean useFoam,
                       IEngine engine);

}
