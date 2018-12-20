package Airport.Base;

import java.util.UUID;

public class BulkyBaggage extends Baggage{
    private BulkyBaggageType type;
    private BaggageIdentificationTag baggageIdentificationTag;

    public BulkyBaggage(String content){
    	final UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
    	this.content = content;
        // IdentificationTag und weight wird erst nach dem Check In vergeben.
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

    // Setter
    public void setBaggageIdentificationTag(BaggageIdentificationTag baggageIdentificationTag) {
        this.baggageIdentificationTag = baggageIdentificationTag;
    }

    public void setType(BulkyBaggageType type) {
        this.type = type;
    }
}