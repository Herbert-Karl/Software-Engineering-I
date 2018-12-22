package Airport.Customs;

import Airport.Base.*;
import Airport.Customs.Customs;

import java.util.Random;
import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

public class CustomsOfficer {
    Random rnd = new Random();

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }

    public Customs getCustoms() {
        return customs;
    }

    public void setCustoms(Customs customs) {
        this.customs = customs;
    }

    public CustomsOfficer(String uuid, int id, String name, Gender gender, IDCard idCard, Customs customs) {
        this.uuid = java.util.UUID.randomUUID().toString();
        this.id = rnd.nextInt();
        this.name = name;
        this.gender = gender;
        this.idCard = idCard;
        this.customs = customs;
    }

    private String uuid;
    private int id;
    private String name;
    private Gender gender;
    private IDCard idCard;
    private Customs customs;

    boolean verify (Passport passport, BoardingPass boardingPass){
        if (boardingPass.getPassenger()==passport.getPassenger()) {
            return true;
        }
            else {
            return false;
        }
    }

    void take (Baggage baggage){
        ArrayList<Baggage> tmpBaggageList = new ArrayList<>();
        tmpBaggageList.add(baggage);
        customs.handOverBaggageToFederalPolice(tmpBaggageList);
    }

    void take (Item item){
        ArrayList<Item> tmpItemList = new ArrayList<>();
        tmpItemList.add(item);
        customs.handOverItemsToFederalPolice(tmpItemList);
    }
}