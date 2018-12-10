package Airplane.cabin;

import java.util.ArrayList;

public class Trolley {
    int numberOfBeverage;
    int numberOfMeals;
    double totalWeightBeveragesMeals;

    public Trolley() {
    }

    public int getNumberOfBeverage() {
        return numberOfBeverage;
    }

    public void setNumberOfBeverage(int numberOfBeverage) {
        this.numberOfBeverage = numberOfBeverage;
    }

    public int getNumberOfMeals() {
        return numberOfMeals;
    }

    public void setNumberOfMeals(int numberOfMeals) {
        this.numberOfMeals = numberOfMeals;
    }

    public double getTotalWeightBeveragesMeals() {
        return totalWeightBeveragesMeals;
    }

    public void setTotalWeightBeveragesMeals(double totalWeightBeveragesMeals) {
        this.totalWeightBeveragesMeals = totalWeightBeveragesMeals;
    }

    public void fillBeverages(ArrayList<Beverage> beverages) {

    }

    public void fillMeals(ArrayList<Meal> meals) {

    }
}
