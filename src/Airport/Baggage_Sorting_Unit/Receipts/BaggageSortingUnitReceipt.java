package Airport.Baggage_Sorting_Unit.Receipts;

import Airport.Base.DestinationBox;

public class BaggageSortingUnitReceipt {

    private final String uuid;

    private final int numberOfBaggageScanned;

    private final int numberOfDangerousBaggage;

    private final DestinationBox destinationBox;

    private final int numberOfBaggageFirstClass;

    private final int numberOfBaggageBusinessClass;

    private final int numberOfBaggageEconomyClass;

    private final int numberOfContainerNormalBaggage;

    private final int numberOfContainerBulkyBaggage;

    public BaggageSortingUnitReceipt(final String uuid, final int numberOfContainerBulkyBaggage,
                                     final int numberOfContainerNormalBaggage, final int numberOfBaggageEconomyClass,
                                     final int numberOfBaggageBusinessClass, final int numberOfBaggageFirstClass,
                                     final DestinationBox destinationBox, final int numberOfDangerousBaggage, final int numberOfBaggageScanned) {
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
