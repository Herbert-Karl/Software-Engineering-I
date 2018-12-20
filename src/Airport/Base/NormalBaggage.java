package Airport.Base;

import java.util.UUID;

import Airport.Base.Baggage;

public class NormalBaggage extends Baggage{
    private BaggageIdentificationTag baggageIdentificationTag;

    public NormalBaggage(String content){
    	final UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
    	this.content = content;
        // IdentificationTag und weight wird erst nach dem Check In vergeben.
    }

    public BaggageIdentificationTag getBaggageIdentificationTag() {
        return baggageIdentificationTag;
    }

    public void setBaggageIdentificationTag(BaggageIdentificationTag baggageIdentificationTag) {
        this.baggageIdentificationTag = baggageIdentificationTag;
    }
}