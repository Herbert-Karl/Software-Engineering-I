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
        entryList.add(primaryFlightDisplayViewEntry);
    }

    public void update(String primaryFlightDisplayViewEntryName, String value) {
        for(int i = 0; i<entryList.size(); i++){
            if(entryList.get(i).getName().contentEquals(primaryFlightDisplayViewEntryName)){
                String name = entryList.get(i).getName();
                entryList.set(i, new PrimaryFlightDisplayViewEntry(name, value));
                break;
            }
        }
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