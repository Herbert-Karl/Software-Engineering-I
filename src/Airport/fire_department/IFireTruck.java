package Airport.fire_department;

import Airport.Airport.RunwayID;

public interface IFireTruck
{
    int move(int speedInMPH);

    int stop();

    void executeRequest(RunwayID runwayID);

    void setRunway(RunwayID runway);

    void setAirplane();

    void returnToFireDepartment();

    boolean setFlashingLightON();

    boolean setFlashingLightOFF();

    boolean extinguish(int amount,
        IEngine engine);

    boolean extinguish(boolean useFoam,
        IEngine engine);

}
