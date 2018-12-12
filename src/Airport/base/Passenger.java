package Airport.base;

import java.util.ArrayList;

public class Passenger {
    private String uuid;
    private String name;
    private String content;
    private String birthDate;
    private Gender gender;
    private Passport passport;
    private ArrayList<Baggage> baggageArrayList;
    private String ticketClassString;
    private BoardingPass boardingPass;
    private PassengerStatus status;

    public Passenger(String uuid, String name, String content, String birthDate, Gender gender, Passport passport, ArrayList<Baggage> baggageArrayList, String ticketClassString, BoardingPass boardingPass, PassengerStatus status) {
        this.uuid = uuid;
        this.name = name;
        this.content = content;
        this.birthDate = birthDate;
        this.gender = gender;
        this.passport = passport;
        this.baggageArrayList = baggageArrayList;
        this.ticketClassString = ticketClassString;
        this.boardingPass = boardingPass;
        this.status = status;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public ArrayList<Baggage> getBaggageArrayList() {
        return baggageArrayList;
    }

    public void setBaggageArrayList(ArrayList<Baggage> baggageArrayList) {
        this.baggageArrayList = baggageArrayList;
    }

    public String getTicketClassString() {
        return ticketClassString;
    }

    public void setTicketClassString(String ticketClassString) {
        this.ticketClassString = ticketClassString;
    }

    public BoardingPass getBoardingPass() {
        return boardingPass;
    }

    public void setBoardingPass(BoardingPass boardingPass) {
        this.boardingPass = boardingPass;
    }

    public PassengerStatus getStatus() {
        return status;
    }

    public void setStatus(PassengerStatus status) {
        this.status = status;
    }
}
