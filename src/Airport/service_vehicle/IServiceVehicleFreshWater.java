package Airport.service_vehicle;

import Airplane.tank_bottle.IPotableWaterTank;
import Airport.airport.GateID;

public interface IServiceVehicleFreshWater {
    void executeRequest(GateID gateID);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGate(GateID gateID);
    void connectToAirplane();
    void disconnectFromAirplane();
    void setFlashingLightOff();
    void returnToAirportResourcePool();
    void notifyGroundOperation(ServiceVehicleFreshWaterReceipt serviceVehicleFreshWaterReceipt);

    void refill(IPotableWaterTank potableWaterTank);
}
