package Airport.Service_Vehicle;

import Airplane.Aircraft.Airplane;
import Airplane.Tanks.*;
import Airport.Airport.Airport;
import Airport.Airport.Gate;
import Airport.Airport.GateID;

public class ServiceVehicleBase implements IServiceVehicleBase {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private int amountAPUOil;
    private int amountEngineOil;
    private Gate gate;
    private Airplane connectedAirplane;
    private Airport airport;

    public ServiceVehicleBase(String uuid, String id, String type, int speedInMPH, boolean isFlashingLightOn, Gate gate, Airplane connectedAirplane, Airport airport) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.isFlashingLightOn = isFlashingLightOn;
        this.amountAPUOil = 1000;
        this.amountEngineOil = 1000;
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

    public int getAmountAPUOil() {
        return amountAPUOil;
    }

    public int getAmountEngineOil() {
        return amountEngineOil;
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

    public void setAmountAPUOil(int amountAPUOil) {
        this.amountAPUOil = amountAPUOil;
    }

    public void setAmountEngineOil(int amountEngineOil) {
        this.amountEngineOil = amountEngineOil;
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
        connectToAirplane(searchAirplaneByGate(gate));
        //EngineOilTank
        connectedAirplane.getLeftWing().getEngineOilTankArrayList().forEach(e -> increaseLevel(e));
        connectedAirplane.getRightWing().getEngineOilTankArrayList().forEach(e -> increaseLevel(e));
        //APUOilTank
        connectedAirplane.getBody().getApuOilTankArrayList().forEach(e -> increaseLevel(e));

        connectedAirplane.getBody().getBatteryList().forEach(e -> charge(e));

        connectedAirplane.getBody().getFireExtinguisherArrayList().forEach(e -> change(e));

        connectedAirplane.getLeftWing().getDeIcingSystemArrayList().forEach(e -> refill(e));
        connectedAirplane.getRightWing().getDeIcingSystemArrayList().forEach(e -> refill(e));
        disconnectFromAirplane();
        setFlashingLightOff();
        notifyGroundOperations(new ServiceVehicleBaseReceipt(getUuid(), getId(), getGate().getGateID(), getAmountAPUOil(),getAmountEngineOil(), 100, 100));
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
    public void setGateID(GateID gateID) {
        setGate(searchGateById(gateID));
    }

    @Override
    public void connectToAirplane(Airplane airplane) {
        setConnectedAirplane(airplane);
    }

    @Override
    public void increaseLevel(IAPUOilTank apuOilTank) {
        if (getAmountAPUOil() > 0) {
            apuOilTank.increaseLevel(getAmountEngineOil());
            setAmountAPUOil(0);
        } else {
            System.err.println("ServiceVehicleBase Error: No ApuOil left!");
        }
    }

    @Override
    public void charge(IBattery battery) {
        battery.charge();
    }

    @Override
    public void increaseLevel(IEngineOilTank engineOilTank) {
        if(getAmountEngineOil() > 0) {
            engineOilTank.increaseLevel(getAmountEngineOil());
            setAmountEngineOil(0);
        } else {
            System.err.println("ServiceVehicleBase Error: No EngineOil left!");
        }
    }

    @Override
    public void change(IFireExtinguisher fireExtinguisher) {
        fireExtinguisher.refill();
    }

    @Override
    public void refill(IDeIcingSystem deIcingSystem) {
        deIcingSystem.refill();
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
            System.err.println("ServiceVehicleBase Error: Flashinglights already off!");
        }
    }

    @Override
    public void notifyGroundOperations(ServiceVehicleBaseReceipt serviceVehicleBaseReceipt) {

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
