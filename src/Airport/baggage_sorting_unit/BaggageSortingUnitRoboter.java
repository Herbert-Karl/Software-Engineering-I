package Airport.baggage_sorting_unit;

import Airport.base.Baggage;

import java.util.ArrayList;

public class BaggageSortingUnitRoboter implements IBaggageSortingUnitRoboter {
    private String uuid;
    private String id;
    private String type;
    private IBaggageSortingUnit baggageSortingUnit;
    private ArrayList<Baggage> selectedBaggageList;

    public BaggageSortingUnitRoboter(String uuid, String id, String type, IBaggageSortingUnit baggageSortingUnit, ArrayList<Baggage> selectedBaggageList) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.baggageSortingUnit = baggageSortingUnit;
        this.selectedBaggageList = selectedBaggageList;
    }

    @Override
    public void moveBaggageToDepot(ArrayList<Baggage> baggageArrayList) {

    }

    @Override
    public void selectBaggageFromDepot() {

    }

    @Override
    public void loadContainer() {

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public IBaggageSortingUnit getBaggageSortingUnit() {
        return baggageSortingUnit;
    }

    public void setBaggageSortingUnit(IBaggageSortingUnit baggageSortingUnit) {
        this.baggageSortingUnit = baggageSortingUnit;
    }

    public ArrayList<Baggage> getSelectedBaggageList() {
        return selectedBaggageList;
    }

    public void setSelectedBaggageList(ArrayList<Baggage> selectedBaggageList) {
        this.selectedBaggageList = selectedBaggageList;
    }
}
