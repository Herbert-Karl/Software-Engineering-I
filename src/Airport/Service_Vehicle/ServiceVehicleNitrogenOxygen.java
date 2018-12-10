package Airport.Service_Vehicle;

import Airplane.Aircraft.Airplane;
import Airplane.Tanks.INitrogenBottle;
import Airplane.Tanks.IOxygenBottle;
import Airport.Airport.Airport;
import Airport.Airport.Gate;
import Airport.Airport.GateID;

public class ServiceVehicleNitrogenOxygen implements IServiceVehicleNitrogenOxygen {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private boolean isElectricalGrounded;
    private int amountNitrogen;
    private int amountOxygen;
    private Gate gate;
    private Airplane connectedAirplane;
    private Airport airport;

    public ServiceVehicleNitrogenOxygen(String uuid, String id, String type, int speedInMPH, boolean isFlashingLightOn, boolean isElectricalGrounded, Gate gate, Airplane connectedAirplane, Airport airport) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.isFlashingLightOn = isFlashingLightOn;
        this.isElectricalGrounded = isElectricalGrounded;
        this.amountNitrogen = 1000;
        this.amountOxygen = 1000;
        this.gate = gate;
        this.connectedAirplane = connectedAirplane;
        this.airport = airport;
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

    public boolean isFlashingLightOn() {
        return isFlashingLightOn;
    }

    public boolean isElectricalGrounded() {
        return isElectricalGrounded;
    }

    public int getAmountNitrogen() {
        return amountNitrogen;
    }

    public int getAmountOxygen() {
        return amountOxygen;
    }

    public Gate getGate() {
        return gate;
    }

    public Airplane getConnectedAirplane() {
        return connectedAirplane;
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

    public void setFlashingLightOn(boolean flashingLightOn) {
        isFlashingLightOn = flashingLightOn;
    }

    public void setElectricalGrounded(boolean electricalGrounded) {
        isElectricalGrounded = electricalGrounded;
    }

    public void setAmountNitrogen(int amountNitrogen) {
        this.amountNitrogen = amountNitrogen;
    }

    public void setAmountOxygen(int amountOxygen) {
        this.amountOxygen = amountOxygen;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void setConnectedAirplane(Airplane connectedAirplane) {
        this.connectedAirplane = connectedAirplane;
    }

    @Override
    public void executeRequest(GateID gateID) {
        setGateID(gateID);
        setFlashingLightOn();
        move(15);
        stop();
        connectToAirplane(searchAirplaneByGate(getGate()));
        attachElectricalGrounding();
        //oxygen + Nitrogen
        connectedAirplane.getBody().getNitrogenBottleArrayList().forEach(e -> refill(e));
        connectedAirplane.getBody().getOxygenBottleArrayList().forEach(e -> refill(e));
        detachElectricalGrounding();
        setFlashingLightOff();
        notifyGroundOperations(new ServiceVehicleNitrogenOxygenReceipt(getUuid(),getId(),getGate().getGateID(),getAmountNitrogen(),getAmountOxygen()));
        returnToAirportResourcePool();
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
        if (isElectricalGrounded() == false) {
            setElectricalGrounded(true);
        } else {
            System.err.println("SkyTankingVehicle Error: already electrically grounded!");
        }
    }

    @Override
    public void setGateID(GateID gateID) {
        setGate(searchGateById(gateID));
    }

    @Override
    public void connectToAirplane(Airplane airplane) {
        setConnectedAirplane(airplane);
    }

    @Override
    public void refill(INitrogenBottle nitrogenBottle) {
        nitrogenBottle.refill(1000);
        setAmountNitrogen(0);
    }

    @Override
    public void refill(IOxygenBottle oxygenBottle) {
        oxygenBottle.refill(1000);
        setAmountOxygen(0);
    }

    @Override
    public void disconnectFromAirplane() {
        setConnectedAirplane(null);
    }

    @Override
    public void detachElectricalGrounding() {
        if (isElectricalGrounded() == true) {
            setElectricalGrounded(false);
        } else {
            System.err.println("SkyTankingVehicle Error: already electrically ungrounded");
        }
    }

    @Override
    public void setFlashingLightOff() {
        if (isFlashingLightOn() == true) {
            setFlashingLightOn(false);
        } else {
            System.err.println("SkyTankingVehicle Error: FlashingLight is already off");
        }
    }

    @Override
    public void notifyGroundOperations(ServiceVehicleNitrogenOxygenReceipt serviceVehicleNitrogenOxygenReceipt) {

    }

    @Override
    public void returnToAirportResourcePool() {
        setGate(null);
    }

    public Gate searchGateById(GateID gateID) {
        return airport.getGateList().stream().filter(gate -> gate.getGateID().equals(gateID)).findFirst().orElse(null);
    }

    public Airplane searchAirplaneByGate(Gate gate) {
        return gate.getAirplane();
    }
}
