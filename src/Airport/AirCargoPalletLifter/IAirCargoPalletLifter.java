package Airport.AirCargoPalletLifter;

import Airplane.Aircraft.Airplane;
import Airplane.stowage_cargo.CargoSystem;
import Airplane.stowage_cargo.RearStowagePositionID;
import Airport.Airport.AirportResourcePool;
import Airport.Airport.GateID;
import Airport.Base.AirCargoPallet;

public interface IAirCargoPalletLifter {
    void executeRequest(GateID gateID);
    void move(int speedInMPH);
    void stop();
    void setGate(GateID gateID);
    void connectToAirplane(Airplane airplane);
    void up();
    void transferAirCargoPalletToCargoSystem(AirCargoPallet airCargoPallet, CargoSystem cargoSystem, RearStowagePositionID rearStowagePositionID);
    void disconnectFromAirplane();
    void setFlashingLightOn();
    void setFlashingLightOff();
    void returnToAirportResourcePool(AirportResourcePool airportResourcePool);
    void down();
    void notifyGroundOperations(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt);

}
