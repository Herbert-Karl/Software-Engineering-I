package Airport.AirCargoPalletLifter;

import Airplane.Aircraft.Airplane;
import Airport.Airport.GateID;

public interface IAirCargoPalletLifter {
    void executeRequest(GateID gateID);
    void move(int speedInMPH);
    void stop();
    void setGate(GateID gateID);
    void connectToAirplane(Airplane airplane);
    void up();
    void transferAirCargoPalletToCargoSystem();
    void disconnectFromAirplane();
    void setFlashingLightOn();
    void setFlashingLightOff();
    void returnToAirportResourcePool();
    void down();
    void notifyGroundOperations(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt);

}
