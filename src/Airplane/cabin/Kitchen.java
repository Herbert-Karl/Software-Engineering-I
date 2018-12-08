package Airplane.cabin;

import java.util.ArrayList;

public class Kitchen extends KitchenLavatory implements IKitchen {
    private ArrayList<Trolley> trolleyList;
    private KitchenType kitchenType;
    private boolean isFilled;

    public Kitchen(String id, KitchenType kitchenType) {
        setKitchen(id, "Kitchen");
        this.kitchenType = kitchenType;
    }

    @Override
    public double getTotalWeightTrolleys() {
        return trolleyList.size();
    }

    @Override
    public void addTrolley(Trolley trolley) {
        trolleyList.add(trolley);
    }

    @Override
    public void emptyTrolley(Trolley trolley) { // trolley wird rausgezogen food und baverage entfernt
       if (trolleyList.contains(trolley)) {
           int index = trolleyList.indexOf(trolley);
           trolleyList.get(index).removeContent();
       }
    }
}
