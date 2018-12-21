public abstract class Gear implements IGear {
  String manufacturer;
  String type;
  String id;
  //ArrayList<Wheel> wheels;
  boolean isDown;
  
  Brake brake = new Brake() ;
  
  public String version(){
    return "<" + id + "> - <" + type + ">";   
  }
  
  public GearType setType(String type){
    if(type == "front"){
      return GearType.front;
      }
    else{
      return GearType.rear;
    }
  }
  
  
  public void down(){
    isDown = true;
  }
  public void up(){
    isDown = false;
  }
  
  /*
  public void setBrake(){
    while(Brake.percentage != 100){
      Brake.percentage++;
    }
  }
  
  */
  /*
  public void setBrake(int percentage){
    //Folgende Lösung für absoluten Wert in percentage
    Brake.percentage = percentage;
    //Auskommentierte Lösung für relativen Wert in percentage um den die Bremse verändert werden muss
    /**
    if((Brake.percentage + percentage) > 100){
      Brake.percentage = 100;
    }
    else if((Brake.percentage + percentage) < 0){
      Brake.percentage = 0;
    }
    else{
      Brake.percentage = Brake.percentage + percentage
    }**/
  }
  /*
  public void releaseBrake(){
    while(Brake.percentage != 0){
      Brake.percentage--;
    }
  }
}
*/

class Wheel{
  String id;
  long dateofManufacture;
  Brake brake;
}

class Brake{
  String id;
  long dateofManufacture;
  int percentage;
}
