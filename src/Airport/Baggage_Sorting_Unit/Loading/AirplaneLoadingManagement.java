package Airport.Baggage_Sorting_Unit.Loading;

import Airplane.Aircraft.Airplane;
import Airplane.stowage_cargo.FrontStowage;
import Airplane.stowage_cargo.Stowage;
import Airport.Airport.Airport;
import Airport.Baggage_Sorting_Unit.BaggageSortingUnit;
import Airport.Base.Baggage;
import Airport.Base.Container;
import Airport.Base.NormalBaggage;
import Airport.Base.TicketClass;

import java.lang.reflect.Array;
import java.util.*;

public class AirplaneLoadingManagement implements IAirplaneLoadingManagement {

  public LoadingStrategy getStrategy() {
    return strategy;
  }

  private LoadingStrategy strategy;

  private ArrayList<Container> filledContainerList;

  public AirplaneLoadingManagement(ArrayList<Container> containerList){
    filledContainerList = containerList;
  }

  /**
   * TODO: Optimizes the loading strategy
   */
  @Override
  public void optimizeBalancing() {


    HashMap<String, Double> weightMap = weighContainer(filledContainerList);
    ArrayList<Container> currentList = filledContainerList;
    double balance = 1000000;

    for(int i = 0; i<1000000; i++){
      ArrayList<Container> randomList=generateRandomList(filledContainerList);
      double newBalance = checkBalance(randomList, weightMap);
      if (newBalance < balance){
        balance = newBalance;
        currentList = randomList;
      }
    }

    strategy = new LoadingStrategy(convertToIdList(currentList));

  }

  private ArrayList<String> convertToIdList(ArrayList<Container> currentList) {
    ArrayList<String> idList = new ArrayList<>();
    for(Container c: currentList){
      idList.add(c.getId());
    }
    return  idList;
  }

  private double checkBalance(ArrayList<Container> randomList, HashMap<String, Double> weightMap) {
    ArrayList<Container> containerListLeft = new ArrayList<>();
    ArrayList<Container> containerListRight = new ArrayList<>();
    for(int i = 0; i< randomList.size(); i++){
      if(i%2 == 0){
        containerListLeft.add(randomList.get(i));
      }
      else{
        containerListRight.add(randomList.get(i));
      }
    }
    if(containerListLeft.size() != containerListRight.size()){
      throw new RuntimeException("ContainerList of right stowage and the one of left stowage have different lengths");
    }
    double weightLeft = 0;
    double weightRight = 0;

    for(int i = 0; i < containerListLeft.size();i++){
      weightLeft += weightMap.get(containerListLeft.get(i).getId());
      weightRight += weightMap.get(containerListRight.get(i).getId());
    }

    return Math.abs(weightLeft - weightRight);
  }

  private ArrayList<Container> generateRandomList(ArrayList<Container> containerList) {
    ArrayList<Container> firstAndBusiness = new ArrayList<>();
    //find first and business containers
    for(Container c: containerList){
      NormalBaggage someBaggage = (NormalBaggage) c.getBaggageList().get(0);
      TicketClass tClass = someBaggage.getBaggageIdentificationTag().getBoardingPass().getTicketClass();
      if(tClass == TicketClass.Business || tClass == TicketClass.First){
        firstAndBusiness.add(c);
      }
    }
    //Remove first and business from containerList
    for(Container c: firstAndBusiness){
      containerList.remove(c);
    }
    Collections.shuffle(containerList);
    firstAndBusiness.addAll(containerList); //nach firstAndBusiness alle shuffledContainer einfügen
    return firstAndBusiness;
  }

  private HashMap<String, Double> weighContainer(ArrayList<Container> containerList){
    HashMap<String, Double> weightMap = new HashMap<>();
    for (Container c: containerList){
      double containerWeight = 0;
      Stack<Baggage> baggageList = c.getBaggageList();
      while(!(baggageList.empty())){
        Baggage b = baggageList.pop();
        containerWeight += b.getWeight();
      }
      weightMap.put(c.getId(), containerWeight);
    }
    return weightMap;
  }

}
