package Airport.air_cargo_pallet_lifter;

import Airport.airport.GateID;

public interface IAirCargoPalletLifter {
    void executeRequest(GateID gateID);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGate(GateID gateID);
    void  connectToAirplane();
    void up();
    void transferAirCargoPalletToCargoSystem();
    void down();
    void disconnectFromAirplane();
    void setFlashingLightOff();
    void notifyGroundOperations(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt);
    void returnToAirportResourcePool();
}
