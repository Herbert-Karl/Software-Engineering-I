package Airport.service_vehicle;

import Airplane.tank_bottle.*;
import Airport.airport.GateID;

public interface IServiceVehicleBase {
    void executeRequest(GateID gateID);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGate(GateID gateID);
    void connectToAirplane();
    void disconnectFromAirplane();
    void setFlashingLightOff();
    void returnToAirportResourcePool();
    void notifyGroundOperation(ServiceVehicleBaseReceipt serviceVehicleBaseReceipt);

    void increaseLevel(IAPUOilTank apuOilTank);
    void increaseLevel(IEngineOilTank engineOilTank);
    void charge(IBattery battery);
    void change(IFireExtinguisher fireExtinguisher);
    void refill(IDeIcingSystem deIcingSystem);
}
