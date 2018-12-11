package Airport.baggage_sorting_unit;

import Airport.base.DestinationBox;

public class BaggageSortingUnitReceipt {
    private String uuid;
    private int numberOfBaggageScanned;
    private int numberOfDamgerousBaggage;
    private DestinationBox destinationBox;
    private int numberOfFirstClass;
    private int numberOfBusinessClass;
    private int numberOfEconomyClass;
    private int numberOfNormalBaggage;
    private int numberOfBulkyBaggage;

    public BaggageSortingUnitReceipt(String uuid, int numberOfBaggageScanned, int numberOfDamgerousBaggage, DestinationBox destinationBox, int numberOfFirstClass, int numberOfBusinessClass, int numberOfEconomyClass, int numberOfNormalBaggage, int numberOfBulkyBaggage) {
        this.uuid = uuid;
        this.numberOfBaggageScanned = numberOfBaggageScanned;
        this.numberOfDamgerousBaggage = numberOfDamgerousBaggage;
        this.destinationBox = destinationBox;
        this.numberOfFirstClass = numberOfFirstClass;
        this.numberOfBusinessClass = numberOfBusinessClass;
        this.numberOfEconomyClass = numberOfEconomyClass;
        this.numberOfNormalBaggage = numberOfNormalBaggage;
        this.numberOfBulkyBaggage = numberOfBulkyBaggage;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getNumberOfBaggageScanned() {
        return numberOfBaggageScanned;
    }

    public void setNumberOfBaggageScanned(int numberOfBaggageScanned) {
        this.numberOfBaggageScanned = numberOfBaggageScanned;
    }

    public int getNumberOfDamgerousBaggage() {
        return numberOfDamgerousBaggage;
    }

    public void setNumberOfDamgerousBaggage(int numberOfDamgerousBaggage) {
        this.numberOfDamgerousBaggage = numberOfDamgerousBaggage;
    }

    public DestinationBox getDestinationBox() {
        return destinationBox;
    }

    public void setDestinationBox(DestinationBox destinationBox) {
        this.destinationBox = destinationBox;
    }

    public int getNumberOfFirstClass() {
        return numberOfFirstClass;
    }

    public void setNumberOfFirstClass(int numberOfFirstClass) {
        this.numberOfFirstClass = numberOfFirstClass;
    }

    public int getNumberOfBusinessClass() {
        return numberOfBusinessClass;
    }

    public void setNumberOfBusinessClass(int numberOfBusinessClass) {
        this.numberOfBusinessClass = numberOfBusinessClass;
    }

    public int getNumberOfEconomyClass() {
        return numberOfEconomyClass;
    }

    public void setNumberOfEconomyClass(int numberOfEconomyClass) {
        this.numberOfEconomyClass = numberOfEconomyClass;
    }

    public int getNumberOfNormalBaggage() {
        return numberOfNormalBaggage;
    }

    public void setNumberOfNormalBaggage(int numberOfNormalBaggage) {
        this.numberOfNormalBaggage = numberOfNormalBaggage;
    }

    public int getNumberOfBulkyBaggage() {
        return numberOfBulkyBaggage;
    }

    public void setNumberOfBulkyBaggage(int numberOfBulkyBaggage) {
        this.numberOfBulkyBaggage = numberOfBulkyBaggage;
    }
}
