package Airport.AirCargoPalletLifter;

import Airport.Airport.AirportResourcePool;
import Airport.Airport.GateID;
import Airport.Base.AirCargoPallet;

public interface IAirCargoPalletVehicle {
    void executeRequest(GateID gateID);
    void store(AirCargoPallet airCargoPallet);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGate(GateID gateID);
    void connect(IAirCargoPalletLifter airCargoPalletLifter);
    void transferPalletToLifter(AirCargoPalletLifter airCargoPalletLifter,AirCargoPallet airCargoPallet);
    void disconnectFromLifter();
    void returnToAirCargoPalletPackingUnit(AirCargoPalletPackingUnit airCargoPalletPackingUnit);
    void setFlashingLightOff();
    void returnToAirportResourcePool(AirportResourcePool airportResourcePool);

}
