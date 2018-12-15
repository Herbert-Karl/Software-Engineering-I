package Airport.Base;

import Airport.Base.Baggage;

public class NormalBaggage extends Baggage{
    private BaggageIdentificationTag baggageIdentificationTag;

    public NormalBaggage(String content, double weight){
        setContent(content);
        setWeight(weight);
        setSecurityStatus(null);
        // IdentificationTag wird erst nach dem Check In vergeben.
    }

    public BaggageIdentificationTag getBaggageIdentificationTag() {
        return baggageIdentificationTag;
    }

    public void setBaggageIdentificationTag(BaggageIdentificationTag baggageIdentificationTag) {
        this.baggageIdentificationTag = baggageIdentificationTag;
    }
}