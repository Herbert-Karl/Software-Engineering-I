package Airport.fire_department;

import Airport.Airport.RunwayID;

import java.util.ArrayList;
import java.util.UUID;

public class FireTruck implements IFireTruck
{
    private String uuid = UUID.randomUUID().toString();
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
    public int move(final int speedInMPH)
    {
        return 0;
    }

    @Override
    public int stop()
    {
        return 0;
    }

    @Override
    public void executeRequest(final RunwayID runwayID)
    {

        setFlashingLightON();
        move(15);
        setRunway(runwayID);
        setAirplane();
        stop();

//TODO
        returnToFireDepartment();

    }

    @Override
    public void setRunway(final RunwayID runway)
    {
        //TODO: lookup runway
    }

    @Override
    public void setAirplane()
    {
        //TODO:GET Airplane from runway
    }

    @Override
    public void returnToFireDepartment()
    {

    }

    @Override
    public boolean setFlashingLightON()
    {
        isFlashlightOn = true;
        return isFlashlightOn;
    }

    @Override
    public boolean setFlashingLightOFF()
    {
        isFlashlightOn = false;
        return isFlashlightOn;
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
