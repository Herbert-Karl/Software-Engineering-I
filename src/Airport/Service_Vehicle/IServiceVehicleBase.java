package Airport.Service_Vehicle;
import Airplane.Tanks.*;
import Airport.Airport.GateID;

public interface IServiceVehicleBase {
    void executeRequest(GateID gateID);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGateID(GateID gateID);
    void connectToAirplane();
    void increaseLevel(IAPUOilTank apuOilTank);
    void charge(IBattery battery);
    void increaseLevel(IEngineOilTank engineOilTank);
    void change(IFireExtinguisher fireExtinguisher);
    void refill(IDeIcingSystem deIcingSystem);
    void disconnectFromAirplane();
    void setFlashingLightOff();
    void notifyGroundOperations(ServiceVehicleBaseReceipt serviceVehicleBaseReceipt);
    void returnToAirportResourcePool();
}