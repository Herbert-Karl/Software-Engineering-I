public abstract class APU implements IAPU {
  String manufacturer;
  String type;
  String id;
  boolean isStarted;
  int rpm;
  
  
  public String version(){
    return "<" + id + "> - <" + type + ">";   
  }
  
  public void start(){
    if(isStarted == false){
      isStarted = true;
    }
  }
  /*
  public int increaseRPM(int value){
    int x = rpm;
    if((rpm + value) < 6500){
      for(int i = x; i < (x+value); i++){
        rpm = i;
      }
    }
    else{
      for(int i = x; i < (6500); i++){
        rpm = i;
      }
    }
  }
  /*
  public int decreaseRPM(int value){
    int x = rpm;
    if((rpm - value) > 0){
      for(int i = x; i > (x-value); i--){
        rpm = i;
      }
    }
    else{
      for(int i = x; i > 0; i--){
        rpm = i;
      }
    }
  }
  /*
  public boolean shutdown(){
    isStarted = false;
    while(rpm > 0){
      rpm--;  
    } 
  }
  */
}
