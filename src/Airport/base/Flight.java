package Airport.base;

import Airport.airport.GateID;

public class Flight {
    private String id;
    private Carrier carrier;
    private Destination destination;
    private GateID gateID;

    public Flight(String id, Carrier carrier, Destination destination, GateID gateID) {
        this.id = id;
        this.carrier = carrier;
        this.destination = destination;
        this.gateID = gateID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public GateID getGateID() {
        return gateID;
    }

    public void setGateID(GateID gateID) {
        this.gateID = gateID;
    }
}
