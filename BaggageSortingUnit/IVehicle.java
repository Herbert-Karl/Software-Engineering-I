package BaggageSortingUnit;

public interface IVehicle {
    void executeRequest(GateID gateID);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGate(GateID gate);
    void setFlashingLightOff();
}
