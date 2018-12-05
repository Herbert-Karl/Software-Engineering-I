package Airport.Base;

public class BulkyBaggage extends Baggage{
    private BulkyBaggageType type;
    private BaggageIdentifikationTag baggageIdentifikationTag;

    public BulkyBaggage(String uuid, String content, double weight, BulkyBaggageType type, BaggageIdentifikationTag baggageIdentifikationTag){
        this.uuid = uuid;
        this.content = content;
        this.weight = weight;
        this.type = type;
        this.baggageIdentifikationTag = baggageIdentifikationTag;
        this.securityStatus = null;
    }

    public BulkyBaggageType getType() {
        return type;
    }

    public BaggageIdentifikationTag getBaggageIdentifikationTag() {
        return baggageIdentifikationTag;
    }
}