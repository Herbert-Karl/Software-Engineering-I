package Airplane.Aircraft;

public class Airplane {
    IBody body;
    IWing leftWing;
    IWing rightWing;
    Flight flight;
    int numberOfSeatTicketClassEconomy;
    int numberofSeatTicketClassBusiness;
    int numberOfSeatTicketClassFirst;

    public Airplane(IBody body, IWing leftWing, IWing rightWing, Flight flight, int numberOfSeatTicketClassEconomy, int numberofSeatTicketClassBusiness, int numberOfSeatTicketClassFirst) {
        this.body = body;
        this.leftWing = leftWing;
        this.rightWing = rightWing;
        this.flight = flight;
        this.numberOfSeatTicketClassEconomy = numberOfSeatTicketClassEconomy;
        this.numberofSeatTicketClassBusiness = numberofSeatTicketClassBusiness;
        this.numberOfSeatTicketClassFirst = numberOfSeatTicketClassFirst;
    }

    public void build() {

    }

    public void startup() {

    }

    public void taxi() {

    }

    public void takeOff() {

    }

    public void climbing() {

    }

    public void rightTurn() {

    }

    public void leftTurn() {

    }

    public IBody getBody() {
        return body;
    }

    public void setBody(IBody body) {
        this.body = body;
    }

    public IWing getLeftWing() {
        return leftWing;
    }

    public void setLeftWing(IWing leftWing) {
        this.leftWing = leftWing;
    }

    public IWing getRightWing() {
        return rightWing;
    }

    public void setRightWing(IWing rightWing) {
        this.rightWing = rightWing;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getNumberOfSeatTicketClassEconomy() {
        return numberOfSeatTicketClassEconomy;
    }

    public void setNumberOfSeatTicketClassEconomy(int numberOfSeatTicketClassEconomy) {
        this.numberOfSeatTicketClassEconomy = numberOfSeatTicketClassEconomy;
    }

    public int getNumberofSeatTicketClassBusiness() {
        return numberofSeatTicketClassBusiness;
    }

    public void setNumberofSeatTicketClassBusiness(int numberofSeatTicketClassBusiness) {
        this.numberofSeatTicketClassBusiness = numberofSeatTicketClassBusiness;
    }

    public int getNumberOfSeatTicketClassFirst() {
        return numberOfSeatTicketClassFirst;
    }

    public void setNumberOfSeatTicketClassFirst(int numberOfSeatTicketClassFirst) {
        this.numberOfSeatTicketClassFirst = numberOfSeatTicketClassFirst;
    }
}
