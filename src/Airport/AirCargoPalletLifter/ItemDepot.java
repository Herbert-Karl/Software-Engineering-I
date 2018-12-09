package Airport.AirCargoPalletLifter;

import Airport.Airport.GateID;
import Airport.Base.Item;

import java.util.ArrayList;

public class ItemDepot {
    private GateID gateID;
    private ArrayList<Item> itemList;
    private IAirCargoPalletPackingUnit airCargoPalletPackingUnit;

    public ItemDepot(GateID gateID, ArrayList<Item> itemList, IAirCargoPalletPackingUnit airCargoPalletPackingUnit) {
        this.gateID = gateID;
        this.itemList = itemList;
        this.airCargoPalletPackingUnit = airCargoPalletPackingUnit;
    }

}
