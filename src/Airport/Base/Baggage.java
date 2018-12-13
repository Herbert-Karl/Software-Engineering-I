package Airport.Base;

import java.util.UUID;

public abstract class Baggage {

  private final String uuid;

  private String content;

  private double weight;

  public void setSecurityStatus(final BaggageSecurityStatus securityStatus) {
    this.securityStatus = securityStatus;
  }

  private BaggageSecurityStatus securityStatus;

  public Baggage(final String content, final double weight) {
    this.content = content;
    this.weight = weight;
    final UUID uuid = UUID.randomUUID();
    this.uuid = uuid.toString();
  }

  public Baggage() {
    final UUID uuid = UUID.randomUUID();
    this.uuid = uuid.toString();
  }

  public BaggageSecurityStatus getSecurityStatus() {
    return securityStatus;
  }

  public double getWeight() {
    return weight;
  }

  public void setContent(final String content) {
    this.content = content;
  }

  public void setWeight(final double weight) {
    this.weight = weight;
  }

  public String getUuid() {
    return uuid;
  }

  public String getContent() {
    return content;
  }
}