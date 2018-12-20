package Airplane.cabin;

import java.util.ArrayList;

public class Trolley {
    private int numberOfBeverages;
    private int numberOfMeals;
    private double totalWeightBeveragesMeals;
    private ArrayList<Beverage> beverageList;
    private ArrayList<Meal> mealList;

    // constructor for this class
    public Trolley() {
        beverageList = new ArrayList<>();
        mealList = new ArrayList<>();
    }

    // adds beverages to ArrayList
    public void fillBeverages(ArrayList<Beverage> beverages) {
        beverageList.addAll(beverages);
    }

    // adds meal to ArrayList
    public void fillMeals(ArrayList<Meal> meals) {
        mealList.addAll(meals);
    }

    // just getter and setter
    public int getNumberOfBeverages() {
        return numberOfBeverages;
    }

    public void setNumberOfBeverages(int numberOfBeverages) {
        this.numberOfBeverages = numberOfBeverages;
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

    // clear the ArrayLists
    public void removeContent() {
        mealList.clear();
        beverageList.clear();
    }
}
