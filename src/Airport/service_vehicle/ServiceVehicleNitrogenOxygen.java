package Airport.service_vehicle;

import Airplane.Aircraft.Airplane;
import Airplane.tank_bottle.INitrogenBottle;
import Airplane.tank_bottle.IOxygenBottle;
import Airport.airport.Airport;
import Airport.airport.Gate;
import Airport.airport.GateID;

public class ServiceVehicleNitrogenOxygen extends Vehicle implements IServiceVehicleNitrogenOxygen {
    private boolean isElectricallyGrounded;
    private int amountOxygen;
    private int amountNitrogen;

    public ServiceVehicleNitrogenOxygen(String uuid, String type, String id, int speedInMPH, boolean isFlashingLightOn, Gate gate, Airplane connectedAirplane, Airport airport, boolean isElectricallyGrounded) {
        super(uuid, type, id, speedInMPH, isFlashingLightOn, gate, connectedAirplane, airport);
        this.isElectricallyGrounded = isElectricallyGrounded;
        this.amountNitrogen = 1000;
        this.amountOxygen = 1000;
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
    public void notifyGroundOperation(ServiceVehicleNitrogenOxygenReceipt serviceVehicleNitrogenOxygenReceipt) {

    }

    @Override
    public void attachElectricalGrounding() {

    }

    @Override
    public void dettachElectricalGrounding() {

    }

    @Override
    public void refill(IOxygenBottle oxygenBottle) {

    }

    @Override
    public void refill(INitrogenBottle nitrogenBottle) {

    }

    public boolean isElectricallyGrounded() {
        return isElectricallyGrounded;
    }

    public void setElectricallyGrounded(boolean electricallyGrounded) {
        isElectricallyGrounded = electricallyGrounded;
    }

    public int getAmountOxygen() {
        return amountOxygen;
    }

    public void setAmountOxygen(int amountOxygen) {
        this.amountOxygen = amountOxygen;
    }

    public int getAmountNitrogen() {
        return amountNitrogen;
    }

    public void setAmountNitrogen(int amountNitrogen) {
        this.amountNitrogen = amountNitrogen;
    }
}
