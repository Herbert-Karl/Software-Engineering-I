package Airport.Baggage_Sorting_Unit;

import Airport.Airport.AirportRecourcePool;
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
import Airport.Scanner.IBaggageScanner;

import java.util.ArrayList;

public class BaggageSortingUnit implements IBaggageSortingUnit {

  private final ArrayList<Employee> employeeList;

  private ArrayList<String> scanPatternList;

  private IBaggageScanner baggageScanner;

  private IBaggageSortingUnitRoboter roboter;

  private BaggageDepot baggageDepot;

  private DestinationBox destinationBox;

  private ArrayList<LuggageTub> emptyLuggageTubList;

  private ArrayList<Container> emptyContainerList;

  private ArrayList<Container> filledContainerList;

  private IBaggageVehicle baggageVehicle;

  private ICustoms customs;

  /**
   * Init with base data from Pool
   * TODO:
   */
  public BaggageSortingUnit(final AirportRecourcePool pool) {

    employeeList = pool.getEmployees();
    roboter = new BaggageSortingUnitRoboter(this);
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
    ArrayList<LuggageTub> fullTubs;//TODO get list of full tubs
    loginBaggageScanner(someone, something);//TODO get correct user and pw
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
   * TODO: check
   * adds baggage to roboter list and passes roboter to customs, clears roboter
   */
  @Override
  public void handOverToCustoms(final Baggage baggage) {
    roboter.addBaggage(baggage);
    customs.executeRequest(roboter);
    roboter = null;//TODO: wo bekomme ich den roboter wieder her?
  }

  /**
   * TODO: implement Pattern / when is scan true?
   * checks baggage and decides where to move it
   */
  @Override
  public void throwOff(final LuggageTub luggageTub, final DestinationBox destinationBox) {
    final Baggage toCheck = luggageTub.getBaggage();
    emptyLuggageTubList.add(luggageTub);
    final String pattern = "Please change me. I don't know what I'm doing";

    if (scan(toCheck, pattern)) {
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
   * TODO: what to do? (obekt fuer lifter ist nichtmal vorhanden)
   */
  @Override
  public void sendContainerLifterToGate() {
    final IContainerLifter lifter = baggageVehicle.getContainerLifter();

    lifter.setFlashingLightOn();
    lifter.move(15);
    lifter.setGate();//TODO get gate
    lifter.stop();
    lifter.setFlashingLightOff();
  }

  /**
   * TODO: check
   */
  @Override
  public void optimizeAirplaneLoading() {
    final AirplaneLoadingManagement manage = new AirplaneLoadingManagement();
    manage.optimizeBalancing();
    loadBaggageVehicle(manage.getStrategy());
  }

  /**
   *
   */
  @Override
  public void setBaggageVehicle(final IBaggageVehicle vehicle) {
    baggageVehicle = vehicle;
  }

  /**
   * TODO: check
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
    baggageVehicle.setGate();//TODO: wo bekomme ich das gate her
    baggageVehicle.stop();
    baggageVehicle.setFlashingLightOff();
  }

  /**
   * TODO: Wo bekomme ich die GroundOperations her an die ich die message sende
   */
  @Override
  public void notifyGroundOperations(final BaggageSortingUnitReceipt baggageSortingUnitReceipt) {

  }

  /**
   * TODO: Wo bekomme ich den CheckInDest mit dem ich rede
   */
  @Override
  public void returnEmptyLuggageTubToCheckInDesk() {

  }
}
