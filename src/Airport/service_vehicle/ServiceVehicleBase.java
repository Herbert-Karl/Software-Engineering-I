package Airport.service_vehicle;

import Airplane.Aircraft.Airplane;
import Airplane.tank_bottle.*;
import Airport.airport.Airport;
import Airport.airport.Gate;
import Airport.airport.GateID;

public class ServiceVehicleBase extends Vehicle implements IServiceVehicleBase {
    private int amountAPUOil;
    private int amountEngineOil;

    public ServiceVehicleBase(String uuid, String type, String id, int speedInMPH, boolean isFlashingLightOn, Gate gate, Airplane connectedAirplane, Airport airport) {
        super(uuid, type, id, speedInMPH, isFlashingLightOn, gate, connectedAirplane, airport);
        this.amountAPUOil = 1000;
        this.amountEngineOil = 1000;
    }

    @Override
    public void executeRequest(GateID gateID) {

    }

    @Override
    public void setFlashingLightOn() {
        setFlashingLightOn(true);
    }

    @Override
    public void move(int speedInMPH) {

    }

    @Override
    public void stop() {

    }

    @Override
    public void setGate(GateID gateID) {

    }

    @Override
    public void connectToAirplane() {

    }

    @Override
    public void disconnectFromAirplane() {

    }

    @Override
    public void setFlashingLightOff() {

    }

    @Override
    public void returnToAirportResourcePool() {

    }

    @Override
    public void notifyGroundOperation(ServiceVehicleBaseReceipt serviceVehicleBaseReceipt) {

    }

    @Override
    public void increaseLevel(IAPUOilTank apuOilTank) {

    }

    @Override
    public void increaseLevel(IEngineOilTank engineOilTank) {

    }

    @Override
    public void charge(IBattery battery) {

    }

    @Override
    public void change(IFireExtinguisher fireExtinguisher) {

    }

    @Override
    public void refill(IDeIcingSystem deIcingSystem) {

    }

    public int getAmountAPUOil() {
        return amountAPUOil;
    }

    public void setAmountAPUOil(int amountAPUOil) {
        this.amountAPUOil = amountAPUOil;
    }

    public int getAmountEngineOil() {
        return amountEngineOil;
    }

    public void setAmountEngineOil(int amountEngineOil) {
        this.amountEngineOil = amountEngineOil;
    }
}
