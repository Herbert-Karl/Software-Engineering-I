package Airport.Baggage_Sorting_Unit.Storage;

import Airport.Baggage_Sorting_Unit.BaggageSortingUnit;
import Airport.Base.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

public class BaggageSortingUnitRoboter implements IBaggageSortingUnitRoboter {

    private static int idCounter;
    private final String uuid;
    private final String id;
    private final String type;
    private final BaggageSortingUnit baggageSortingUnit;
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

    public ArrayList<Baggage> getSelectedBaggageList() {
        return selectedBaggageList;
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
        baggageSortingUnit.getDepot().storeAll(baggageList);
    }

    /**
     * Adds normal baggage from depot to container with normal type and then adds  bulky baggage to
     * container with bulky type
     */
    @Override
    public void selectBaggageFromDepot() {
        //getting depot

        //getting normal baggage
        storeBaggageForClass(TicketClass.First);
        storeBaggageForClass(TicketClass.Business);
        storeBaggageForClass(TicketClass.Economy);

        //getting bulky baggage
        selectedBaggageList = baggageSortingUnit.getDepot().selectBulkyBaggage();
        loadContainer();
    }

    /**
     * gets Set of containers from depot and calls fill routine
     *
     * @param ticketClass
     */
    private void storeBaggageForClass(TicketClass ticketClass) {
        final BaggageDepot depot = baggageSortingUnit.getDepot();
        selectedBaggageList = depot.selectNormalBaggage(ticketClass);
        loadContainer();
    }

    /**
     * Gets empty container, fills it and adds it to full containers
     */
    @Override
    public void loadContainer() {
        Container currentContainer;
        List<Baggage> reducedList;
        while (!selectedBaggageList.isEmpty()) {
            if (selectedBaggageList.get(0) instanceof NormalBaggage && selectedBaggageList.size() > 75) {
                reducedList = selectedBaggageList.subList(0, 74);
            } else if (selectedBaggageList.get(0) instanceof NormalBaggage && selectedBaggageList.size() > 50) {
                reducedList = selectedBaggageList.subList(0, 49);
            } else {
                reducedList = selectedBaggageList;
            }
            selectedBaggageList.removeAll(reducedList);

            if (!reducedList.isEmpty()) {
                if (reducedList.get(0) instanceof  NormalBaggage)
                    currentContainer = baggageSortingUnit.getEmptyContainer(ContainerCategory.Normal);
                else
                    currentContainer = baggageSortingUnit.getEmptyContainer(ContainerCategory.Normal);
            }
            else
                currentContainer = baggageSortingUnit.getEmptyContainer(ContainerCategory.Normal);

            currentContainer.setBaggageList(convertToStack(reducedList));
            baggageSortingUnit.addFullContainer(currentContainer);
        }
    }
    
    private Stack<Baggage> convertToStack(List<Baggage> list) {
        Stack<Baggage> stack = new Stack<>();
        while (list.size() > 0) {
            stack.push(list.remove(0));
        }
        return stack;
    }
}
