package Airport.AirCargoPalletLifter;

import Airport.Airport.Airport;
import Airport.Airport.AirportResourcePool;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Base.AirCargoPallet;

public class AirCargoPalletVehicle implements IAirCargoPalletVehicle {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private AirCargoPallet airCargoPallet;
    private IAirCargoPalletLifter connectedAirCargoPalletLifter;
    private Gate gate;
    private AirCargoPalletPackingUnit airCargoPalletPackingUnit;

    public AirCargoPalletVehicle(String uuid, String id, String type, int speedInMPH, boolean isFlashingLightOn, AirCargoPallet airCargoPallet, IAirCargoPalletLifter connectedAirCargoPalletLifter, Gate gate, AirCargoPalletPackingUnit airCargoPalletPackingUnit) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.speedInMPH = speedInMPH;
        this.isFlashingLightOn = isFlashingLightOn;
        this.airCargoPallet = airCargoPallet;
        this.connectedAirCargoPalletLifter = connectedAirCargoPalletLifter;
        this.gate = gate;
        this.airCargoPalletPackingUnit = airCargoPalletPackingUnit;
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

    public AirCargoPallet getAirCargoPallet() {
        return airCargoPallet;
    }

    public IAirCargoPalletLifter getConnectedAirCargoPalletLifter() {
        return connectedAirCargoPalletLifter;
    }

    public Gate getGate() {
        return gate;
    }

    public AirCargoPalletPackingUnit getAirCargoPalletPackingUnit()
    {
        return airCargoPalletPackingUnit;
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

    public void setAirCargoPallet(AirCargoPallet airCargoPallet) {
        this.airCargoPallet = airCargoPallet;
    }

    public void setConnectedAirCargoPalletLifter(IAirCargoPalletLifter connectedAirCargoPalletLifter) {
        this.connectedAirCargoPalletLifter = connectedAirCargoPalletLifter;
    }

    public void setAirCargoPalletPackingUnit(AirCargoPalletPackingUnit airCargoPalletPackingUnit)
    {
        this.airCargoPalletPackingUnit = airCargoPalletPackingUnit;
    }


@Override
    public void executeRequest(GateID gateID){}
    @Override
    public void store(AirCargoPallet airCargoPallet){this.airCargoPallet =airCargoPallet;}
    @Override
    public void setFlashingLightOn(){setFlashingLightOn(true);}
    @Override
    public void move(int speedInMPH){setSpeedInMPH(speedInMPH);}
    @Override
    public void stop(){setSpeedInMPH(0);}
    @Override
    public void setGate(GateID gateID){this.gate.setGateID(gateID);}
    @Override
    public void connect(IAirCargoPalletLifter airCargoPalletLifter){setConnectedAirCargoPalletLifter(airCargoPalletLifter);}
    @Override
    public void transferPalletToLifter(AirCargoPalletLifter airCargoPalletLifter, AirCargoPallet airCargoPallet){airCargoPalletLifter.setAirCargoPallet(airCargoPallet);
    this.setAirCargoPallet(null);}
    @Override
    public void disconnectFromLifter(){setConnectedAirCargoPalletLifter(null);}
    @Override
    public void returnToAirCargoPalletPackingUnit(AirCargoPalletPackingUnit airCargoPalletPackingUnit){airCargoPalletPackingUnit.setAirCargoPalletVehicel(this);}
    @Override
    public void setFlashingLightOff(){setFlashingLightOn(false);}
    @Override
    public void returnToAirportResourcePool(AirportResourcePool airportResourcePool){airportResourcePool.returnResource(this);}

}
