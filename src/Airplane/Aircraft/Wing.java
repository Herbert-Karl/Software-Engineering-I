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

    private Airplane airplane;
    private ArrayList<Engine> engineArrayList;
    private ArrayList<HydraulicPump> hydraulicPumpArrayList;
    private ArrayList<LeftNavigationLight> leftNavigationLightArrayList;
    private ArrayList<RightNavigationLight> rightNavigationLightArrayList;
    private ArrayList<EngineOilTank> engineOilTankArrayList;
    private ArrayList<FuelTank> fuelTankArrayList;
    private ArrayList<DeIcingSystem> deIcingSystemArrayList;
    private ArrayList<LandingLight> landingLightArrayList;
    private ArrayList<Flap> flapArrayList;
    private ArrayList<Slat> slatArrayList;
    private ArrayList<LeftAileron> leftAileronArrayList;
    private ArrayList<RightAileron> rightAileronArrayList;
    private ArrayList<Spoiler> spoilerArrayList;
    private ArrayList<ExhaustGasTemperatureSensor> exhaustGasTemperatureSensorArrayList;
    private ArrayList<FuelFlowSensor> fuelFlowSensorArrayList;
    private ArrayList<IceDetectorProbe> iceDetectorProbeArrayList;
    private ArrayList<ShockSensor> shockSensorArrayList;
    private ArrayList<StallingSensor> stallingSensorArrayList;
    private ArrayList<TemperatureSensor> temperatureSensorArrayList;
    private ArrayList<AirflowSensor> airflowSensorArrayList;
    private ArrayList<TurbulentAirFlowSensor> turbulentAirFlowSensorArrayList;
    private ArrayList<Camera> cameraArrayList;
    private ArrayList<DroopNose> droopNoseArrayList;
    private ArrayList<FireDetector> fireDetectorArrayList;

    public Wing(Airplane airplane) {
        this.airplane = airplane;
        build();
    }

    public void build() {


        //Schreibt die Daten für die Übergabe Parameter bitte selbst in die Klammern!!!


        //Engine
        for(int i=0; i<2;i++)
            engineArrayList.add(new Engine(""));
        //HydraulicPump
        for(int i=0; i<4;i++)
            hydraulicPumpArrayList.add(new HydraulicPump(""));
        //LeftNavigationLight
        for(int i=0; i<1;i++)
            leftNavigationLightArrayList.add(new LeftNavigationLight(""));
        //RightNavigationLight
        for(int i=0; i<1;i++)
            rightNavigationLightArrayList.add(new RightNavigationLight(""));
        //EngineOilTank
        for(int i=0; i<4;i++)
            engineOilTankArrayList.add(new EngineOilTank(""));
        //FuelTank
        for(int i=0; i<3;i++)
            fuelTankArrayList.add(new FuelTank(""));
        //DeIcingSystem
        for(int i=0; i<2;i++)
            deIcingSystemArrayList.add(new DelcingSystem(""));
        //LandingLight
        for(int i=0; i<2;i++)
            landingLightArrayList.add(new LandingLight(""));
        //Flap
        for(int i=0; i<2;i++)
            flapArrayList.add(new Flap(""));
        //Slat
        for(int i=0; i<6;i++)
            slatArrayList.add(new Slat(""));
        //LeftAileron
        for(int i=0; i<3;i++)
            leftAileronArrayList.add(new LeftAileron(""));
        //RightAileron
        for(int i=0; i<3;i++)
            rightAileronArrayList.add(new RightAileron(""));
        //Spoiler
        for(int i=0; i<8;i++)
            spoilerArrayList.add(new Spoiler(""));
        //ExhaustGasTemperatureSensor
        for(int i=0; i<4;i++)
            exhaustGasTemperatureSensorArrayList.add(new ExhaustGasTemperatureSensor(""));
        //FuelFlowSensor
        for(int i=0; i<6;i++)
            fuelFlowSensorArrayList.add(new FuelFlowSensor(""));
        //IceDetectorProbe
        for(int i=0; i<2;i++)
            iceDetectorProbeArrayList.add(new IceDetectorProbe(""));
        //ShockSensor
        for(int i=0; i<2;i++)
            shockSensorArrayList.add(new ShockSensor(""));
        //StallingSensor
        for(int i=0; i<4;i++)
            stallingSensorArrayList.add(new StallingSensor(""));
        //TemperatureSensor
        for(int i=0; i<4;i++)
            temperatureSensorArrayList.add(new TemperatureSensor(""));
        //AirflowSensor
        for(int i=0; i<2;i++)
            airflowSensorArrayList.add(new AirflowSensor(""));
        //TurbulentAirFlowSensor
        for(int i=0; i<4;i++)
            turbulentAirFlowSensorArrayList.add(new TurbulentAirFlowSensor(""));
        //Camera
        for(int i=0; i<1;i++)
            cameraArrayList.add(new Camera(""));
        //DroopNose
        for(int i=0; i<2;i++)
            droopNoseArrayList.add(new DroopNose(""));
        //FireDetector
        for(int i=0; i<4;i++)
            fireDetectorArrayList.add(new FireDetector(""));



    }

    public ArrayList<Engine> getEngineArrayList() {
        return engineArrayList;
    }

    public ArrayList<FireDetector> getFireDetectorArrayList() {
        return fireDetectorArrayList;
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
