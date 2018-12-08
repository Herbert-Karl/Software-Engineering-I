package src.Airport.Baggage_Sorting_Unit.Vehicles;

import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Base.Baggage;
import Airport.Base.Container;
import Airport.Airport.*;

import java.util.Collection;

public class BaggageVehicle implements IBaggageVehicle {

    private String uuid;

    private String id;

    private String type;

    private int speedInMPH = 0;

    private boolean isFlashingLightOn;

    private Container container;
    private IContainerLifter containerLifter;
    private Gate gate;

    public IContainerLifter getContainerLifter() {
        return containerLifter;
    }

    /**
     * adding baggages to internal container
     */
    @Override
    public void store(Collection<Baggage> b) {
        container.addAll(b);
    }

    /**
     * setting internal container
     */
    @Override
    public void store(Container container) {
        this.container = container;
    }

    @Override
    public void connect(IContainerLifter containerLifter) {
        this.containerLifter = containerLifter;
    }

    @Override
    public void transferContainerToLifter() {
        containerLifter.setContainer(container);
    }

    /**
     *
     */
    @Override
    public void disconnect() {
        this.containerLifter = null;
    }

    /**
     *
     */
    @Override
    public void returnToBaggageSortingUnit() {
        setFlashingLightOn();
        move(20);
        stop();
        containerLifter.getBaggageSortingUnit().setBaggageVehicle(this);
        setFlashingLightOff();
    }

    /**
     * TODO: Routine implementieren
     */
    @Override
    public void executeRequest(GateID gateID) {

    }

    @Override
    public void setFlashingLightOn() {
        isFlashingLightOn = true;
    }

    @Override
    public void move(int speedInMPH) {
        this.speedInMPH = speedInMPH;
    }

    @Override
    public void stop() {
        speedInMPH = 0;
    }

    /**
     * TODO: get gate from gatelist in Airport
     * @param gate
     */
    @Override
    public void setGate(GateID gate) {
        this.gate = Airport.getGate(gate);
    }

    @Override
    public void setFlashingLightOff() {
        isFlashingLightOn = false;
    }
}