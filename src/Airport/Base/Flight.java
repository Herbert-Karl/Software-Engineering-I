package Airport.Base;

import Airport.Airport.GateID;


public class Flight{
    private String id;
    private Carrier carrier;
    private Destination destination;
    private GateID gateID;

    public Flight (String id, Carrier carrier, Destination destination, GateID gateID){
        this.id = id;
        this.carrier = carrier;
        this.destination = destination;
        this.gateID = gateID;
    }

    ///
    /// Getter:
    ///

    public String getId() {
        return id;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public Destination getDestination() {
        return destination;
    }

    public GateID getGateID() {
        return gateID;
    }

    ///
    /// Setter:
    ///


    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public void setGateID(GateID gateID) {
        this.gateID = gateID;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }
}