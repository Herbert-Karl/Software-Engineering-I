package Airplane.cabin;

import java.util.ArrayList;

public class Kitchen extends KitchenLavatory implements IKitchen {
    private ArrayList<Trolley> trolleyList;
    private KitchenType kitchenType;
    private boolean isFilled;

    // constructor for this class
    public Kitchen(String id, KitchenType kitchenType) {
        setKitchen(id, "Kitchen");
        this.kitchenType = kitchenType;
    }

    @Override
    // returns size of the ArrayList
    public double getTotalWeightTrolleys() {
        return trolleyList.size();
    }

    @Override
    // add a new trolley to the ArrayList
    public void addTrolley(Trolley trolley) {
        trolleyList.add(trolley);
    }

    @Override
    // remove food and baverage from trolley
    public void emptyTrolley(Trolley trolley) { // trolley wird rausgezogen food und baverage entfernt
       if (trolleyList.contains(trolley)) {
           int index = trolleyList.indexOf(trolley);
           trolleyList.get(index).removeContent();
       }
    }
}
