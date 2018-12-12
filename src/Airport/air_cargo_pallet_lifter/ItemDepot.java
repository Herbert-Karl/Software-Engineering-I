package Airport.air_cargo_pallet_lifter;

import Airport.airport.GateID;
import Airport.base.Item;

import java.util.ArrayList;

public class ItemDepot {
    private GateID gateID;
    private ArrayList<Item> itemArrayList;
    private IAirCargoPalletPackingUnit airCargoPalletPackingUnit;

    public ItemDepot(GateID gateID, ArrayList<Item> itemArrayList, IAirCargoPalletPackingUnit airCargoPalletPackingUnit) {
        this.gateID = gateID;
        this.itemArrayList = itemArrayList;
        this.airCargoPalletPackingUnit = airCargoPalletPackingUnit;
    }

    public void executeRequest(GateID gateID) {

    }

    public void loadItemData(String dataFilePath) {

    }

    public GateID getGateID() {
        return gateID;
    }

    public void setGateID(GateID gateID) {
        this.gateID = gateID;
    }

    public ArrayList<Item> getItemArrayList() {
        return itemArrayList;
    }

    public void setItemArrayList(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    public IAirCargoPalletPackingUnit getAirCargoPalletPackingUnit() {
        return airCargoPalletPackingUnit;
    }

    public void setAirCargoPalletPackingUnit(IAirCargoPalletPackingUnit airCargoPalletPackingUnit) {
        this.airCargoPalletPackingUnit = airCargoPalletPackingUnit;
    }
}
