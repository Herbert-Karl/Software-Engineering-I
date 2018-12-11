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
import Airport.Base.LuggageTub;
import Airport.Customs.ICustoms;
import Airport.Scanner.BaggageScanner;
import Airport.Scanner.IBaggageScanner;

import java.util.ArrayList;

public class BaggageSortingUnit implements IBaggageSortingUnit {

  private final ArrayList<Employee> employeeList;

  private ArrayList<String> scanPatternList;

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

  protected Gate gate;

  /**
   * Init
   * TODO: check
   */
  public BaggageSortingUnit(final ArrayList<Employee> employeeList,
      final BaggageScanner baggageScanner, final DestinationBox destinationBox,
      final ICustoms customs) {

    this.employeeList = employeeList;
    this.baggageScanner = baggageScanner;
    roboter = new BaggageSortingUnitRoboter(this);
    baggageDepot = new BaggageDepot();
    this.destinationBox = destinationBox;
    emptyLuggageTubList = new ArrayList<>();
    emptyContainerList = new ArrayList<>();
    filledContainerList = new ArrayList<>();
    this.customs = customs;
    airport = Airport.getAirport();
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
   */
  @Override
  public void executeRequest(final GateID gateID) {
    setGate(gateID);
    ArrayList<LuggageTub> fullTubs=new ArrayList<>();//TODO get list of full tubs
    loginBaggageScanner(employeeList.get(0),
        employeeList.get(0).getPassword());//TODO get correct user and pw
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

    loadBaggageVehicle(strategy);//TODO: get loadingstrategy

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
    baggageScanner.login(employee.getIdCard(), password);
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
   * checks baggage and decides where to move it
   */
  @Override
  public void throwOff(final LuggageTub luggageTub, final DestinationBox destinationBox) {
    final Baggage toCheck = luggageTub.getBaggage();
    emptyLuggageTubList.add(luggageTub);
    final String pattern = "Please change me. I don't know what I'm doing";//TODO Pattern

    if (scan(toCheck, pattern)) {//TODO check return value
      toCheck.setSecurityStatus(
          BaggageSecurityStatus.clean);//möglicherweise nicht nötig je nach implementierung von scan
      destinationBox.add(toCheck);
    } else {
      toCheck.setSecurityStatus(BaggageSecurityStatus.dangerous);
      handOverToCustoms(toCheck);
    }
  }

  @Override
  public void emptyDestinationBox() {
    roboter.moveBaggageToDepot(destinationBox.getBaggageList());
    destinationBox.empty();
  }

  /**
   * get lifter from baggageVehicle and run a routine
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
   * TODO: check
   */
  @Override
  public void optimizeAirplaneLoading() {
    final AirplaneLoadingManagement manage
        = new AirplaneLoadingManagement();//AirplaneLoadingManagement magically appears
    manage.optimizeBalancing();
    loadBaggageVehicle(manage.getStrategy());
  }

  @Override
  public void setBaggageVehicle(final IBaggageVehicle vehicle) {
    baggageVehicle = vehicle;
  }

  /**
   * TODO: use strategy
   */
  @Override
  public void loadBaggageVehicle(final LoadingStrategy strategy) {
    roboter.selectBaggageFromDepot();
    roboter.loadContainer();
  }

  @Override
  public void sendBaggageVehicleToGate() {
    baggageVehicle.setFlashingLightOn();
    baggageVehicle.move(15);
    baggageVehicle.setGate(gate.getGateID());
    baggageVehicle.stop();
    baggageVehicle.setFlashingLightOff();
  }

  /**
   * TODO: need airpotr get groundOp
   */
  @Override
  public void notifyGroundOperations(final BaggageSortingUnitReceipt baggageSortingUnitReceipt) {
    airport.getGroundOperationsCenter().notify(baggageSortingUnitReceipt);
  }

  /**
   * TODO: need airport.getCheckIn
   */
  @Override
  public void returnEmptyLuggageTubToCheckInDesk() {
    airport.getCheckInMediator().returnLuggageTubs(emptyLuggageTubList);
    emptyLuggageTubList.clear();
  }

  protected void setGate(final GateID id) {
    for (final Gate g : airport.getGateList()) {
      if (g.getGateID() == id) {
        gate = g;
        break;
      }
    }
  }
}
