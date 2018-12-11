package Airport.baggage_sorting_unit;

import Airport.airport.GateID;

public interface IContainerLift {
    void executeRequest(GateID gateID);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGate(GateID gateID);
    void connectToAirplane();
    void disconnectFromAirplane();
    void setFlashingLightOff();
    void returnToAirportResourcePool();
    void notifyGroundOperation(ContainerLiftReceipt containerLiftReceipt);

    void up();
    void down();
    void transferContainerToCargoSystem();
}
