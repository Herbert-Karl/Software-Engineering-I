package Airport.Baggage_Sorting_Unit;

import Airport.Airport.Airport;
import Airport.Airport.Gate;
import Airport.Airport.GateID;
import Airport.Baggage_Sorting_Unit.Loading.AirplaneLoadingManagement;
import Airport.Baggage_Sorting_Unit.Loading.LoadingStrategy;
import Airport.Baggage_Sorting_Unit.Receipts.BaggageSortingUnitReceipt;
import Airport.Baggage_Sorting_Unit.Storage.BaggageDepot;
import Airport.Baggage_Sorting_Unit.Storage.BaggageSortingUnitRoboter;
import Airport.Baggage_Sorting_Unit.Storage.IBaggageSortingUnitRoboter;
import Airport.Baggage_Sorting_Unit.Vehicles.IBaggageVehicle;
import Airport.Baggage_Sorting_Unit.Vehicles.IContainerLifter;
import Airport.Base.Baggage;
import Airport.Base.BaggageSecurityStatus;
import Airport.Base.Container;
import Airport.Base.DestinationBox;
import Airport.Base.Employee;
import Airport.Base.IDCard;
import Airport.Base.LuggageTub;
import Airport.Customs.ICustoms;
import Airport.Scanner.BaggageScanner;
import Airport.Scanner.IBaggageScanner;

import java.util.ArrayList;

public class BaggageSortingUnit implements IBaggageSortingUnit {

  private final ArrayList<Employee> employeeList;

  private ArrayList<String> scanPatternList;//TODO get patterns from somewhere

  private final IBaggageScanner baggageScanner;

  private IBaggageSortingUnitRoboter roboter;

  private final BaggageDepot baggageDepot;

  private final DestinationBox destinationBox;

  private final ArrayList<LuggageTub> emptyLuggageTubList;

  private final ArrayList<Container> emptyContainerList;

  private final ArrayList<Container> filledContainerList;

  private IBaggageVehicle baggageVehicle;

  private final ICustoms customs;

  protected final Airport airport;

  private Gate gate;

  /**
   * Init
   * TODO: check
   */
  public BaggageSortingUnit(final ArrayList<Employee> employeeList,
      final BaggageScanner baggageScanner, final DestinationBox destinationBox,
      final ICustoms customs) {

    this.employeeList = employeeList;
    this.baggageScanner = baggageScanner;
    roboter = new BaggageSortingUnitRoboter(this, "42", "42", "42");//TODO init correctly
    baggageDepot = new BaggageDepot("42");//TODO set correct UUID
    this.destinationBox = destinationBox;
    emptyLuggageTubList = new ArrayList<>();
    emptyContainerList = new ArrayList<>();
    filledContainerList = new ArrayList<>();
    this.customs = customs;
    airport = new Airport(null, null, null, null, null, null, null, null, null,
        null);// Airport.getAirport(); TODO get correct airport
  }

  @Override
  public String toString() {
    final String message = "Employees: " + employeeList + "\nScanner: " + baggageScanner
        + "\nRoboter: " + roboter + "\nDepot: " + baggageDepot + "\nDestination box: "
        + destinationBox + "\nFilled containers: " + filledContainerList;

    return message;
  }

  @Override
  public Gate getGate() {
    return gate;
  }

  @Override
  public void setGate(final Gate gate) {
    this.gate = gate;
  }

  public ArrayList<Employee> getEmployeeList() {
    return employeeList;
  }

  public ArrayList<String> getScanPatternList() {
    return scanPatternList;
  }

  public BaggageDepot getBaggageDepot() {
    return baggageDepot;
  }

  public ArrayList<LuggageTub> getEmptyLuggageTubList() {
    return emptyLuggageTubList;
  }

  public ArrayList<Container> getEmptyContainerList() {
    return emptyContainerList;
  }

  public ArrayList<Container> getFilledContainerList() {
    return filledContainerList;
  }

  @Override
  public IBaggageVehicle getVehicle() {
    return baggageVehicle;
  }

  @Override
  public BaggageDepot getDepot() {
    return baggageDepot;
  }

  /**
   * TODO: check Kickoff routine
   * <p>
   * kicks of the routine for sorting all Baggage from the given Gate
   */
  @Override
  public void executeRequest(final GateID gateID) {
    setGate(gateID);
    final ArrayList<LuggageTub> fullTubs = new ArrayList<>();//TODO get list of full tubs
    loginBaggageScanner(employeeList.get(0),
        "420");//TODO get correct user and pw employeeList.get(0).getPassword()
    LuggageTub l;
    while (!fullTubs.isEmpty()) {
      l = fullTubs.remove(0);
      throwOff(l, destinationBox);

      if (destinationBox.isFull()) {
        emptyDestinationBox();
      }
    }
    logoutBaggageScanner();

    if (!destinationBox.isempty()) {
      emptyDestinationBox();
    }

    loadBaggageVehicle(new LoadingStrategy());//TODO: get correct LoadingStrategy

    sendBaggageVehicleToGate();

    sendContainerLifterToGate();

    baggageVehicle.transferContainerToLifter();

    optimizeAirplaneLoading();

    final IContainerLifter lifter = baggageVehicle.getContainerLifter();
    lifter.connectToAirplane();
    lifter.transferContainerToCargoSystem();
    lifter.returnToAirportResourcePool();
  }

  /**
   * logs employee into Scanner via iDCard
   */
  @Override
  public void loginBaggageScanner(final Employee employee, final String password) {
    baggageScanner.login(new IDCard(), password);//TODO employee.getIdCard()
  }

  /**
   * logs user out from Scanner
   */
  @Override
  public void logoutBaggageScanner() {
    baggageScanner.logout();
  }

  /**
   * calls scan of baggageScanner
   */
  @Override
  public boolean scan(final Baggage baggage, final String pattern) {
    return baggageScanner.scan(baggage, pattern);
  }

  /**
   * adds baggage to roboter list and passes roboter to customs, clears roboter
   */
  @Override
  public void handOverToCustoms(final Baggage baggage) {
    roboter.addBaggage(baggage);
    customs.executeRequest(roboter);
    roboter = null;//TODO: wo bekomme ich den roboter wieder her?
  }

  /**
   * checks baggage and sets securityStatus
   * adds it to destinationBox or hands over to customs
   */
  @Override
  public void throwOff(final LuggageTub luggageTub, final DestinationBox destinationBox) {
    final Baggage toCheck = luggageTub.getBaggage();
    emptyLuggageTubList.add(luggageTub);
    final String pattern = "Please change me. I don't know what I'm doing";//TODO Pattern

    if (scan(toCheck, pattern)) {//TODO check return value
      toCheck.setSecurityStatus(
          BaggageSecurityStatus.clean);//möglicherweise nicht nötig je nach implementierung von scan
      //destinationBox.add(toCheck); TODO add Baggage to destination box
    } else {
      toCheck.setSecurityStatus(BaggageSecurityStatus.dangerous);
      handOverToCustoms(toCheck);
    }
  }

  /**
   * Tells Robot to move all baggage to the depot and clears local box
   */
  @Override
  public void emptyDestinationBox() {
    roboter.moveBaggageToDepot(destinationBox.getBaggageList());
    destinationBox.empty();
  }

  /**
   * get lifter from baggageVehicle move it and set the gate
   */
  @Override
  public void sendContainerLifterToGate() {
    final IContainerLifter lifter = baggageVehicle.getContainerLifter();

    lifter.setFlashingLightOn();
    lifter.move(15);
    lifter.setGate(gate.getGateID());
    lifter.stop();
    lifter.setFlashingLightOff();
  }

  /**
   * Creates AirplaneLoadingManagement to balance a strategy
   */
  @Override
  public void optimizeAirplaneLoading() {
    final AirplaneLoadingManagement manage
        = new AirplaneLoadingManagement();//TODO AirplaneLoadingManagement magically appears
    manage.optimizeBalancing();
    loadBaggageVehicle(manage.getStrategy());
  }

  @Override
  public void setBaggageVehicle(final IBaggageVehicle vehicle) {
    baggageVehicle = vehicle;
  }

  /**
   * Tells robot to select Baggage and load the container
   * TODO: use strategy
   */
  @Override
  public void loadBaggageVehicle(final LoadingStrategy strategy) {
    roboter.selectBaggageFromDepot();
    roboter.loadContainer();
  }

  /**
   * Moves vehicle and sets gate
   */
  @Override
  public void sendBaggageVehicleToGate() {
    baggageVehicle.setFlashingLightOn();
    baggageVehicle.move(15);
    baggageVehicle.setGate(gate.getGateID());
    baggageVehicle.stop();
    baggageVehicle.setFlashingLightOff();
  }

  /**
   * gets GroundoperationsCenter and notifys it with the receipt
   */
  @Override
  public void notifyGroundOperations(final BaggageSortingUnitReceipt baggageSortingUnitReceipt) {
    //airport.getOps() TODO get correct Groundoperation
    //new GroundOperationsCenter().notify(baggageSortingUnitReceipt); TODO call correct notify
  }

  /**
   * Returns empty luggage tubs via CheckInMediator
   */
  @Override
  public void returnEmptyLuggageTubToCheckInDesk() {
    //airport.getCheckInMediator().returnLuggageTubs(emptyLuggageTubList); TODO Get Mediator from airport
    emptyLuggageTubList.clear();
  }

  /**
   * finds correct gate for the ID and sets internal attribute
   */
  private void setGate(final GateID id) {
    for (final Gate g : airport.getGateList()) {
      if (g.getGateID() == id) {
        gate = g;
        break;
      }
    }
  }
}
