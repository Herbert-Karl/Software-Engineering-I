package Airport.Service_Vehicle;

import Airplane.Aircraft.Airplane;
import Airplane.Tanks.IWasteWaterTank;
import Airport.Airport.Airport;
import Airport.Airport.Gate;
import Airport.Airport.GateID;

public class ServiceVehicleWasteWater implements IServiceVehicleWasteWater {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private int amountWasteWater;
    private Gate gate;
    private Airplane connectedAirplane;
    private Airport airport;

    public ServiceVehicleWasteWater(String uuid, String id, String type, int speedInMPH, boolean isFlashingLightOn, int amountWasteWater, Gate gate, Airplane connectedAirplane, Airport airport) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.isFlashingLightOn = isFlashingLightOn;
        this.amountWasteWater = amountWasteWater;
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

    public int getAmountWasteWater() {
        return amountWasteWater;
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

    public void setAmountWasteWater(int amountWasteWater) {
        this.amountWasteWater = amountWasteWater;
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
        //WasteWater
        connectedAirplane.getBody().getWasteWaterTankArrayList().forEach(e -> pumpOut(e));
        disconnectFromAirplane();
        setFlashingLightOff();
        notifyGroundOperations(new ServiceVehicleWasteWaterReceipt(getUuid(),getId(),getGate().getGateID(),getAmountWasteWater()));
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
    public void setGateID(GateID gateID) {
        setGate(searchGateById(gateID));
    }

    @Override
    public void connectToAirplane(Airplane airplane) {
        setConnectedAirplane(airplane);
    }

    @Override
    public void pumpOut(IWasteWaterTank wasteWaterTank) {
        wasteWaterTank.pumpOut();
        setAmountWasteWater(1000);
    }

    @Override
    public void disconnectFromAirplane() {
        setConnectedAirplane(null);
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
    public void notifyGroundOperations(ServiceVehicleWasteWaterReceipt serviceVehicleWasteWaterReceipt) {

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
