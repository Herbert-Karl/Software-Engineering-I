package Airport.service_vehicle;

import Airplane.Aircraft.Airplane;
import Airplane.tank_bottle.IPotableWaterTank;
import Airport.airport.Airport;
import Airport.airport.Gate;
import Airport.airport.GateID;

public class ServiceVehicleFreshWater extends Vehicle implements IServiceVehicleFreshWater {
    private int amountFreshWater;

    public ServiceVehicleFreshWater(String uuid, String type, String id, int speedInMPH, boolean isFlashingLightOn, Gate gate, Airplane connectedAirplane, Airport airport) {
        super(uuid, type, id, speedInMPH, isFlashingLightOn, gate, connectedAirplane, airport);
        this.amountFreshWater = 10000;
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
    public void notifyGroundOperation(ServiceVehicleFreshWaterReceipt serviceVehicleFreshWaterReceipt) {

    }

    @Override
    public void refill(IPotableWaterTank potableWaterTank) {

    }

    public int getAmountFreshWater() {
        return amountFreshWater;
    }

    public void setAmountFreshWater(int amountFreshWater) {
        this.amountFreshWater = amountFreshWater;
    }
}
