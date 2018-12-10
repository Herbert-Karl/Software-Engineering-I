package Airport.AirCargoPalletLifter;

import Airport.Airport.GateID;
import Airport.Base.AirCargoPallet;

public interface IAirCargoPalletVehicel {
    void executeRequest(GateID gateID);
    void store(AirCargoPallet airCargoPallet);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGate(GateID gateID);
    void connect(IAirCargoPalletLifter airCargoPalletLifter);
    void transferPalletToLifter();
    void disconnectFromLifter();
    void returnToAirCargoPalletPackingUnit();
    void setFlashingLightOff();
    void returnToAirportResourcePool();

}
