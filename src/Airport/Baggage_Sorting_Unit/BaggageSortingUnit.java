package src.Airport.Baggage_Sorting_Unit;

import java.util.ArrayList;

import Airport.Airport.GateID;
import Airport.Base.Baggage;
import Airport.Base.Container;
import Airport.Base.Employee;

public class BaggageSortingUnit implements IBaggageSortingUnit {

  private ArrayList<Airport.Base.Employee> employeeList;

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
  public BaggageSortingUnit(final Airport.Airport.AirportRecourcePool pool) {
    employeeList = pool.getEmployees();
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
   * TODO: Kickoff routine
   */
  @Override
  public void executeRequest(GateID gateID) {

  }

  /**
   * loggs employee into Scanner via iDCard
   */
  @Override
  public void loginBaggageScanner(Employee employee, String password) {
    baggageScanner.login(employee.getIDCard(), password);
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
  public boolean scan(Baggage baggage, String pattern) {

    return baggageScanner.scan(baggage, pattern);
  }

  /**
   * TODO: check
   * adds baggage to roboter list and passes roboter to customs, clears roboter
   */
  @Override
  public void handOverToCustoms(Baggage baggage) {
    roboter.addBaggage(baggage);
    customs.executeRequest(roboter);
    roboter = null;
  }

  /**
   * TODO: implement Pattern / when is scan true?
   * checks baggage and decides where to move it
   */
  @Override
  public void throwOff(LuggageTub luggageTub, DestinationBox destinationBox) {
    Baggage toCheck = luggageTub.getBaggage();
    String pattern = "Please change me. I don't know what I'm doing";

    if (scan(toCheck, pattern)) {
      destinationBox.add(toCheck);
    } else {
      handOverToCustoms(toCheck);
    }
  }

  @Override
  public void emptyDestinationBox() {
    roboter.moveBaggageToDepot(destinationBox.getBaggageList());
    destinationBox.empty();
  }

  /**
   * TODO: what to do?
   */
  @Override
  public void sendContainerLifterToGate() {

  }

  /**
   * TODO: check
   */
  @Override
  public void optimizeAirplaneLoading() {
    AirplaneLoadingManagement manage = new AirplaneLoadingManagement();
    manage.optimizeBalancing();
    loadBaggageVehicle(manage.getStrategy());
  }

  /**
   * TODO: setter ohne parameter?
   */
  @Override
  public void setBaggageVehicle() {

  }

  /**
   * TODO: check
   */
  @Override
  public void loadBaggageVehicle(LoadingStrategy strategy) {
    roboter.selectBaggageFromDepot();
    roboter.loadContainer();
  }

  @Override
  public void sendBaggageVehicleToGate() {
    baggageVehicle.setFlashingLightOn();
    baggageVehicle.move(15);
    baggageVehicle.setGate(42);//TODO: wo bekomme ich das gate her
    baggageVehicle.stop();
    baggageVehicle.setFlashingLightOff();
  }

  /**
   * TODO: Wo bekomme ich die GroundOperations her an die ich die message sende
   * @param baggageSortingUnitReceipt
   */
  @Override
  public void notifyGroundOperations(BaggageSortingUnitReceipt baggageSortingUnitReceipt) {

  }

  /**
   * TODO: Wo bekomme ich den CheckInDest mit dem ich rede
   */
  @Override
  public void returnEmptyLuggageTubToCheckInDesk() {

  }
}
