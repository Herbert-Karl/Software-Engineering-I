package Airport.Bulky_Baggage_Desk;

public class BulkyBaggageDeskReceipt {
    private String uuid;
    private int bulkyBaggageDeskId;
    private int numberOfPassenger;
    private int numberOfBulkyBaggage;
    private int numberOfBaggageIdentificationTag;

    public BulkyBaggageDeskReceipt(int bulkyBaggageDeskId, int numberOfPassenger, int numberOfBulkyBaggage, int numberOfBaggageIdentificationTag){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        this.bulkyBaggageDeskId = bulkyBaggageDeskId;
        this.numberOfPassenger = numberOfPassenger;
        this.numberOfBulkyBaggage = numberOfBulkyBaggage;
        this.numberOfBaggageIdentificationTag = numberOfBaggageIdentificationTag;
    }
}
