package Airport.Customs;

import Airport.Base.*;

public class CustomsOfficer {
    String uuid;
    int id;
    String name;
    Gender gender;
    IDCard idCard;

    boolean verify (Passport passport, BoardingPass boardingPass){
        //passenger auf passport und boardingPass überprüfen und bool returnen
        return false;
    }

    void take (Baggage baggage){
        //baggagelist aus dem baggage erstellen und dem customs übergeben
    }

    void take (Item item){
        //itemlist aus dem item erstellen und dem customs übergeben
    }
}
