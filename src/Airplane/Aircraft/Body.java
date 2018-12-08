package Airplane.Aircraft;

import Airplane.FlightControls.Implementations.Gear;
import Airplane.Tanks.Battery;
import Airplane.Tanks.IBattery;

import java.util.ArrayList;

public class Body {
    private Airplane airplane;
    private ArrayList<IBattery> batteryList;
    private ArrayList<Gear> gearList;
    private ArrayList<Engine> engineArrayList;
    private APU apu;

    public Body(Airplane airplane) {
        this.airplane = airplane;
        build();
    }

    public ArrayList<Gear> getGearList() {
        return gearList;
    }

    public void build() {
        // batteryList
        for (int i = 0;i < 24;i++)
            batteryList.add(new Battery("M","B01","BT" + i,100));

        // gear
        for (int i = 0;i < airplane.getConfiguration().getNumberOfGear().;i++)
            gearList.add(new Gear());
    }

    public ArrayList<IBattery> getBatteryList() {
        return batteryList;
    }

    public APU getApu() {
        return apu;
    }

    public ArrayList<Engine> getEngineArrayList() {
        return engineArrayList;
    }
}
