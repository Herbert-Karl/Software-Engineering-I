package Airport.Service_Vehicle;

import Airplane.Aircraft.Airplane;
import Airplane.Tanks.IWasteWaterTank;
import Airport.Airport.GateID;

public interface IServiceVehicleWasteWater {
    void executeRequest(GateID gateID);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGateID(GateID gateID);
    void connectToAirplane(Airplane airplane);
    void pumpOut(IWasteWaterTank wasteWaterTank);
    void disconnectFromAirplane();
    void setFlashingLightOff();
    void notifyGroundOperations(ServiceVehicleWasteWaterReceipt serviceVehicleWasteWaterReceipt);
    void returnToAirportResourcePool();
}
