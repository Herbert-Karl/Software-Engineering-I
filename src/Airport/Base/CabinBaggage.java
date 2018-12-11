package Airport.Base;

import java.util.UUID;

public class CabinBaggage extends Baggage{
    public CabinBaggage(String content, double weight){
        setContent(content);
       setWeight(weight);
        setSecurityStatus(null);
    }
}