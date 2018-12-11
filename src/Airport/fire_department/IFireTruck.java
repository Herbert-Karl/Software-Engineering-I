package Airport.fire_department;

import Airplane.Aircraft.Airplane;
import Airport.airport.RunwayID;

public interface IFireTruck {
    void executeRequest(RunwayID runwayID);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setRunway(RunwayID runwayID);
    void setAirplane();
    boolean extinguish(int amount, Airplane airplane);
    boolean extinguish(boolean useFoam, Airplane airplane);
    void returnToFireDepartment();
    void setFlashingLightOff();
}
