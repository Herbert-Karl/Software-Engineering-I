package Airport.Baggage_Sorting_Unit.Receipts;

import Airport.Base.DestinationBox;

public class BaggageSortingUnitReceipt {

    private String uuid;

    private int numberOfBaggageScanned;

    private int numberOfDangerousBaggage;

    private DestinationBox destinationBox;

    private int numberOfBaggageFirstClass;

    private int numberOfBaggageBusinessClass;

    private int numberOfBaggageEconomyClass;

    private int numberOfContainerNormalBaggage;

    private int numberOfContainerBulkyBaggage;

    public BaggageSortingUnitReceipt(final String uuid, int numberOfContainerBulkyBaggage,
                                     int numberOfContainerNormalBaggage, int numberOfBaggageEconomyClass,
                                     int numberOfBaggageBusinessClass, int numberOfBaggageFirstClass,
                                     DestinationBox destinationBox, int numberOfDangerousBaggage, int numberOfBaggageScanned) {
        this.uuid = uuid;
        this.numberOfBaggageScanned = numberOfBaggageScanned;

        this.numberOfDangerousBaggage = numberOfDangerousBaggage;

        this.destinationBox = destinationBox;

        this.numberOfBaggageFirstClass = numberOfBaggageFirstClass;

        this.numberOfBaggageBusinessClass = numberOfBaggageBusinessClass;

        this.numberOfBaggageEconomyClass = numberOfBaggageEconomyClass;

        this.numberOfContainerNormalBaggage = numberOfContainerNormalBaggage;

        this.numberOfContainerBulkyBaggage = numberOfContainerBulkyBaggage;
    }
}
