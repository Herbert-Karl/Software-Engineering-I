package Airport.Baggage_Sorting_Unit.Loading;

import Airplane.stowage_cargo.Stowage;

import java.util.ArrayList;

public class LoadingStrategy {

    private Stowage stowage;
    private ArrayList<String> containerIDList;

    public ArrayList<String> getContainerIDList() {
        return containerIDList;
    }

    public void setContainerIDList(final ArrayList<String> containerIDList) {
        this.containerIDList = containerIDList;
    }

    public Stowage getStowage() {
        return stowage;
    }

    public void setStowage(final Stowage stowage) {
        this.stowage = stowage;
    }
}
