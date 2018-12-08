package Airport.Customs;

import Airport.Base.*;

public class CustomsOfficer {
    String uuid;
    int id;
    String name;
    Gender gender;
    IDCard idCard;

    boolean verify (Passport passport, BoardingPass boardingPass){

        return false;
    }

    void take (Baggage baggage){

    }

    void take (Item item){

    }
}
