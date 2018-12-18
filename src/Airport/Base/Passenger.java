package Airport.Base;

import java.util.ArrayList;

public class Passenger{
    private String uuid;
    private String name;
    private String content;
    private String birthDate;
    private Gender gender;
    private Passport passport;
    private ArrayList<Baggage> baggageList;
    private String ticketClassString;
    private BoardingPass boardingPass;
    private PassengerStatus status;

    public void setStatus(PassengerStatus status) {
        this.status = status;
    }

    public Passenger(String uuid, String name, String content, String birthDate, Gender gender, Passport passport, ArrayList<Baggage> baggageList,
                     String ticketClassString, PassengerStatus status){
        this.uuid = uuid;
        this.name = name;
        this.content = content;
        this.birthDate = birthDate;
        this.gender = gender;
        this.passport = passport;
        this.baggageList = baggageList;
        this.ticketClassString = ticketClassString;
        this.boardingPass = null;
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public BoardingPass getBoardingPass() {
        return boardingPass;
    }

    public ArrayList<Baggage> getBaggageList() {
        return baggageList;
    }
}