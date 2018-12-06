package Airport.fire_department;

import java.util.ArrayList;

public class FireTruck implements IFireTruck
{
    private String uuid;
    private String id;
    private ArrayList<FireFighter> fireFighterList;
    private boolean isFlashlightOn;
    private String currentLocation;
    private int numberOfSeat;
    private int numberOfWheel;
    private int numberOfExtinguisher;
    private boolean hasFireExtinguishingGun;
    private int maximumCapacityWater;
    private int numberOfHose;
    private int numberOfRespirationProtection;
    private int numberOfOxygenBottle;
    private boolean hasExtinguishingFoam;
    private boolean hasSpecialTool;

    @Override
    public int forward(final int speedInMPH)
    {
        return 0;
    }

    @Override
    public int backward(final int speedInMPH)
    {
        return 0;
    }

    @Override
    public int stop()
    {
        return 0;
    }

    @Override
    public boolean setFlashingLightON()
    {
        return false;
    }

    @Override
    public boolean setFlashingLightOFF()
    {
        return false;
    }

    @Override
    public boolean extinguish(final int amount,
        final IEngine engine)
    {
        return false;
    }

    @Override
    public boolean extinguish(final boolean useFoam,
        final IEngine engine)
    {
        return false;
    }
}
