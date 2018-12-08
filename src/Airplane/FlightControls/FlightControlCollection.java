package Airplane.FlightControls;

import Airplane.FlightControls.Interfaces.*;
import Airplane.IAirplane;

import java.util.LinkedList;
import java.util.List;

class FlightControlCollection {
    private final List<IDroopNose> droopNoses;
    private final List<IElevator> elevators;
    private final List<IFlap> flaps;
    private final List<ILeftAileron> leftAilerons;
    private final List<IRightAileron> rightAilerons;
    private final List<IRudder> rudders;
    private final List<ISlat> slats;
    private final List<ISpoiler> spoilers;


    FlightControlCollection(IAirplane airplane) {
        droopNoses = new LinkedList<>();
        elevators = new LinkedList<>();
        flaps = new LinkedList<>();
        leftAilerons = new LinkedList<>();
        rightAilerons = new LinkedList<>();
        rudders = new LinkedList<>();
        slats = new LinkedList<>();
        spoilers = new LinkedList<>();
        //here extract all Airplane.FlightControls
    }

    List<IFlightControl> getAllFlightControls() {
        List<IFlightControl> fcs = new LinkedList<>();
        fcs.addAll(getFlaps());
        fcs.addAll(getSteplessRotables());
        return fcs;
    }

    private List<ISteplessRotable> getSteplessRotables() {
        List<ISteplessRotable> srs = new LinkedList<>();
        srs.addAll(getVerticalRotables());
        srs.addAll(getHorizontalRotables());
        return srs;
    }

    private List<IHorizontalRotable> getHorizontalRotables() {
        return new LinkedList<>(getRudders());
    }

    private List<IVerticalRotable> getVerticalRotables() {
        List<IVerticalRotable> vrs = new LinkedList<>();
        vrs.addAll(getDroopNoses());
        vrs.addAll(getElevators());
        vrs.addAll(getSlats());
        vrs.addAll(getSpoilers());
        vrs.addAll(getLeftAilerons());
        vrs.addAll(getRightAilerons());
        return vrs;
    }

    List<IDroopNose> getDroopNoses() {
        return droopNoses;
    }

    List<IElevator> getElevators() {
        return elevators;
    }

    List<IFlap> getFlaps() {
        return flaps;
    }

    List<ILeftAileron> getLeftAilerons() {
        return leftAilerons;
    }

    List<IRightAileron> getRightAilerons() {
        return rightAilerons;
    }

    List<IRudder> getRudders() {
        return rudders;
    }

    List<ISlat> getSlats() {
        return slats;
    }

    List<ISpoiler> getSpoilers() {
        return spoilers;
    }
}
