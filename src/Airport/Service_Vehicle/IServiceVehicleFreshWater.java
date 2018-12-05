package Airport.Service_Vehicle;

import Airplane.Tanks.IPortableWaterTank;
import Airport.Airport.GateID;

public interface IServiceVehicleFreshWater {
    void executeRequest(GateID gateID);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGateID(GateID gateID);
    void connectToAirplane();
    void refill(IPortableWaterTank portableWaterTank);
    void disconnectFromAirplane();
    void setFlashingLightOff();
    void notifyGroundOperations(ServiceVehicleFreshWaterReceipt serviceVehicleFreshWaterReceipt);
    void returnToAirportResourcePool();
}