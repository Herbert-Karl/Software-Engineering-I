package Airplane.Aircraft;


import Airplane.Aircraft.Body;
import Airplane.Aircraft.Wing;

public abstract class Airplane {
protected Configuration configuration;
    /*
    protected APU apu;
    public AirConditioning airConditioning;
    public Kitchen kitchen;
    public Lavatory lavatory;
    public Wastesystem wastesystem;
    public Watersystem watersystem;
    public EscapeSlide escapeSlide;
    public BulkCargoDoor bulkCargoDoor;
    public CrewDoor crewDoor;
    public EmergencyExitDoor emergencyExitDoor;
    public GearDoor gearDoor;
    public FirstClassSeat firstClassSeat;
    public BusinessClassSeat businessClassSeat;
    public TouristClassSeat touristClassSeat;
    public CrewSeat crewSeat;
    public APUOilTank apuOilTank;
    public Battery battery;
    public NitrogenBottle nitrogenBottle;
    public OxygenBottle oxygenBottle;
    public PotableWaterTank potableWaterTank;
    public WasteWaterTank wasteWaterTank;
    public FireExtinguisher fireExtinguisher;
    public AntiCollisionLight antiCollisionLight;
    public CargoCompartmentLight cargoCompartmentLight;
    public LogoLight logoLight;
    public TailNavigationLight tailNavigationLight;
    public TaxiLight taxiLight;
    public TCASLight tcasLight;
    public Elevator elevator;
    public Rudder rudder;
    public OxygenSensor oxygenSensor;
    public PilotTube pilotTube;
    public RadarAltimeter radarAltimeter;
    public TCAS tcas;
    public GPS gps;
    public Radar radar;
    public SatCom satCom;
    public VHF vhf;
    public CargoSystem cargoSystem;
    public StowageNumberFive stowageNumberFive;
    public CostOptimizer costOptimizer;
    public RouteManagement routeManagement;
    public SeatManagement seatManagement;
    public HydraulicPump hydraulicPump;
    public DelcingSystem delcingSystem;
    public LandingLight landingLight;
    public IceDetectorProbe iceDetectorProbe;
    public FireDetector fireDetector;
    public ShockSensor shockSensor;
    public StallingSensor stallingSensor;
    public TemeratureSensor temeratureSensor;
    public AirflowSensor airflowSensor;
    public TurbulentAirFlowSensor turbulentAirFlowSensor;
    public Camera camera;
    public Engine engine;
    public EngineOilTank engineOilTank;
    public FuelTank fuelTank;
    public LeftNavigationLight leftNavigationLight;
    public RightNavigationLight rightNavigationLight;
    public DroopNose droopNose;
    public Flap flap;
    public Slat slat;
    public LeftAileron leftAileron;
    public RightAileron rightAileron;
    public Spoiler spoiler;
    public ExhaustGasTemeratureSensor exhaustGasTemeratureSensor;
    public FuelFlowSensor fuelFlowSensor;
    public FuelSensor fuelSensor;
*/
    protected Body body;
    protected Wing leftWing;
    protected Wing rightWing;

    public Configuration getConfiguration() {
        return configuration;
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

//abstract Methods

    public abstract void build();
    public abstract void startup();
    public abstract void taxi();
    public abstract void takeOff();
    public abstract void rightTurn();
    public abstract void leftTurn();
}
