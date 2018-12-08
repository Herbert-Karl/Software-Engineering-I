package Airplane.Aircraft;

import Airplane.FlightControls.Implementations.Gear;
import Airplane.Tanks.Battery;
import Airplane.Tanks.IBattery;

import java.util.ArrayList;

public class Body {
    private ArrayList<IBattery> batteryList;
    private ArrayList<Gear> gearList;

    public Body() {
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
        for (int i = 0;i < 3;i++)
            gearList.add(new Gear());
    }
}
