package FlightControls;

import Airplane.Airplane;
import FlightControls.Interfaces.*;

import java.util.LinkedList;
import java.util.List;

public class FlightControlCollection {
    private List<IDroopNose> droopNoses;
    private List<IElevator> elevators;
    private List<IFlap> flaps;
    private List<ILeftAileron> leftAilerons;
    private List<IRightAileron> rightAilerons;
    private List<IRudder> rudders;
    private List<ISlat> slats;
    private List<ISpoiler> spoilers;


    public FlightControlCollection(Airplane airplane){
        droopNoses = new LinkedList<>();
        elevators = new LinkedList<>();
        flaps = new LinkedList<>();
        leftAilerons = new LinkedList<>();
        rightAilerons = new LinkedList<>();
        rudders = new LinkedList<>();
        slats = new LinkedList<>();
        spoilers = new LinkedList<>();
        //here extract all FlightControls
    }

    public List<IFlightControl> getAllFlightControls(){
        List<IFlightControl> fcs = new LinkedList<>();
        fcs.addAll(getFlaps());
        fcs.addAll(getSteplessRotables());
        return fcs;
    }

    public List<ISteplessRotable> getSteplessRotables(){
        List<ISteplessRotable> srs = new LinkedList<>();
        srs.addAll(getVerticalRotables());
        srs.addAll(getHorizontalRotables());
        return srs;
    }

    public List<IHorizontalRotable> getHorizontalRotables(){
        List<IHorizontalRotable> hrs = new LinkedList<>();
        hrs.addAll(getRudders());
        return hrs;
    }

    public List<IVerticalRotable> getVerticalRotables(){
        List<IVerticalRotable> vrs = new LinkedList<>();
        vrs.addAll(getDroopNoses());
        vrs.addAll(getElevators());
        vrs.addAll(getSlats());
        vrs.addAll(getSpoilers());
        vrs.addAll(getLeftAilerons());
        vrs.addAll(getRightAilerons());
        return vrs;
    }

    public List<IDroopNose> getDroopNoses() {
        return droopNoses;
    }

    public List<IElevator> getElevators() {
        return elevators;
    }

    public List<IFlap> getFlaps() {
        return flaps;
    }

    public List<ILeftAileron> getLeftAilerons() {
        return leftAilerons;
    }

    public List<IRightAileron> getRightAilerons() {
        return rightAilerons;
    }

    public List<IRudder> getRudders() {
        return rudders;
    }

    public List<ISlat> getSlats() {
        return slats;
    }

    public List<ISpoiler> getSpoilers() {
        return spoilers;
    }
}
