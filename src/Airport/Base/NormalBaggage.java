package Airport.Base;

public class NormalBaggage extends Baggage{
    private BaggageIdentificationTag baggageIdentificationTag;

    public NormalBaggage(String uuid, String content, String weight, BaggageIdentificationTag baggageIdentificationTag){
        this.uuid = uuid;
        this.content = content;
        this.weight = weight;
        this.secutityStatus = null;
        this.baggageIdentificationTag = baggageIdentificationTag;
    }

    public BaggageIdentificationTag getBaggageIdentificationTag() {
        return baggageIdentificationTag;
    }
}