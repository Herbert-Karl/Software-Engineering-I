package Airport.sky_tanking_vehicle;

import Airplane.tank_bottle.IFuelTank;
import Airport.airport.GateID;

public interface ISkyTankingVehicle {
    void executeRequest(GateID gateID);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void attachElectricalGrounding();
    void setGate(GateID gateID);
    void connectToAirplane();
    void pump(IFuelTank fuelTank, int amount);
    FuelReceipt print();
    void disconnectFromAirplane();
    void detachElectricalGrounding();
    void setFlashingLightOff();
    void notifyGroundOperations(FuelReceipt fuelReceipt);
}
