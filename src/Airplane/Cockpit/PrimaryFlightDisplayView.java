package Airplane.Cockpit;

import java.util.ArrayList;

public class PrimaryFlightDisplayView{
    private PrimaryFlightDisplayViewID id;
    private ArrayList<PrimaryFlightDisplayViewEntry> entryList;

    public PrimaryFlightDisplayView(PrimaryFlightDisplayViewID id, ArrayList<PrimaryFlightDisplayViewEntry> entryList) {
        this.id = id;
        this.entryList = entryList;
    }

    public void register(PrimaryFlightDisplayViewEntry primaryFlightDisplayViewEntry){
        // TODO
    }

    public void update(String primaryFlightDisplayViewEntryName, String value) {
        // TODO
    }

    public PrimaryFlightDisplayViewID getId() {
        return id;
    }

    public void setId(PrimaryFlightDisplayViewID id) {
        this.id = id;
    }

    public ArrayList<PrimaryFlightDisplayViewEntry> getEntryList() {
        return entryList;
    }

    public void setEntryList(ArrayList<PrimaryFlightDisplayViewEntry> entryList) {
        this.entryList = entryList;
    }
}