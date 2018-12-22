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
import Airplane.Tanks.EngineOilTank;
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
            apu.start();
        for(Engine engine : leftWing.getEngineArrayList())
            engine.start();
        for(Engine engine : rightWing.getEngineArrayList())
            engine.start();
        for(AirConditioning airConditioning : body.getAirConditioningArrayList())
            airConditioning.on();
        for(Kitchen kitchen : body.getKitchenArrayList())
            kitchen.lock();
        for(Lavatory lavatory : body.getLavatoryArrayList())
            lavatory.lock();
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
            camera.on();
        for(Camera camera : rightWing.getCameraArrayList())
            camera.on();
        for(Camera camera : leftWing.getCameraArrayList())
            camera.on();
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
        for(DroopNose droopNose : leftWing.getDroopNoseArrayList())
            droopNose.fullDown();
        for(DroopNose droopNose : rightWing.getDroopNoseArrayList())
            droopNose.fullDown();
        for(Elevator elevator : body.getElevatorArrayList())
            elevator.fullDown();
        for(Slat slat : leftWing.getSlatArrayList())
            slat.fullDown();
        for(Slat slat : rightWing.getSlatArrayList())
            slat.fullDown();
        for(Flat flat : leftWing.getFlapArrayList())
            flat.levelOne();
        for(Flat flat : rightWing.getFlapArrayList())
            flat.levelOne();
        try {
            for (int i=0; i<10 ; i++) {
                for(Engine engine : body.getEngineArrayList())
                    engine.increase(310);
                if(i==2)
                {
                    for(Gear gear :body.getGearList())
                        gear.up();
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie)
        {
            Thread.currentThread().interrupt();
        }
        for(DroopNose droopNose : leftWing.getDroopNoseArrayList())
            droopNose.neutral();
        for(DroopNose droopNose : rightWing.getDroopNoseArrayList())
            droopNose.neutral();
        for(Elevator elevator : body.getElevatorArrayList())
            elevator.neutral();
        for(Slat slat : leftWing.getSlatArrayList())
            slat.neutral();
        for(Slat slat : rightWing.getSlatArrayList())
            slat.neutral();
        for(Flat flat : leftWing.getFlapArrayList())
            flat.neutral();
        for(Flat flat : rightWing.getFlapArrayList())
            flat.neutral();

        //Reisehöhe und Geschwindigkeit erreicht

        for(Kitchen kitchen : body.getKitchenArrayList())
            kitchen.unlock();
        for(Lavatory lavatory : body.getLavatoryArrayList())
            lavatory.unlock();
        for(WasteSystem wasteSystem : body.getWasteSystemArrayList())
            wasteSystem.on();
        for(WaterSystem waterSystem : body.getWaterSystemArrayList())
            waterSystem.on();
    }
    public void taxi()
    {
        new FlightControlController(this).taxi();
        for(Gear gear : body.getGearList())
            gear.releaseBrake();
        for(TaxiLight taxiLight : body.getTaxiLightArrayList())
            taxiLight.on();
        for (APU apu : body.getApuArrayList())
            apu.increasePRM(250);

    }
    public void takeOff()
    {
        new FlightControlController(this).takeOff();
        for(Engine engine : body.getEngineArrayList())
            engine.increase(250);
        try {
            for (int i=0; i<3 ; i++) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie)
        {
            Thread.currentThread().interrupt();
        }
        for(Engine engine : body.getEngineArrayList())
            engine.decrease(250);
        for(FireDetector fireDetector : body.getFireDetectorArrayList())
            fireDetector.scan("Air");
        for(FireDetector fireDetector : leftWing.getFireDetectorArrayList())
            fireDetector.scan("Air");
        for(FireDetector fireDetector : rightWing.getFireDetectorArrayList())
            fireDetector.scan("Air");

        int engineFire=0;
        try {
            for (int i=0; i<2 ; i++) {
                for(Engine engine : body.getEngineArrayList())
                    engine.increase(410);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie)
        {
            Thread.currentThread().interrupt();
        }
        for(Engine engine : body.getEngineArrayList())
        {
            if(engine.getIsAlarm()== true)
            {
                engineFire++;
            }
        }
        if(engineFire == 0)
        {
            try {
                for (int i=0; i<3 ; i++) {
                    for(Engine engine : body.getEngineArrayList())
                        engine.increase(410);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ie)
            {
                Thread.currentThread().interrupt();
            }
        }
        else if(engineFire >0)
        {
            for(Engine engine : body.getEngineArrayList())
                engine.shutdown();
        }


    }
    public void rightTurn()
    {
        new FlightControlController(this).rightTurn();
        for(RightAileron rightAileron : rightWing.getRightAileronArrayList())
            rightAileron.up();
        for(LeftAileron leftAileron : leftWing.getLeftAileronArrayList())
            leftAileron.down();
        for(Rudder rudder : body.getRudderArrayList())
            rudder.fullRight();
        try {
            for (int i=0; i<3 ; i++) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie)
        {
            Thread.currentThread().interrupt();
        }
        for(RightAileron rightAileron : rightWing.getRightAileronArrayList())
            rightAileron.neutral();
        for(LeftAileron leftAileron : leftWing.getLeftAileronArrayList())
            leftAileron.neutral();
        for(Rudder rudder : body.getRudderArrayList())
            rudder.neutral();
    }
    public void leftTurn()
    {
        new FlightControlController(this).leftTurn();
        for(RightAileron rightAileron : rightWing.getRightAileronArrayList())
            rightAileron.down();
        for(LeftAileron leftAileron : leftWing.getLeftAileronArrayList())
            leftAileron.up();
        for(Rudder rudder : body.getRudderArrayList())
            rudder.fullLeft();
        try {
            for (int i=0; i<3 ; i++) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie)
        {
            Thread.currentThread().interrupt();
        }
        for(RightAileron rightAileron : rightWing.getRightAileronArrayList())
            rightAileron.neutral();
        for(LeftAileron leftAileron : leftWing.getLeftAileronArrayList())
            leftAileron.neutral();
        for(Rudder rudder : body.getRudderArrayList())
            rudder.neutral();
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
