package Airport.Base;

public abstract class Baggage{
    private String uuid;
    private String content;
    private double weight;
    private BaggageSecurityStatus securityStatus;

    public Baggage(String content, double weight){
        this.content = content;
        this.weight = weight;
        UUID uuid = UUID.ramdomUUID();
        this.uuid = uuid.toString();
    }

    public String getContent() {
        return content;
    }

    public BaggageSecurityStatus getSecurityStatus() {
        return securityStatus;
    }

    public double getWeight() {
        return weight;
    }
}