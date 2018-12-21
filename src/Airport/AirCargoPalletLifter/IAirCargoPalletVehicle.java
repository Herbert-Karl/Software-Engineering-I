package Airport.AirCargoPalletLifter;

import Airport.Airport.GateID;
import Airport.Base.AirCargoPallet;

public interface IAirCargoPalletVehicle {
    void executeRequest(GateID gateID);
    void store(AirCargoPallet airCargoPallet);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGateID(GateID gateID);
    void connect(IAirCargoPalletLifter airCargoPalletLifter);
    void transferPalletToLifter(AirCargoPalletLifter airCargoPalletLifter);
    void disconnectFromLifter();
    void returnToAirCargoPalletPackingUnit();
    void setFlashingLightOff();
    void returnToAirportResourcePool();

}
