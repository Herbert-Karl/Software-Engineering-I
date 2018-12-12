package Airport.base;

public class ContainerProfile {
    private String destination;
    private String stowagePositionID;
    private int numberOfBaggage;
    private double loadWeight;

    public ContainerProfile(String destination, String stowagePositionID, int numberOfBaggage, double loadWeight) {
        this.destination = destination;
        this.stowagePositionID = stowagePositionID;
        this.numberOfBaggage = numberOfBaggage;
        this.loadWeight = loadWeight;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStowagePositionID() {
        return stowagePositionID;
    }

    public void setStowagePositionID(String stowagePositionID) {
        this.stowagePositionID = stowagePositionID;
    }

    public int getNumberOfBaggage() {
        return numberOfBaggage;
    }

    public void setNumberOfBaggage(int numberOfBaggage) {
        this.numberOfBaggage = numberOfBaggage;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }
}
