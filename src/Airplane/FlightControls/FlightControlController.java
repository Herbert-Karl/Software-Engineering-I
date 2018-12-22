package Airplane.FlightControls;

import Airplane.Aircraft.Airplane;
import Airplane.FlightControls.Interfaces.IFlap;
import Airplane.FlightControls.Interfaces.IFlightControl;

public class FlightControlController implements IFlightControlController {

    private final Airplane airplane;

    public FlightControlController(Airplane airplane) {
        this.airplane = airplane;
    }

    private FlightControlCollection getFCC() {
        return new FlightControlCollection(airplane);
    }

    public void neutral() {
        getFCC().getAllFlightControls().forEach(IFlightControl::neutral);
    }

    /*
     * Sources:
     * DND:      https://www.quora.com/Why-is-the-A350-wing-leading-edge-profile-near-the-fuselage-wedge-like-with-a-kink
     *           https://en.wikipedia.org/wiki/Droop_(aeronautics)
     * Elevator: https://www.quora.com/How-do-aircraft-elevators-work
     * Flap:     https://www.quora.com/Do-pilots-use-flaps-during-take-off
     *           https://www.flyingmag.com/can-flap-deflection-help-you-climb
     * Aileron:  https://aviation.stackexchange.com/questions/29454/what-is-a-skidding-turn-vs-slipping-turn
     *           https://www.boldmethod.com/learn-to-fly/aerodynamics/how-adverse-yaw-affects-your-plane-in-a-turn/
     *           https://www.grc.nasa.gov/www/k-12/airplane/turns.html
     * Rudder:   See ailerons
     * Slat:     https://en.wikipedia.org/wiki/Leading%E2%80%93edge_slat
     * Spoiler:  https://aviation.stackexchange.com/questions/1955/when-can-spoilers-be-used-on-airliners
     *           https://de.wikipedia.org/wiki/St%C3%B6rklappe
     * */
    public void startup() {
        neutral();
    }

    public void taxi() {
        neutral();
    }

    public void takeOff() {
        FlightControlCollection fcc = getFCC();
        fcc.getDroopNoses().forEach(dn -> dn.down(25));
        fcc.getElevators().forEach(e -> e.up(10));
        fcc.getFlaps().forEach(IFlap::levelOne);
        fcc.getRightAilerons().forEach(IFlightControl::neutral);
        fcc.getLeftAilerons().forEach(IFlightControl::neutral);
        fcc.getRudders().forEach(IFlightControl::neutral);
        fcc.getSlats().forEach(s -> s.down(5));
        fcc.getSpoilers().forEach(IFlightControl::neutral);
    }

    public void climbing() {
        FlightControlCollection fcc = getFCC();
        fcc.getDroopNoses().forEach(dn -> dn.down(22));
        fcc.getElevators().forEach(e -> e.up(10));
        fcc.getFlaps().forEach(IFlightControl::neutral);
        fcc.getRightAilerons().forEach(IFlightControl::neutral);
        fcc.getLeftAilerons().forEach(IFlightControl::neutral);
        fcc.getRudders().forEach(IFlightControl::neutral);
        fcc.getSlats().forEach(IFlightControl::neutral);
        fcc.getSpoilers().forEach(IFlightControl::neutral);
    }

    public void rightTurn() {
        FlightControlCollection fcc = getFCC();
        fcc.getDroopNoses().forEach(IFlightControl::neutral);
        fcc.getElevators().forEach(IFlightControl::neutral);
        fcc.getFlaps().forEach(IFlightControl::neutral);
        fcc.getLeftAilerons().forEach(la -> la.down(10));
        fcc.getRightAilerons().forEach(ra -> ra.up(10));
        fcc.getRudders().forEach(r -> r.left(15));
        fcc.getSlats().forEach(IFlightControl::neutral);
        fcc.getSpoilers().forEach(IFlightControl::neutral);
    }

    public void leftTurn() {
        FlightControlCollection fcc = getFCC();
        fcc.getDroopNoses().forEach(IFlightControl::neutral);
        fcc.getElevators().forEach(IFlightControl::neutral);
        fcc.getFlaps().forEach(IFlightControl::neutral);
        fcc.getLeftAilerons().forEach(la -> la.up(10));
        fcc.getRightAilerons().forEach(ra -> ra.down(10));
        fcc.getRudders().forEach(r -> r.right(15));
        fcc.getSlats().forEach(IFlightControl::neutral);
        fcc.getSpoilers().forEach(IFlightControl::neutral);
    }

    public void landing() {
        FlightControlCollection fcc = getFCC();
        fcc.getDroopNoses().forEach(dn -> dn.down(25));
        fcc.getElevators().forEach(e -> e.down(10));
        fcc.getFlaps().forEach(IFlap::levelThree);
        fcc.getLeftAilerons().forEach(IFlightControl::neutral);
        fcc.getRightAilerons().forEach(IFlightControl::neutral);
        fcc.getRudders().forEach(IFlightControl::neutral);
        fcc.getSlats().forEach(s -> s.down(45));
        fcc.getSpoilers().forEach(s -> s.up(10));
    }
}
