package Airport.Baggage_Sorting_Unit.Storage;

import Airport.Baggage_Sorting_Unit.IBaggageSortingUnit;
import Airport.Base.Baggage;

import java.util.ArrayList;

public class BaggageSortingUnitRoboter implements IBaggageSortingUnitRoboter {

    private String uuid;

    private String id;

    private String type;

    private final IBaggageSortingUnit baggageSortingUnit;

    private ArrayList<Baggage> selectedBaggageList;

    public BaggageSortingUnitRoboter(final IBaggageSortingUnit baggageSortingUnit) {
        this.baggageSortingUnit = baggageSortingUnit;
        selectedBaggageList = new ArrayList<>();
    }

    @Override
    public void addBaggage(final Baggage b) {
        selectedBaggageList.add(b);
    }

    /**
     * Adds parameter to internal list. Then stores it to the Depot and clears list.
     */
    @Override
    public void moveBaggageToDepot(
            final ArrayList<Baggage> baggageList) {
        selectedBaggageList.addAll(baggageList);
        baggageSortingUnit.getDepot().storeAll(moveBaggage());
    }

    /**
     *
     */
    @Override
    public void selectBaggageFromDepot() {
        final BaggageDepot depot=baggageSortingUnit.getDepot();
        selectedBaggageList = depot.selectNormalBaggage();
        //TODO Add to container with containerCategory normal
        selectedBaggageList = depot.selectBulkyBaggage();
        //TODO Add to container with containerCategory bulky
    }

    /**
     * TODO: check
     */
    @Override
    public void loadContainer() {
        baggageSortingUnit.getVehicle().store(moveBaggage());
    }

    private ArrayList<Baggage> moveBaggage() {
        final ArrayList<Baggage> temp = selectedBaggageList;
        selectedBaggageList.clear();
        return temp;
    }
}
