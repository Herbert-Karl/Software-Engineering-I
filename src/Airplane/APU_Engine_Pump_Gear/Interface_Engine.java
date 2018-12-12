
interface IEngine {
  public String version();
  public void start();
  public int increaseRPM(int value);
  public int decreaseRPM(int value);
  public void shutdown();
  public void extinguishFire();


}

class Engine implements IEngine {
  String manufacturer;
  String type;
  String id;
  boolean isStarted;
  int rpm;
  boolean isFire;


//Implementation der Methoden

public int increaseRPM(int value) {
int rpm ;
int speed = rpm + value  ;

int maxRPM = 6500;
int minRPM = 0;

if (speed < 6500){

for (int i =rpm; i< speed; i++){
rpm = i;
}
}
}


public int decreaseRPM() {
int rpm ;
int speed = rpm-value      ;
int maxRPM = 6500;
int minRPM = 0;

if(speed > 0){

for (int i =rpm; i > speed; i--){
rpm = i;
}
}
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

public string version(){
system.out.println(version);
}

public boolean start(){
isStarted = true;
}


}
