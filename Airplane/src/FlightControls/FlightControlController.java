package FlightControls;

import Airplane.Airplane;
import FlightControls.Interfaces.IFlightControl;

import javax.swing.*;
import java.util.List;
import java.util.function.Function;

public class FlightControlController implements IFlightControlController{

    private Airplane airplane;

    public FlightControlController (Airplane airplane){
        this.airplane = airplane;
    }

    private FlightControlCollection getFCC(){
        return new FlightControlCollection(airplane);
    }

    public void neutral(){
        getFCC().getAllFlightControls().forEach(fc->fc.neutral());
    }

    public void startup(){
        neutral();
    }

    public void taxi(){
        neutral();
    }

    public void takeOff(){

    }

    public void climbing(){

    }

    public void rightTurn(){

    }

    public void leftTurn(){

    }
}
