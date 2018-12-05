package Base;

public class NormalBaggage extends Baggage{
    private BaggageIdentificationTag baggageIdentifikationTag;

    public NormalBaggage(String uuid, String content, String weight, BaggageIdentifikationTag baggageIdentifikationTag){
        this.uuid = uuid;
        this.content = content;
        this.weight = weight;
        this.secutityStatus = null;
        this.baggageIdentifikationTag = baggageIdentifikationTag;
    }

    public BaggageIdentificationTag getBaggageIdentifikationTag() {
        return baggageIdentifikationTag;
    }
}