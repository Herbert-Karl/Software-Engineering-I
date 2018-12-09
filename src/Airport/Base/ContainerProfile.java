package Ariport.Base;

public class ContainerProfile {
    private string destination;
    private string stowagePositionID;
    private int numberOfBaggage;
    private double totalWeight;

    public ContainerProfile(String destination, String stowagePositionID, int numberOfBaggage, double totalWeight) {
        this.destination = destination;
        this.stowagePositionID = stowagePositionID;
        this.numberOfBaggage = numberOfBaggage;
        this.totalWeight = totalWeight;
    }
}