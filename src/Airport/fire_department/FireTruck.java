package Airport.fire_department;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Configuration;
import Airport.Airport.Position;
import Airport.Airport.Runway;
import Airport.Airport.RunwayID;

import java.util.ArrayList;
import java.util.UUID;

public class FireTruck implements IFireTruck {
    private final FireTruckType fireTrucktype;
    private String uuid = UUID.randomUUID().toString();
    private String id;
    private ArrayList<FireFighter> fireFighterList;
    private boolean isFlashlightOn;
    private String currentLocation;
    private int numberOfSeat;
    private int numberOfWheel;
    private int numberOfExtinguisher;
    private boolean hasFireExtinguishingGun;
    private int maximumCapacityWater;
    private int numberOfHose;
    private int numberOfRespirationProtection;
    private int numberOfOxygenBottle;
    private boolean hasExtinguishingFoam;
    private boolean hasSpecialTool;
    private int speed;
    private Runway runway;
    private Airplane airplane;

    public FireTruckType getFireTrucktype() {
        return fireTrucktype;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    private void createFiretruck(
            String id,
            String currentLocation,
            int numberOfSeat,
            int numberOfWheel,
            int numberOfExtinguisher,
            boolean hasFireExtinguishingGun,
            int maximumCapacityWater,
            int numberOfHose,
            int numberOfRespirationProtection,
            int numberOfOxygenBottle,
            boolean hasExtinguishingFoam,
            boolean hasSpecialTool) {

        this.id = id;

        this.currentLocation = currentLocation;
        this.numberOfSeat = numberOfSeat;
        this.numberOfWheel = numberOfWheel;
        this.numberOfExtinguisher = numberOfExtinguisher;
        this.hasFireExtinguishingGun = hasFireExtinguishingGun;
        this.maximumCapacityWater = maximumCapacityWater;
        this.numberOfHose = numberOfHose;
        this.numberOfRespirationProtection = numberOfRespirationProtection;
        this.numberOfOxygenBottle = numberOfOxygenBottle;
        this.hasExtinguishingFoam = hasExtinguishingFoam;
        this.hasSpecialTool = hasSpecialTool;
    }

    public FireTruck(String id, FireTruckType fireTruckType) {
        this.fireTrucktype = fireTruckType;
        switch (fireTruckType) {
            case FT01:
                createFiretruck(id, "FireDepartment", 2, 4, 10, false, 10000, 8, 8, 8, false, true);
                break;
            case FT02:
                createFiretruck(id, "FireDepartment", 2, 8, 10, true, 25000, 4, 8, 4, true, true);
                break;
            case FT03:
                createFiretruck(id, "FireDepartment", 4, 4, 15, true, 5000, 6, 15, 8, true, true);
                break;
            case FT04:
                createFiretruck(id, "FireDepartment", 6, 4, 10, false, 500, 6, 15, 8, false, false);
                break;
        }
    }

    @Override
    public int move(final int speedInMPH) {
        speed = speedInMPH;

        return speed;
    }

    @Override
    public int stop() {
        speed = 0;
        return speed;
    }

    @Override
    public void executeRequest(final RunwayID runwayID) {

        setFlashingLightON();
        move(15);
        setRunway(runwayID);
        setAirplane();
        stop();
        currentLocation = runway.getRunwayID().name();
        airplane.getLeftWing().getEngineArrayList().forEach(engine -> {//
            //TODO Feuer Löschen, wenn Engine implementiert ist
            //Airplane hat es bis 22.12 8:22 nicht geschaft die Engine zu implementieren
        });
        airplane.getRightWing().getEngineArrayList().forEach(engine -> {
            //TODO same

        });
        move(15);
        returnToFireDepartment();
        stop();
        setFlashingLightOFF();

    }

    @Override
    public void setRunway(final RunwayID runwayid) {
        // Airport.getInstance.lookupRunway(runwayid);
        runway = new Runway(runwayid, Position.North, null, null, false, false, new Airplane(new Configuration(2)));

        //TODO: wenn @Aiport eine instanz bekommt obere Zeile auskommentieren, untere löschen
    }

    @Override
    public void setAirplane() {
        airplane = runway.getAirplane();

    }

    @Override
    public void returnToFireDepartment() {
        runway = null;
        airplane = null;
        fireFighterList.forEach(fireFighter -> fireFighter.setFireTruck(null));
        fireFighterList=new ArrayList<>();
    }

    @Override
    public boolean setFlashingLightON() {
        isFlashlightOn = true;
        return isFlashlightOn;
    }

    @Override
    public boolean setFlashingLightOFF() {
        isFlashlightOn = false;
        return isFlashlightOn;
    }

    @Override
    public boolean extinguish(final int amount,
                              final IEngine engine) {
        return false;
    }

    @Override
    public boolean extinguish(final boolean useFoam,
                              final IEngine engine) {
        return false;
    }

    public int assignFirefighter(FireFighter fireFighter) {
        fireFighter.setFireTruck(this);
        if (fireFighterList.size() < numberOfSeat) {
            fireFighterList.add(fireFighter);
        }
        return numberOfSeat - fireFighterList.size();
    }
}
