package Airplane.Aircraft;

public class Configuration {
    protected int numberOfGear;

    public Configuration(int numberOfGear) {
        this.numberOfGear = numberOfGear;
    }

    public int getNumberOfGear() {
     return numberOfGear;
    }
}