package Airplane.Aircraft;

import Airplane.FlightControls.Implementations.Flap;
import Airplane.FlightControls.Interfaces.*;
import Airplane.Lights.LandingLight;
import Airplane.Lights.LeftNavigationLight;
import Airplane.Lights.RightNavigationLight;
import Airplane.Tanks.DeIcingSystem;
import Airplane.Tanks.EngineOilTank;
import Airplane.Tanks.FuelTank;

import java.util.ArrayList;

public class Wing {

    private ArrayList<Engine> engineArrayList;
    private ArrayList<HydraulicPump> hydraulicPumpArrayList;
    private ArrayList<LeftNavigationLight> leftNavigationLightArrayList;
    private ArrayList<RightNavigationLight> rightNavigationLightArrayList;
    private ArrayList<EngineOilTank> engineOilTankArrayList;
    private ArrayList<FuelTank> fuelTankArrayList;
    private ArrayList<DeIcingSystem> deIcingSystemArrayList;
    private ArrayList<LandingLight> landingLightArrayList;
    private ArrayList<IFlap> flapArrayList;
    private ArrayList<ISlat> slatArrayList;
    private ArrayList<ILeftAileron> leftAileronArrayList;
    private ArrayList<IRightAileron> rightAileronArrayList;
    private ArrayList<ISpoiler> spoilerArrayList;
    private ArrayList<ExhaustGasTemperatureSensor> exhaustGasTemperatureSensorArrayList;
    private ArrayList<FuelFlowSensor> fuelFlowSensorArrayList;
    private ArrayList<IceDetectorProbe> iceDetectorProbeArrayList;
    private ArrayList<ShockSensor> shockSensorArrayList;
    private ArrayList<StallingSensor> stallingSensorArrayList;
    private ArrayList<TemperatureSensor> temperatureSensorArrayList;
    private ArrayList<AirflowSensor> airflowSensorArrayList;
    private ArrayList<TurbulentAirFlowSensor> turbulentAirFlowSensorArrayList;
    private ArrayList<Camera> cameraArrayList;
    private ArrayList<IDroopNose> DroopNoseArrayList;

    public Wing(Airplane airplane) {
        this.airplane = airplane;
        build();
    }

    public void build() {

    }

    public ArrayList<Engine> getEngineArrayList() {
        return engineArrayList;
    }

    public ArrayList<HydraulicPump> getHydraulicPumpArrayList() {
        return hydraulicPumpArrayList;
    }

    public ArrayList<LeftNavigationLight> getLeftNavigationLightArrayList() {
        return leftNavigationLightArrayList;
    }

    public ArrayList<RightNavigationLight> getRightNavigationLightArrayList() {
        return rightNavigationLightArrayList;
    }

    public ArrayList<EngineOilTank> getEngineOilTankArrayList() {
        return engineOilTankArrayList;
    }

    public ArrayList<FuelTank> getFuelTankArrayList() {
        return fuelTankArrayList;
    }

    public ArrayList<DeIcingSystem> getDeIcingSystemArrayList() {
        return deIcingSystemArrayList;
    }

    public ArrayList<LandingLight> getLandingLightArrayList() {
        return landingLightArrayList;
    }

    public ArrayList<IFlap> getFlapArrayList() {
        return flapArrayList;
    }

    public ArrayList<ISlat> getSlatArrayList() {
        return slatArrayList;
    }

    public ArrayList<ILeftAileron> getLeftAileronArrayList() {
        return leftAileronArrayList;
    }

    public ArrayList<IRightAileron> getRightAileronArrayList() {
        return rightAileronArrayList;
    }
    
    public ArrayList<IDroopNose> getDroopNoseArrayList() {return DroopNoseArrayList;}

    public ArrayList<ISpoiler> getSpoilerArrayList() {return spoilerArrayList;}

    public ArrayList<ExhaustGasTemperatureSensor> getExhaustGasTemperatureSensorArrayList() {
        return exhaustGasTemperatureSensorArrayList;
    }

    public ArrayList<FuelFlowSensor> getFuelFlowSensorArrayList() {
        return fuelFlowSensorArrayList;
    }

    public ArrayList<IceDetectorProbe> getIceDetectorProbeArrayList() {
        return iceDetectorProbeArrayList;
    }

    public ArrayList<ShockSensor> getShockSensorArrayList() {
        return shockSensorArrayList;
    }

    public ArrayList<StallingSensor> getStallingSensorArrayList() {
        return stallingSensorArrayList;
    }

    public ArrayList<TemperatureSensor> getTemperatureSensorArrayList() {
        return temperatureSensorArrayList;
    }

    public ArrayList<AirflowSensor> getAirflowSensorArrayList() {
        return airflowSensorArrayList;
    }

    public ArrayList<TurbulentAirFlowSensor> getTurbulentAirFlowSensorArrayList() {
        return turbulentAirFlowSensorArrayList;
    }

    public ArrayList<Camera> getCameraArrayList() {
        return cameraArrayList;
    }
}
