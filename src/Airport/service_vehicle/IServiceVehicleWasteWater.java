package Airport.service_vehicle;

import Airplane.tank_bottle.IWasteWaterTank;
import Airport.airport.GateID;

public interface IServiceVehicleWasteWater {
    void executeRequest(GateID gateID);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGate(GateID gateID);
    void connectToAirplane();
    void disconnectFromAirplane();
    void setFlashingLightOff();
    void returnToAirportResourcePool();
    void notifyGroundOperation(ServiceVehicleWasteWaterReceipt serviceVehicleWasteWaterReceipt);

    void pumpOut(IWasteWaterTank wasteWaterTank);
}
