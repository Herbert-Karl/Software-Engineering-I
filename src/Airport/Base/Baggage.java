package Airport.Base;

import java.util.UUID;

public abstract class Baggage {

  protected String uuid;
  protected String content;
  protected double weight;
  protected BaggageSecurityStatus securityStatus;

  public BaggageSecurityStatus getSecurityStatus() {
    return securityStatus;
  }

  public double getWeight() {
    return weight;
  }

  public String getUuid() {
	    return uuid;
  }

  public String getContent() {
	    return content;
  }

  public void setWeight(final double weight) {
    this.weight = weight;
  }

  public void setSecurityStatus(final BaggageSecurityStatus securityStatus) {
	    this.securityStatus = securityStatus;
  }
}
