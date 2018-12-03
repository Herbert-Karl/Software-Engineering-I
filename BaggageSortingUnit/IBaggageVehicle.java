package BaggageSortingUnit;

public interface IBaggageVehicle {
    void executeRequest(GateID gateID);
    void store(Container container);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGate(GateID gate);
    void connect(IContainerLifter containerLifter);
    void transferContainerToLifter();
    void disconnect(IContainerLifter containerLifter);
    void returnToBaggageSortingUnit();
    void setFlashingLightOff();
}
