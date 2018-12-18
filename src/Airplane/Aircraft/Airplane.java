package Airplane.Aircraft;


import Airplane.Aircraft.Body;
import Airplane.Aircraft.Wing;
import Airplane.FlightControls.FlightControlController;
import Airplane.FlightControls.IFlightControlController;
import Airplane.FlightControls.Implementations.Gear;
import Airplane.Lights.*;
import Airplane.Management.CostOptimizer;
import Airplane.Management.RouteManagement;
import Airplane.Management.SeatManagement;
import Airplane.cabin.*;
import Airplane.door.BulkCargoDoor;
import Airplane.door.CrewDoor;
import Airplane.door.EmergencyExitDoor;
import Airplane.door.GearDoor;
import Airplane.stowage_cargo.CargoSystem;

public class Airplane {
protected Configuration configuration;

    protected Body body;
    protected Wing leftWing;
    protected Wing rightWing;

    public Configuration getConfiguration() {
        return configuration;
    }

    public Airplane(Configuration configuration)
    {
        body = new Body(this);
        leftWing = new Wing(this);
        rightWing = new Wing(this);
    }

    public void startup()
    {
        new FlightControlController(this).startup();
        for(APU apu : body.getApuArrayList())
            apu.start()
        for(Engine engine : leftWing.getEngineArrayList())
            engine.start();
        for(Engine engine : rightWing.getEngineArrayList())
            engine.start();
        for(AirConditioning airConditioning : body.getAirConditioningArrayList())
            airConditioning.on();
        for(Kitchen kitchen : body.getKitchenArrayList())
            kitchen.lock();
        for(Lavatory lavatory : body.getLavatoryArrayList())
            lavatory.unlock();
        for(WasteSystem wasteSystem : body.getWasteSystemArrayList())
            wasteSystem.on();
        for(WaterSystem waterSystem : body.getWaterSystemArrayList())
            waterSystem.on();
        for(BulkCargoDoor bulkCargoDoor : body.getBulkCargoDoorArrayList())
            bulkCargoDoor.lock();
        for(CrewDoor crewDoor : body.getCrewDoorArrayList())
            crewDoor.lock();
        for(EmergencyExitDoor emergencyExitDoor : body.getEmergencyExitDoorArrayList())
            emergencyExitDoor.lock();
        for (GearDoor gearDoor : body.getGearDoorArrayList())
            gearDoor.lock();
        for(AntiCollisionLight antiCollisionLight : body.getAntiCollisionLightArrayList())
            antiCollisionLight.on();
        for(CargoCompartmentLight cargoCompartmentLight : body.getCargoCompartmentLightArrayList())
            cargoCompartmentLight.off();
        for(LogoLight logoLight : body.getLogoLightArrayList())
            logoLight.on();
        for (LeftNavigationLight leftNavigationLight : leftWing.getLeftNavigationLightArrayList())
            leftNavigationLight.on();
        for(RightNavigationLight rightNavigationLight : rightWing.getRightNavigationLightArrayList())
            rightNavigationLight.on();
        for(TailNavigationLight tailNavigationLight : body.getTailNavigationLightArrayList())
            tailNavigationLight.on();
        for(IceDetectorProbe iceDetectorProbe : body.getIceDetectorProbeArrayList())
            iceDetectorProbe.activate();
        for(IceDetectorProbe iceDetectorProbe : leftWing.getIceDetectorProbeArrayList())
            iceDetectorProbe.activate();
        for(IceDetectorProbe iceDetectorProbe : rightWing.getIceDetectorProbeArrayList())
            iceDetectorProbe.activate();
        for(RadarAltimeter radarAltimeter : body.getRadarAltimeterArrayList())
            radarAltimeter.on();
        for(TCAS tcas : body.getTcasArrayList())
            tcas.on();
        for(Camera camera : body.getCameraArrayList())
            camera.on("tail");
        for(Camera camera : rightWing.getCameraArrayList())
            camera.on("wing");
        for(Camera camera : leftWing.getCameraArrayList())
            camera.on("wing");
        for(GPS gps : body.getGpsArrayList())
            gps.on();
        for(Radar radar : body.getRadarArrayList())
            radar.on();
        for(SatCom satCom : body.getSatComArrayList())
            satCom.on();
        for(VHF vhf : body.getVhfArrayList())
            vhf.on();
        for(CargoSystem cargoSystem : body.getCargoSystemArrayList())
            cargoSystem.lock();
        for(CostOptimizer costOptimizer : body.getCostOptimizerArrayList())
            costOptimizer.on();
        for(RouteManagement routeManagement : body.getRouteManagementArrayList())
            routeManagement.on();


    }
    public void climbing(){
        new FlightControlController(this).climbing();
    }
    public void taxi()
    {
        new FlightControlController(this).taxi();

    }
    public void takeOff()
    {
        new FlightControlController(this).takeOff();
        for (Gear gear : body.getGearList())
            gear.up();
    }
    public void rightTurn()
    {
        new FlightControlController(this).rightTurn();
    }
    public void leftTurn()
    {
        new FlightControlController(this).leftTurn();
    }

    public Body getBody() {
        return body;
    }

    public Wing getLeftWing() {
        return leftWing;
    }

    public Wing getRightWing() {
        return rightWing;
    }


}
