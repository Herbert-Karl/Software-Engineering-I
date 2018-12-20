package Airport.Baggage_Sorting_Unit.Storage;

import Airport.Baggage_Sorting_Unit.BaggageSortingUnit;
import Airport.Base.Baggage;
import Airport.Base.TicketClass;

import java.util.ArrayList;
import java.util.UUID;

public class BaggageSortingUnitRoboter implements IBaggageSortingUnitRoboter {

    private final String uuid;

    private final String id;

    private final String type;

    private final BaggageSortingUnit baggageSortingUnit;
    private static int idCounter;

    public ArrayList<Baggage> getSelectedBaggageList() {
        return selectedBaggageList;
    }

    private ArrayList<Baggage> selectedBaggageList;

    public BaggageSortingUnitRoboter(final BaggageSortingUnit baggageSortingUnit,
                                     final String type) {
        this.uuid = UUID.randomUUID().toString();
        this.id = "" + idCounter++;
        this.type = type;
        this.baggageSortingUnit = baggageSortingUnit;
        selectedBaggageList = new ArrayList<>();
    }

    public String toString() {
        String message = "UUID: " + uuid + "\nID: " + id + "\nType: " + type
                + "\nAssigned Baggage Sorting Unit: " + baggageSortingUnit
                + "\nCurrently selected baggage: ";

        for (final Baggage b : selectedBaggageList) {
            message += "\n    " + b;
        }
        return message;
    }

    public String getUuid() {
        return uuid;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    public void addBaggage(final Baggage b) {
        selectedBaggageList.add(b);
    }

    /**
     * Adds parameter to internal list. Then stores it to the Depot and clears list.
     */
    @Override
    public void moveBaggageToDepot(final ArrayList<Baggage> baggageList) {
        selectedBaggageList.addAll(baggageList);
        baggageSortingUnit.getDepot().storeAll(moveBaggage());
    }

    /**
     * Adds normal baggage from depot to container with normal type and then adds  bulky baggage to
     * container with bulky type
     */
    @Override
    public void selectBaggageFromDepot() { //TODO hier schon in einen leeren container laden? Vielleciht eher loadContainer
        //getting depot
        final BaggageDepot depot = baggageSortingUnit.getDepot();

        //getting normal baggages
        selectedBaggageList = depot.selectNormalBaggage(
                TicketClass.First.toString());//Sinnlos... Enum direkt verwenden macht mehr sinn
        //baggageSortingUnit.selectEmptyContainer(ContainerCategory.Normal).setBaggageList(selectedBaggageList);//TODO setBaggageList
        selectedBaggageList = depot.selectNormalBaggage(TicketClass.Business.toString());
        //baggageSortingUnit.selectEmptyContainer(ContainerCategory.Normal).setBaggageList(selectedBaggageList);TODO setBaggageList
        selectedBaggageList = depot.selectNormalBaggage(TicketClass.Economy.toString());
        //baggageSortingUnit.selectEmptyContainer(ContainerCategory.Normal).setBaggageList(selectedBaggageList);TODO setBaggageList

        //getting bulky baggage
        selectedBaggageList = depot.selectBulkyBaggage();
        //baggageSortingUnit.selectEmptyContainer(ContainerCategory.Bulky).setBaggageList(selectedBaggageList);TODO setBaggageList
    }

    /**
     * moves baggage to the container on the baggageVehicle
     * TODO: vielleicht eher container beladen aus selectBaggageFromDepot here, und dann auf Vehicle in loadBaggageVehicle
     */
    @Override
    public void loadContainer() {
        baggageSortingUnit.getVehicle().store(moveBaggage());
    }

    /**
     * clears selected baggage list
     *
     * @return content of selected baggage list
     */
    private ArrayList<Baggage> moveBaggage() {
        final ArrayList<Baggage> temp = selectedBaggageList;
        selectedBaggageList.clear();
        return temp;
    }
}
