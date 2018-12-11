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
}