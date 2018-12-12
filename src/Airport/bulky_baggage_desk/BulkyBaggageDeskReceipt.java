package Airport.bulky_baggage_desk;

public class BulkyBaggageDeskReceipt {
    private String uuid;
    private int bulkyBaggageDeskID;
    private int numberOfPassenger;
    private int numberOfBulkyBaggage;
    private int numberOfBaggagIdentificationTag;

    public BulkyBaggageDeskReceipt(String uuid, int bulkyBaggageDeskID, int numberOfPassenger, int numberOfBulkyBaggage, int numberOfBaggagIdentificationTag) {
        this.uuid = uuid;
        this.bulkyBaggageDeskID = bulkyBaggageDeskID;
        this.numberOfPassenger = numberOfPassenger;
        this.numberOfBulkyBaggage = numberOfBulkyBaggage;
        this.numberOfBaggagIdentificationTag = numberOfBaggagIdentificationTag;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getBulkyBaggageDeskID() {
        return bulkyBaggageDeskID;
    }

    public void setBulkyBaggageDeskID(int bulkyBaggageDeskID) {
        this.bulkyBaggageDeskID = bulkyBaggageDeskID;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public int getNumberOfBulkyBaggage() {
        return numberOfBulkyBaggage;
    }

    public void setNumberOfBulkyBaggage(int numberOfBulkyBaggage) {
        this.numberOfBulkyBaggage = numberOfBulkyBaggage;
    }

    public int getNumberOfBaggagIdentificationTag() {
        return numberOfBaggagIdentificationTag;
    }

    public void setNumberOfBaggagIdentificationTag(int numberOfBaggagIdentificationTag) {
        this.numberOfBaggagIdentificationTag = numberOfBaggagIdentificationTag;
    }
}
