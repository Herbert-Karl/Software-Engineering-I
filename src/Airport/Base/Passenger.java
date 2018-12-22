package Airport.Base;

import java.util.ArrayList;
import java.util.UUID;

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

    public Passenger(String name, String content, String birthDate, Gender gender, Passport passport, ArrayList<Baggage> baggageList,
                     String ticketClassString, PassengerStatus status){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
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

    public Passenger(){}

    ///
    /// Getter:
    ///


    public String getTicketClassString() {
        return ticketClassString;
    }

    public BoardingPass getBoardingPass(){
        return this.boardingPass;
    }

    public PassengerStatus getStatus() {
        return status;
    }

    public Passport getPassport() {
        return passport;
    }

    public String getContent() {
        return content;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public String getUuid() {
        return uuid;
    }

    public Gender getGender() {
        return gender;
    }

    public ArrayList<Baggage> getBaggageList() {
        return baggageList;
    }

    ///
    /// Setter
    ///
    public void setStatus(PassengerStatus status) {
        this.status = status;
    }

    public void setBaggageList(ArrayList<Baggage> baggageList) {
        //this.baggageList = baggageList;
    	this.baggageList.addAll(baggageList);
    }
}
