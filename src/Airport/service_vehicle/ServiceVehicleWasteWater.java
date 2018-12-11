package Airport.service_vehicle;

import Airplane.Aircraft.Airplane;
import Airplane.tank_bottle.IWasteWaterTank;
import Airport.airport.Airport;
import Airport.airport.Gate;
import Airport.airport.GateID;

public class ServiceVehicleWasteWater extends Vehicle implements IServiceVehicleWasteWater {
    private int amountWasteWater;

    public ServiceVehicleWasteWater(String uuid, String type, String id, int speedInMPH, boolean isFlashingLightOn, Gate gate, Airplane connectedAirplane, Airport airport, int amountWasteWater) {
        super(uuid, type, id, speedInMPH, isFlashingLightOn, gate, connectedAirplane, airport);
        this.amountWasteWater = amountWasteWater;
    }

    @Override
    public void executeRequest(GateID gateID) {

    }

    @Override
    public void setFlashingLightOn() {

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
    public void notifyGroundOperation(ServiceVehicleWasteWaterReceipt serviceVehicleWasteWaterReceipt) {

    }

    @Override
    public void pumpOut(IWasteWaterTank wasteWaterTank) {

    }

    public int getAmountWasteWater() {
        return amountWasteWater;
    }

    public void setAmountWasteWater(int amountWasteWater) {
        this.amountWasteWater = amountWasteWater;
    }
}

