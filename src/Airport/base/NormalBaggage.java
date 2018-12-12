package Airport.base;

public class NormalBaggage extends Baggage {
    private BaggageIdentificationTag baggageIdentificationTag;

    public NormalBaggage(String uuid, String content, double weight, BaggageSecurityStatus securityStatus, BaggageIdentificationTag baggageIdentificationTag) {
        super(uuid, content, weight, securityStatus);
        this.baggageIdentificationTag = baggageIdentificationTag;
    }

    public BaggageIdentificationTag getBaggageIdentificationTag() {
        return baggageIdentificationTag;
    }

    public void setBaggageIdentificationTag(BaggageIdentificationTag baggageIdentificationTag) {
        this.baggageIdentificationTag = baggageIdentificationTag;
    }
}
