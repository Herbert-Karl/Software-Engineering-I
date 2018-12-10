package Airport.Baggage_Sorting_Unit.Receipts;

import Airport.Baggage_Sorting_Unit.IBaggageSortingUnit;
import Airport.Base.Baggage;

import java.util.ArrayList;

public class ContainerLifterReceipt {

    private String uuid;

    private String id;

    private String type;

    private IBaggageSortingUnit baggageSortingUnit;

    private ArrayList<Baggage> selectedBaggageList;

    public ContainerLifterReceipt(String uuid, String id, String type,
                                  IBaggageSortingUnit baggageSortingUnit, ArrayList<Baggage> selectedBaggageList) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.baggageSortingUnit = baggageSortingUnit;
        this.selectedBaggageList = selectedBaggageList;
    }
}
