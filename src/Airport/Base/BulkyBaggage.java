package Airport.Base;

public class BulkyBaggage extends Baggage{
    private BulkyBaggageType type;
    private BaggageIdentificationTag baggageIdentificationTag;

    public BulkyBaggage(String content, double weight){
        setContent(content);
        setWeight(weight);
        setSecurityStatus(null);
    }

    ///
    /// Getter:
    ///

    public BulkyBaggageType getType() {
        return type;
    }

    public BaggageIdentificationTag getBaggageIdentificationTag() {
        return baggageIdentificationTag;
    }

    public void setBaggageIdentificationTag(BaggageIdentificationTag baggageIdentificationTag) {
        this.baggageIdentificationTag = baggageIdentificationTag;
    }

    public void setType(BulkyBaggageType type) {
        this.type = type;
    }
}