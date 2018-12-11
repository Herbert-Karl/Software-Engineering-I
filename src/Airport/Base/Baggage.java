package Airport.Base;

import java.util.UUID;

public abstract class Baggage{
    private String uuid;
    private String content;
    private double weight;

    public void setSecurityStatus(final BaggageSecurityStatus securityStatus) {
        this.securityStatus = securityStatus;
    }

    private BaggageSecurityStatus securityStatus;

    public Baggage(String content, double weight){
        this.content = content;
        this.weight = weight;
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
    }

    public Baggage(){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
    }

    public BaggageSecurityStatus getSecurityStatus() {
        return securityStatus;
    }

    public double getWeight() {
        return weight;
    }

    public void setContent(String content){
        this.content = content;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setSecurityStatus(BaggageSecurityStatus securityStatus){
        this.securityStatus = securityStatus;
    }
}