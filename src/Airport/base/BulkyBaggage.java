package Airport.base;

public class BulkyBaggage extends Baggage {
    private BulkyBaggageType type;
    private BaggageIdentificationTag baggageIdentificationTag;

    public BulkyBaggage(String uuid, String content, double weight, BaggageSecurityStatus securityStatus, BulkyBaggageType type, BaggageIdentificationTag baggageIdentificationTag) {
        super(uuid, content, weight, securityStatus);
        this.type = type;
        this.baggageIdentificationTag = baggageIdentificationTag;
    }

    public BulkyBaggageType getType() {
        return type;
    }

    public void setType(BulkyBaggageType type) {
        this.type = type;
    }

    public BaggageIdentificationTag getBaggageIdentificationTag() {
        return baggageIdentificationTag;
    }

    public void setBaggageIdentificationTag(BaggageIdentificationTag baggageIdentificationTag) {
        this.baggageIdentificationTag = baggageIdentificationTag;
    }
}
