package stowage_cargo;

public class ContainerProfile {

    private String destination;

    private int numberOfBaggages;

    // Konstruktor
    // Parameter:
    //  destination ->
    //  numberBaggages ->
    ContainerProfile(String destination, int numberBaggages) {
        this.destination = destination;
        this.numberOfBaggages = numberBaggages;
    }
}
