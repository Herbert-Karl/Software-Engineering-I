package Airport.Base;

import Airport.Base.Baggage;

public class NormalBaggage extends Baggage{
    private BaggageIdentificationTag baggageIdentificationTag;

    public NormalBaggage(String content, double weight, BaggageIdentificationTag baggageIdentificationTag){
        setContent(content);
        setWeight(weight);
        setSecurityStatus(null);
        this.baggageIdentificationTag = baggageIdentificationTag;
    }

    public BaggageIdentificationTag getBaggageIdentificationTag() {
        return baggageIdentificationTag;
    }
}