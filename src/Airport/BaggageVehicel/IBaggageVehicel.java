package Airport.BaggageVehicel;

import Airport.Airport.GateID;
import Airport.Base.Container;

public interface IBaggageVehicel {
    void executeRequest(GateID gateID);
    void store(Container container);
    void setFlashingLightOn();
    void move (int speedInMPH);
    void stop();
    void setGate(GateID gateID);
    void connect(IContainerLifter containerLifter);
    void transferContainerToLifter();
    void disconnect(IContainerLifter containerLifter);
    void returnToBaggageSortingUnit();
    void setFlashingLightOff();

}
