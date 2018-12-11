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
}