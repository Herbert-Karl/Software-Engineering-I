package Airport.service_vehicle;

import Airplane.Aircraft.Airplane;
import Airport.airport.Airport;
import Airport.airport.Gate;

public abstract class Vehicle {
    private String uuid;
    private String type;
    private String id;
    private int speedInMPH;
    private boolean isFlashingLightOn;
    private Gate gate;
    private Airplane connectedAirplane;
    private Airport airport;

    public Vehicle(String uuid, String type, String id, int speedInMPH, boolean isFlashingLightOn, Gate gate, Airplane connectedAirplane, Airport airport) {
        this.uuid = uuid;
        this.type = type;
        this.id = id;
        this.speedInMPH = speedInMPH;
        this.isFlashingLightOn = isFlashingLightOn;
        this.gate = gate;
        this.connectedAirplane = connectedAirplane;
        this.airport = airport;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSpeedInMPH() {
        return speedInMPH;
    }

    public void setSpeedInMPH(int speedInMPH) {
        this.speedInMPH = speedInMPH;
    }

    public boolean isFlashingLightOn() {
        return isFlashingLightOn;
    }

    public void setFlashingLightOn(boolean flashingLightOn) {
        isFlashingLightOn = flashingLightOn;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Airplane getConnectedAirplane() {
        return connectedAirplane;
    }

    public void setConnectedAirplane(Airplane connectedAirplane) {
        this.connectedAirplane = connectedAirplane;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}
