package Airport.Base;

public class ContainerProfile {
    private String destination;
    private String stowagePositionID;
    private int numberOfBaggage;
    private double totalWeight;

    public ContainerProfile(String destination, String stowagePositionID, int numberOfBaggage, double totalWeight) {
        this.destination = destination;
        this.stowagePositionID = stowagePositionID;
        this.numberOfBaggage = numberOfBaggage;
        this.totalWeight = totalWeight;
    }

    ///
    /// Getter:
    ///


    public double getTotalWeight() {
        return totalWeight;
    }

    public int getNumberOfBaggage() {
        return numberOfBaggage;
    }

    public String getDestination() {
        return destination;
    }

    public String getStowagePositionID() {
        return stowagePositionID;
    }

    ///
    /// Setter:
    ///

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setNumberOfBaggage(int numberOfBaggage) {
        this.numberOfBaggage = numberOfBaggage;
    }

    public void setStowagePositionID(String stowagePositionID) {
        this.stowagePositionID = stowagePositionID;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }
}