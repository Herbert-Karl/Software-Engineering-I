package Airport.AirCargoPalletLifter;

import Airport.Airport.GateID;

public interface IAirCargoPalletLifter {
    void executeRequest(GateID gateID);
    void move(int speedInMPH);
    void stop();
    void setGate(GateID gateID);
    void connectToAirplane();
    void up();
    void transferAirCargoPalletToCargoSystem();
    void disconnectFromAirplane();
    void setFlashingLightOn();
    void setFlashingLightOff();
    void returnToAirportResourcePool();
    void down();
    void notifyGroundOperations(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt);
}
