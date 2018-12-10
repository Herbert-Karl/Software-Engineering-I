package Airplane.Aircraft;

import Airport.base.Flight;

public class A350 extends Airplane {
    public A350(IBody body, IWing leftWing, IWing rightWing, Flight flight, int numberOfSeatTicketClassEconomy, int numberOfSeatTicketClassBusiness, int numberOfSeatTicketClassFirst) {
        super(body, leftWing, rightWing, flight, numberOfSeatTicketClassEconomy, numberOfSeatTicketClassBusiness, numberOfSeatTicketClassFirst);
    }
}
