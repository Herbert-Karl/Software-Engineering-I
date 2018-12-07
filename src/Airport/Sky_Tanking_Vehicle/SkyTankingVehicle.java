package Airport.Sky_Tanking_Vehicle;

import Airplane.Tanks.IFuelTank;
import Airport.Airport.Gate;
import Airport.Airport.GateID;

public class SkyTankingVehicle implements ISkyTankingVehicle {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private IFuelTankDistributionManagement fuelTankDistributionManagement;
    private FuelPump fuelPump;
    private boolean isFlashingLightOn;
    private boolean isElectricallyGrounded;
    private Gate gate;
    private Airplane connectedAirplane;
    private int totalAmount;

    public SkyTankingVehicle(String uuid, String id, String type, int speedInMPH, IFuelTankDistributionManagement fuelTankDistributionManagement, FuelPump fuelPump, boolean isFlashingLightOn, boolean isElectricallyGrounded, Gate gate, Airplane connectedAirplane, int totalAmount) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.fuelTankDistributionManagement = fuelTankDistributionManagement;
        this.fuelPump = fuelPump;
        this.isFlashingLightOn = isFlashingLightOn;
        this.isElectricallyGrounded = isElectricallyGrounded;
        this.gate = gate;
        this.connectedAirplane = connectedAirplane;
        this.totalAmount = totalAmount;
    }

    public String getUuid() {
        return uuid;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getSpeedInMPH() {
        return speedInMPH;
    }

    public IFuelTankDistributionManagement getFuelTankDistributionManagement() {
        return fuelTankDistributionManagement;
    }

    public FuelPump getFuelPump() {
        return fuelPump;
    }

    public boolean isFlashingLightOn() {
        return isFlashingLightOn;
    }

    public boolean isElectricallyGrounded() {
        return isElectricallyGrounded;
    }

    public Gate getGate() {
        return gate;
    }

    public Airplane getConnectedAirplane() {
        return connectedAirplane;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeedInMPH(int speedInMPH) {
        this.speedInMPH = speedInMPH;
    }

    public void setFuelTankDistributionManagement(IFuelTankDistributionManagement fuelTankDistributionManagement) {
        this.fuelTankDistributionManagement = fuelTankDistributionManagement;
    }

    public void setFuelPump(FuelPump fuelPump) {
        this.fuelPump = fuelPump;
    }

    public void setFlashingLightOn(boolean flashingLightOn) {
        isFlashingLightOn = flashingLightOn;
    }

    public void setElectricallyGrounded(boolean electricallyGrounded) {
        isElectricallyGrounded = electricallyGrounded;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void setConnectedAirplane(Airplane connectedAirplane) {
        this.connectedAirplane = connectedAirplane;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public void executeRequest(GateID gateID) {

    }

    @Override
    public void setFlashingLightOn() {
        if (isFlashingLightOn() == false) {
            setFlashingLightOn(true);
        } else {
            System.out.println("SkyTankingVehicle Error: FlashingLight is already on");
        }
    }

    @Override
    public void move(int speedInMPH) {
        setSpeedInMPH(speedInMPH);
    }

    @Override
    public void stop() {
        setSpeedInMPH(0);
    }

    @Override
    public void attachElectricalGrounding() {
        if (isElectricallyGrounded() == false) {
            setElectricallyGrounded(true);
        } else {
            System.out.println("SkyTankingVehicle Error: already electrically grounded!");
        }
    }

    @Override
    public void setGate(GateID gateID) {
        setGate(gateID);
    }

    @Override
    public void connectAirplane() {

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
        setConnectedAirplane(null);
    }

    @Override
    public void detachElectricalGrounding() {
        if (isElectricallyGrounded() == true) {
            setElectricallyGrounded(false);
        } else {
            System.out.println("SkyTankingVehicle Error: already electrically ungrounded");
        }
    }

    @Override
    public void setFlashingLightOff() {
        if (isFlashingLightOn() == true) {
            setFlashingLightOn(false);
        } else {
            System.out.println("SkyTankingVehicle Error: FlashingLight is already off");
        }
    }

    @Override
    public void notifyGroundOperations(FuelReceipt fuelReceipt) {

    }
}
