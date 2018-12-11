package Airport.baggage_sorting_unit;

import Airport.airport.GateID;
import Airport.base.Container;

public interface IBaggageVehicle {
    void executeRequest(GateID gateID);
    void store(Container container);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGate(GateID gateID);
    void connect(IContainerLift containerLift);
    void transferContainerToLift();
    void disconnect(IContainerLift containerLift);
    void returnToBaggageSortingUnit();
    void setFlashingLightOff();
}
