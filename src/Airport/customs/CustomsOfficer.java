package Airport.customs;

import Airport.base.*;

public class CustomsOfficer extends Employee {
    public CustomsOfficer(String uuid, int id, String name, Gender gender, IDCard idCard) {
        super(uuid, id, name, gender, idCard);
    }

    public boolean verify(Passport passport, BoardingPass boardingPass) {
        return false;
    }

    public void take(Baggage baggage) {

    }

    public void take(Item item) {

    }
}
