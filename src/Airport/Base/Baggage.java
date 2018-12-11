package Airport.Base;

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
        UUID uuid = UUID.ramdomUUID();
        this.uuid = uuid.toString();
    }

    public BaggageSecurityStatus getSecurityStatus() {
        return securityStatus;
    }

    public double getWeight() {
        return weight;
    }
}