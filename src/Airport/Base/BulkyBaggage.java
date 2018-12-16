package Airport.Base;

public class BulkyBaggage extends Baggage{
    private BulkyBaggageType type;
    private BaggageIdentificationTag baggageIdentificationTag;

    public BulkyBaggage(String content, double weight, BulkyBaggageType type, BaggageIdentificationTag baggageIdentificationTag){
        setContent(content);
        setWeight(weight);
        this.type = type;
        this.baggageIdentificationTag = baggageIdentificationTag;
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
}