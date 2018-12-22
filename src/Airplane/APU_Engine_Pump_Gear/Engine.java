
public abstract class Engine implements IEngine {
  String manufacturer;
  String type;
  String id;
  boolean isStarted;
  int rpm;
  boolean isFire;
  

//Implementation der Methoden

public int increaseRPM(int value, int rpm) {

int speed = rpm + value  ;

int maxRPM = 6500;
int minRPM = 0;

if (speed < 6500){

for (int i =rpm; i< speed; i++){
rpm = i;
}
}
return rpm;
}


public int decreaseRPM(int rpm,int value) {
                
int speed = (rpm - value)      ;
int maxRPM = 6500;
int minRPM = 0;

if(speed > 0){

for (int i =rpm; i > speed; i--){
rpm = i;
}
}
return rpm;
}


public void shutdown() {

int minRPM = 0;
  if (isStarted == true){
isStarted = false;
}
for ( int i = rpm; i>minRPM; i--) {
rpm = i;
}
    }


public void extinguishFire(){
    if (isFire == true) {
    
    System.out.println("Engine is on fire"); 
    
    
      
   
      
    } 
}
  
  public String version(){
    return "<" + id + "> - <" + type + ">";   
  }
/*
public boolean start(){
isStarted = true;
}
*/

}
