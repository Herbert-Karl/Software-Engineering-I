package Airport.Base;

import java.util.UUID;

public class CabinBaggage extends Baggage{
    public CabinBaggage(String content){
    	final UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
    	this.content = content;
    }
}