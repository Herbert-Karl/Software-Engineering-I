package Airport.Service_Vehicle;

import Airplane.Aircraft.Airplane;
import Airplane.Tanks.INitrogenBottle;
import Airplane.Tanks.IOxygenBottle;
import Airport.Airport.GateID;

public interface IServiceVehicleNitrogenOxygen {
    void executeRequest(GateID gateID);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void attachElectricalGrounding();
    void setGateID(GateID gateID);
    void connectToAirplane(Airplane airplane);
    void refill(INitrogenBottle nitrogenBottle);
    void refill(IOxygenBottle oxygenBottle);
    void disconnectFromAirplane();
    void detachElectricalGrounding();
    void setFlashingLightOff();
    void notifyGroundOperations(ServiceVehicleNitrogenOxygenReceipt serviceVehicleNitrogenOxygenReceipt);
    void returnToAirportResourcePool();
}