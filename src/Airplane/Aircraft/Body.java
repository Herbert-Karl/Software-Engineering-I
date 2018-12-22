package Airplane.Aircraft;
import java.util.ArrayList;

import Airplane.FlightControls.Implementations.Gear;
import Airplane.FlightControls.Interfaces.IElevator;
import Airplane.FlightControls.Interfaces.IRudder;
import Airplane.Lights.*;
import Airplane.Management.CostOptimizer;
import Airplane.Management.RouteManagement;
import Airplane.Management.SeatManagement;
import Airplane.Tanks.*;
import Airplane.cabin.*;
import Airplane.door.BulkCargoDoor;
import Airplane.door.CrewDoor;
import Airplane.door.EmergencyExitDoor;
import Airplane.door.GearDoor;
import Airplane.seat.BusinessClassSeat;
import Airplane.seat.CrewSeat;
import Airplane.seat.FirstClassSeat;
import Airplane.seat.TouristClassSeat;
import Airplane.stowage_cargo.CargoSystem;
import Airplane.stowage_cargo.StowageNumberFive;



public class Body {
    private Airplane airplane;
    private ArrayList<Battery> batteryList;
    private ArrayList<Gear> gearList;
    private ArrayList<APU> apuArrayList;
    private ArrayList<HydraulicPump> hydraulicPumpArrayList;
    private ArrayList<AirConditioning> airConditioningArrayList;
    private ArrayList<Kitchen> kitchenArrayList;
    private ArrayList<Lavatory> lavatoryArrayList;
    private ArrayList<WasteSystem> wasteSystemArrayList;
    private ArrayList<WaterSystem> waterSystemArrayList;
    private ArrayList<EscapeSlide> escapeSlideArrayList;
    private ArrayList<BulkCargoDoor> bulkCargoDoorArrayList;
    private ArrayList<CrewDoor> crewDoorArrayList;
    private ArrayList<EmergencyExitDoor> emergencyExitDoorArrayList;
    private ArrayList<GearDoor> gearDoorArrayList;
    private ArrayList<FirstClassSeat> firstClassSeatArrayList;
    private ArrayList<BusinessClassSeat> businessClassSeatArrayList;
    private ArrayList<TouristClassSeat> touristClassSeatArrayList;
    private ArrayList<CrewSeat> crewSeatArrayList;
    private ArrayList<APUOilTank> apuOilTankArrayList;
    private ArrayList<Battery> batteryArrayList;
    private ArrayList<NitrogenBottle> nitrogenBottleArrayList;
    private ArrayList<OxygenBottle> oxygenBottleArrayList;
    private ArrayList<PortableWaterTank> portableWaterTankArrayList;
    private ArrayList<WasteWaterTank> wasteWaterTankArrayList;
    private ArrayList<FireExtinguisher> fireExtinguisherArrayList;
    private ArrayList<DeIcingSystem> deIcingSystemArrayList;
    private ArrayList<AntiCollisionLight> antiCollisionLightArrayList;
    private ArrayList<CargoCompartmentLight> cargoCompartmentLightArrayList;
    private ArrayList<LandingLight> landingLightArrayList;
    private ArrayList<LogoLight> logoLightArrayList;
    private ArrayList<TailNavigationLight> tailNavigationLightArrayList;
    private ArrayList<TaxiLight> taxiLightArrayList;
    private ArrayList<TCASLight> tcasLightArrayList;
    private ArrayList<Elevator> elevatorArrayList;
    private ArrayList<Rudder> rudderArrayList;
    private ArrayList<IceDetectorProbe> iceDetectorProbeArrayList;
    private ArrayList<FireDetector> fireDetectorArrayList;
    private ArrayList<OxygenSensor> oxygenSensorArrayList;
    private ArrayList<ShockSensor> shockSensorArrayList;
    private ArrayList<StallingSensor> stallingSensorArrayList;
    private ArrayList<TemperatureSensor> temperatureSensorArrayList;
    private ArrayList<AirflowSensor> airflowSensorArrayList;
    private ArrayList<PitotTube> pitotTubeArrayList;
    private ArrayList<RadarAltimeter> radarAltimeterArrayList;
    private ArrayList<TCAS> tcasArrayList;
    private ArrayList<TurbulentAirFlowSensor> turbulentAirFlowSensorArrayList;
    private ArrayList<Camera> cameraArrayList;
    private ArrayList<GPS> gpsArrayList;
    private ArrayList<Radar> radarArrayList;
    private ArrayList<SatCom> satComArrayList;
    private ArrayList<VHF> vhfArrayList;
    private ArrayList<CargoSystem> cargoSystemArrayList;
    private ArrayList<StowageNumberFive> stowageNumberFiveArrayList;
    private ArrayList<CostOptimizer> costOptimizerArrayList;
    private ArrayList<RouteManagement> routeManagementArrayList;
    private ArrayList<SeatManagement> seatManagementArrayList;


    public Body(Airplane airplane) {
        this.airplane = airplane;
        build();
    }

    public ArrayList<Gear> getGearList() {
        return gearList;
    }

    public void build() {


        //Schreibt die Daten für die Übergabe Parameter bitte selbst in die Klammern!!!


        //APU
        for(int i=0; i<1;i++)
            apuArrayList.add(new APU(""));
        //Gear
        for(int i=0; i<3;i++)
            gearList.add(new Gear(""));
        //Hydraulic Pump
        for(int i=0; i<6;i++)
            hydraulicPumpArrayList.add(new HydraulicPump(""));
        //Air Condition
        for(int i=0; i<4;i++)
            airConditioningArrayList.add(new AirConditioning("","", ""));
        //Kitchen
        for(int i=0; i<4;i++)
            kitchenArrayList.add(new Kitchen(""));
        //Lavatory
        for(int i=0; i<8;i++)
            lavatoryArrayList.add(new Lavatory(""));
        //Wastesystem
        for(int i=0; i<10;i++)
            wasteSystemArrayList.add(new WasteSystem(""));
        //Watersystem
        for(int i=0; i<4;i++)
            waterSystemArrayList.add(new WaterSystem(""));
        //Escape Slide
        for(int i=0; i<14;i++)
            escapeSlideArrayList.add(new EscapeSlide(""));
        //Bulk Cargo Door
        for(int i=0; i<2;i++)
            bulkCargoDoorArrayList.add(new BulkCargoDoor(""));
        //Crew Door
        for(int i=0; i<2;i++)
            crewDoorArrayList.add(new CrewDoor(""));
        //Emergency Exit Door
        for(int i=0; i<14;i++)
            emergencyExitDoorArrayList.add(new EmergencyExitDoor(""));
        //Gear Door
        for(int i=0; i<6;i++)
            gearDoorArrayList.add(new GearDoor(""));
        //First Class Seat
        for(int i=0; i<airplane.getConfiguration().numberOfFirstClassSeat;i++)
            firstClassSeatArrayList.add(new FirstClassSeat(""));
        //Business Class Seat
        for(int i=0; i<airplane.getConfiguration().numberOfBusinessClassSeat;i++)
            businessClassSeatArrayList.add(new BusinessClassSeat(""));
        //Tourist Class Seat
        for(int i=0; i<airplane.getConfiguration().numberOfTouristSeat;i++)
            touristClassSeatArrayList.add(new TouristClassSeat(""));
        //Crew Seat
        for(int i=0; i<airplane.getConfiguration().numberOfCrewSeat;i++)
            crewSeatArrayList.add(new CrewSeat(""));
        //APU Oil Tank
        for(int i=2; i<1;i++)
            apuOilTankArrayList.add(new APUOilTank(""));
        //Battery
        for (int i = 0;i < 24;i++)
            batteryList.add(new Battery("M","B01","BT" + i,100));
        //Nitrogen Bottle
        for(int i=0; i<8;i++)
            nitrogenBottleArrayList.add(new NitrogenBottle(""));
        //OxygenBottle
        for(int i=0; i<10;i++)
            oxygenBottleArrayList.add(new OxygenBottle(""));
        //Potable Water Tank
        for(int i=0; i<8;i++)
            portableWaterTankArrayList.add(new PortableWaterTank(""));
        //Waste Water Tank
        for(int i=0; i<4;i++)
            waterSystemArrayList.add(new WasteWaterTank(""));
        //FireExtinguisher
        for(int i=0; i<14;i++)
            fireExtinguisherArrayList.add(new FireExtinguisher(""));
        //Delcing System
        for(int i=0; i<2;i++)
            deIcingSystemArrayList.add(new DelcingSystem(""));
        //Anti Collision Light
        for(int i=0; i<2;i++)
            antiCollisionLightArrayList.add(new AntiCollisionLight(""));
        //
        for(int i=0; i<4;i++)
            cargoCompartmentLightArrayList.add(new CargoCompartmentLight(""));
        //
        for(int i=0; i<2;i++)
            landingLightArrayList.add(new LandingLight(""));
        //
        for(int i=0; i<2;i++)
            logoLightArrayList.add(new LogoLight(""));
        //
        for(int i=0; i<2;i++)
            tailNavigationLightArrayList.add(new TailNavigationLight(""));
        //
        for(int i=0; i<2;i++)
            taxiLightArrayList.add(new TaxiLight(""));
        //
        for(int i=0; i<2;i++)
            tcasLightArrayList.add(new TCASLight(""));
        //Elevator
        for(int i=0; i<4;i++)
            elevatorArrayList.add(new Elevator(""));
        //Rudder
        for(int i=0; i<2;i++)
            rudderArrayList.add(new Rudder(""));
        //IceDetectorProbe
        for(int i=0; i<2;i++)
            iceDetectorProbeArrayList.add(new IceDetectorProbe(""));
        //FireDetector
        for(int i=0; i<14;i++)
            fireDetectorArrayList.add(new FireDetector(""));
        //OxygenSensor
        for(int i=0; i<8;i++)
            oxygenSensorArrayList.add(new OxygenSensor(""));
        //ShockSensor
        for(int i=0; i<2;i++)
            shockSensorArrayList.add(new ShockSensor(""));
        //StallingSensor
        for(int i=0; i<2;i++)
            stallingSensorArrayList.add(new StallingSensor(""));
        //TemperatureSensor
        for(int i=0; i<2;i++)
            temperatureSensorArrayList.add(new TemperatureSensor(""));
        //AirflowSensor
        for(int i=0; i<2;i++)
            airflowSensorArrayList.add(new AirflowSensor(""));
        //PitotTube
        for(int i=0; i<2;i++)
            pitotTubeArrayList.add(new PitotTube(""));
        //RadarAltimeter
        for(int i=0; i<2;i++)
            radarAltimeterArrayList.add(new RadarAltimeter(""));
        //TCAS
        for(int i=0; i<2;i++)
            tcasArrayList.add(new TCAS(""));
        //TurbulentAirFlowSensor
        for(int i=0; i<2;i++)
            turbulentAirFlowSensorArrayList.add(new TurbulentAirFlowSensor(""));
        //Camera
        for(int i=0; i<2;i++)
            cameraArrayList.add(new Camera(""));
        //GPS
        for(int i=0; i<2;i++)
            gpsArrayList.add(new GPS(""));
        //Radar
        for(int i=0; i<2;i++)
            radarArrayList.add(new Radar(""));
        //SatCom
        for(int i=0; i<2;i++)
            satComArrayList.add(new SatCom(""));
        //VHF
        for(int i=0; i<2;i++)
            vhfArrayList.add(new VHF(""));
        //CargoSystem
        for(int i=0; i<1;i++)
            cargoSystemArrayList.add(new CargoSystem(""));
        //Stowage Number Five
        for(int i=0; i<1;i++)
            stowageNumberFiveArrayList.add(new StowageNumberFive(""));


    }

    public ArrayList<IBattery> getBatteryList() {
        return batteryList;
    }

    public APU getApu() {
        return apu;
    }

    public ArrayList<Engine> getEngineArrayList() {
        return engineArrayList;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public ArrayList<APU> getApuArrayList() {
        return apuArrayList;
    }

    public ArrayList<HydraulicPump> getHydraulicPumpArrayList() {
        return hydraulicPumpArrayList;
    }

    public ArrayList<AirConditioning> getAirConditioningArrayList() {
        return airConditioningArrayList;
    }

    public ArrayList<Kitchen> getKitchenArrayList() {
        return kitchenArrayList;
    }

    public ArrayList<Lavatory> getLavatoryArrayList() {
        return lavatoryArrayList;
    }

    public ArrayList<WasteSystem> getWasteSystemArrayList() {
        return wasteSystemArrayList;
    }

    public ArrayList<WaterSystem> getWaterSystemArrayList() {
        return waterSystemArrayList;
    }

    public ArrayList<EscapeSlide> getEscapeSlideArrayList() {
        return escapeSlideArrayList;
    }

    public ArrayList<BulkCargoDoor> getBulkCargoDoorArrayList() {
        return bulkCargoDoorArrayList;
    }

    public ArrayList<CrewDoor> getCrewDoorArrayList() {
        return crewDoorArrayList;
    }

    public ArrayList<EmergencyExitDoor> getEmergencyExitDoorArrayList() {
        return emergencyExitDoorArrayList;
    }

    public ArrayList<GearDoor> getGearDoorArrayList() {
        return gearDoorArrayList;
    }

    public ArrayList<FirstClassSeat> getFirstClassSeatArrayList() {
        return firstClassSeatArrayList;
    }

    public ArrayList<BusinessClassSeat> getBusinessClassSeatArrayList() {
        return businessClassSeatArrayList;
    }

    public ArrayList<TouristClassSeat> getTouristClassSeatArrayList() {
        return touristClassSeatArrayList;
    }

    public ArrayList<CrewSeat> getCrewSeatArrayList() {
        return crewSeatArrayList;
    }

    public ArrayList<AntiCollisionLight> getAntiCollisionLightArrayList() {
        return antiCollisionLightArrayList;
    }

    public ArrayList<CargoCompartmentLight> getCargoCompartmentLightArrayList() {
        return cargoCompartmentLightArrayList;
    }

    public ArrayList<LandingLight> getLandingLightArrayList() {
        return landingLightArrayList;
    }

    public ArrayList<LogoLight> getLogoLightArrayList() {
        return logoLightArrayList;
    }

    public ArrayList<TailNavigationLight> getTailNavigationLightArrayList() {
        return tailNavigationLightArrayList;
    }

    public ArrayList<TaxiLight> getTaxiLightArrayList() {
        return taxiLightArrayList;
    }

    public ArrayList<TCASLight> getTcasLightArrayList() {
        return tcasLightArrayList;
    }

    public ArrayList<IElevator> getElevatorArrayList() {
        return elevatorArrayList;
    }

    public ArrayList<IRudder> getRudderArrayList() {
        return rudderArrayList;
    }

    public ArrayList<IceDetectorProbe> getIceDetectorProbeArrayList() {
        return iceDetectorProbeArrayList;
    }

    public ArrayList<FireDetector> getFireDetectorArrayList() {
        return fireDetectorArrayList;
    }

    public ArrayList<OxygenSensor> getOxygenSensorArrayList() {
        return oxygenSensorArrayList;
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

    public ArrayList<PitotTube> getPitotTubeArrayList() {
        return pitotTubeArrayList;
    }

    public ArrayList<RadarAltimeter> getRadarAltimeterArrayList() {
        return radarAltimeterArrayList;
    }

    public ArrayList<TCAS> getTcasArrayList() {
        return tcasArrayList;
    }

    public ArrayList<TurbulentAirFlowSensor> getTurbulentAirFlowSensorArrayList() {
        return turbulentAirFlowSensorArrayList;
    }

    public ArrayList<Camera> getCameraArrayList() {
        return cameraArrayList;
    }

    public ArrayList<GPS> getGpsArrayList() {
        return gpsArrayList;
    }

    public ArrayList<Radar> getRadarArrayList() {
        return radarArrayList;
    }

    public ArrayList<SatCom> getSatComArrayList() {
        return satComArrayList;
    }

    public ArrayList<VHF> getVhfArrayList() {
        return vhfArrayList;
    }

    public ArrayList<CargoSystem> getCargoSystemArrayList() {
        return cargoSystemArrayList;
    }

    public ArrayList<StowageNumberFive> getStowageNumberFiveArrayList() {
        return stowageNumberFiveArrayList;
    }

    public ArrayList<CostOptimizer> getCostOptimizerArrayList() {
        return costOptimizerArrayList;
    }

    public ArrayList<RouteManagement> getRouteManagementArrayList() {
        return routeManagementArrayList;
    }

    public ArrayList<SeatManagement> getSeatManagementArrayList() {
        return seatManagementArrayList;
    }
}
