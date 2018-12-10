package Airplane.Aircraft;

import Airport.base.Flight;

public class A380 extends Airplane {
    public A380(IBody body, IWing leftWing, IWing rightWing, Flight flight, int numberOfSeatTicketClassEconomy, int numberofSeatTicketClassBusiness, int numberOfSeatTicketClassFirst) {
        super(body, leftWing, rightWing, flight, numberOfSeatTicketClassEconomy, numberofSeatTicketClassBusiness, numberOfSeatTicketClassFirst);
    }
}
