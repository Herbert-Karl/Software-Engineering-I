package Airport.base;

public class Baggage {
    private String uuid;
    private String content;
    private double weight;
    private BaggageSecurityStatus securityStatus;

    public Baggage(String uuid, String content, double weight, BaggageSecurityStatus securityStatus) {
        this.uuid = uuid;
        this.content = content;
        this.weight = weight;
        this.securityStatus = securityStatus;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BaggageSecurityStatus getSecurityStatus() {
        return securityStatus;
    }

    public void setSecurityStatus(BaggageSecurityStatus securityStatus) {
        this.securityStatus = securityStatus;
    }
}
