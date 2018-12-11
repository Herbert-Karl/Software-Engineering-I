package Airplane.Aircraft;

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

import java.util.ArrayList;

public class Body {
    private Airplane airplane;
    private ArrayList<IBattery> batteryList;
    private ArrayList<Gear> gearList;
    private ArrayList<APU> apuArrayList;
    private ArrayList<HydraulicPump> hydraulicPumpArrayList;
    private ArrayList<AirConditioning> airConditioningArrayList;
    private ArrayList<Kitchen> kitchenArrayList;
    private ArrayList<Lavatory> lavatoryArrayList;
    private ArrayList<WasteSystem> wasteSystemArrayList;
    private ArrayList<Watersystem> watersystemArrayList;
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
    private ArrayList<IElevator> elevatorArrayList;
    private ArrayList<IRudder> rudderArrayList;
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
        // batteryList
        for (int i = 0;i < 24;i++)
            batteryList.add(new Battery("M","B01","BT" + i,100));

        // gear
        for (int i = 0;i < airplane.getConfiguration().getNumberOfGear();i++)
            gearList.add(new Gear());
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

    public ArrayList<Watersystem> getWatersystemArrayList() {
        return watersystemArrayList;
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
