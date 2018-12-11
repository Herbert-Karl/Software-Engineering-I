package Airport.sky_tanking_vehicle;
import Airplane.Aircraft.Airplane;
import Airplane.tank_bottle.IFuelTank;
import Airport.airport.Airport;
import Airport.airport.Gate;
import Airport.airport.GateID;
import Airport.service_vehicle.Vehicle;

public class SkyTankingVehicle extends Vehicle implements ISkyTankingVehicle {
    private IFuelTankDistributionManagement fuelTankDistributionManagement;
    private FuelPump fuelPump;
    private boolean isElectricallyGrounded;
    private int totalAmount;

    public SkyTankingVehicle(String uuid, String type, String id, int speedInMPH, boolean isFlashingLightOn, Gate gate, Airplane connectedAirplane, Airport airport, IFuelTankDistributionManagement fuelTankDistributionManagement, FuelPump fuelPump, boolean isElectricallyGrounded, int totalAmount) {
        super(uuid, type, id, speedInMPH, isFlashingLightOn, gate, connectedAirplane, airport);
        this.fuelTankDistributionManagement = fuelTankDistributionManagement;
        this.fuelPump = fuelPump;
        this.isElectricallyGrounded = isElectricallyGrounded;
        this.totalAmount = totalAmount;
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
    public void attachElectricalGrounding() {

    }

    @Override
    public void setGate(GateID gateID) {

    }

    @Override
    public void connectToAirplane() {

    }

    @Override
    public void pump(IFuelTank fuelTank, int amount) {

    }

    @Override
    public FuelReceipt print() {
        return null;
    }

    @Override
    public void disconnectFromAirplane() {

    }

    @Override
    public void detachElectricalGrounding() {

    }

    @Override
    public void setFlashingLightOff() {

    }

    @Override
    public void notifyGroundOperations(FuelReceipt fuelReceipt) {

    }

    public IFuelTankDistributionManagement getFuelTankDistributionManagement() {
        return fuelTankDistributionManagement;
    }

    public void setFuelTankDistributionManagement(IFuelTankDistributionManagement fuelTankDistributionManagement) {
        this.fuelTankDistributionManagement = fuelTankDistributionManagement;
    }

    public FuelPump getFuelPump() {
        return fuelPump;
    }

    public void setFuelPump(FuelPump fuelPump) {
        this.fuelPump = fuelPump;
    }

    public boolean isElectricallyGrounded() {
        return isElectricallyGrounded;
    }

    public void setElectricallyGrounded(boolean electricallyGrounded) {
        isElectricallyGrounded = electricallyGrounded;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
