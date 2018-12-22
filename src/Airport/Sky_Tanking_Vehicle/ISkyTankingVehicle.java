package Airport.Sky_Tanking_Vehicle;

import Airplane.Aircraft.Airplane;
import Airplane.Tanks.IFuelTank;
import Airport.Airport.GateID;

public interface ISkyTankingVehicle {
    void executeRequest(GateID gateID);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void attachElectricalGrounding();
    void setGate(GateID gateID);
    void connectAirplane(Airplane airplane);
    void pump(IFuelTank fuelTank, int amount);
    FuelReceipt print();
    void disconnectFromAirplane();
    void detachElectricalGrounding();
    void setFlashingLightOff();
    void notifyGroundOperations(FuelReceipt fuelReceipt);
}
