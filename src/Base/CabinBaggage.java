package Base;

public class CabinBaggage extends Baggage{
    public CabinBaggage(String uuid, String content, double weight){
        this.uuid = uuid;
        this.content = content;
        this.weight = weight;
        this.securityStatus = null;
    }
}