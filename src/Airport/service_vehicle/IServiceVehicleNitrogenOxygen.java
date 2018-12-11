package Airport.service_vehicle;

import Airplane.tank_bottle.INitrogenBottle;
import Airplane.tank_bottle.IOxygenBottle;
import Airport.airport.GateID;

public interface IServiceVehicleNitrogenOxygen {
    void executeRequest(GateID gateID);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGate(GateID gateID);
    void connectToAirplane();
    void disconnectFromAirplane();
    void setFlashingLightOff();
    void returnToAirportResourcePool();
    void notifyGroundOperation(ServiceVehicleNitrogenOxygenReceipt serviceVehicleNitrogenOxygenReceipt);

    void attachElectricalGrounding();
    void dettachElectricalGrounding();
    void refill(IOxygenBottle oxygenBottle);
    void refill(INitrogenBottle nitrogenBottle);
}
