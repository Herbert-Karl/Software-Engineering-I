package Airplane.cabin;

import java.util.ArrayList;

public class Kitchen extends KitchenLavatory {
    private ArrayList<Trolley> trolleyList;
    private boolean isFilled;

    // constructor for this class
    public Kitchen(KitchenType kitchenType) {
        super(kitchenType.toString());
        trolleyList = new ArrayList<>();
    }

    // returns size of the ArrayList
    public double getTotalWeightTrolleys() {
        return trolleyList.size();
    }

    // add a new trolley to the ArrayList
    public void addTrolley(Trolley trolley) {
        trolleyList.add(trolley);
    }

    // remove food and baverage from trolley
    public void emptyTrolley(Trolley trolley) { // trolley wird rausgezogen food und baverage entfernt
       if (trolleyList.contains(trolley)) {
           int index = trolleyList.indexOf(trolley);
           trolleyList.get(index).removeContent();
       }
    }
}
