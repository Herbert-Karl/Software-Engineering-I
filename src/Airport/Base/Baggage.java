package Airport.Base;

public abstract class Baggage{
    private String uuid;
    private String content;
    private double weight;
    private BaggageSecurityStatus securityStatus;

    public BaggageSecurityStatus getSecurityStatus() {
        return securityStatus;
    }

    public double getWeight() {
        return weight;
    }
}