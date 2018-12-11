package Airport.Pushback_Vehicle;

import Airplane.Aircraft.Airplane;
import Airport.Airport.TaxiWay;

//Fertig
public interface IPushBackVehicle {
     void connect(Airplane airplane);
     void disconnectAirplane();
     void execute(Airplane airplane, TaxiWay taxiWay);
     void forward(int speedInMPH);
     void backward(int speedInMPH);
     void turnLeft(int degree);
     void turnRight(int degree);
     void stop();
     void up();
     void down();
     void setFlashingLightOn();
     void setFlashingLightOff();
     void setSteeringPin();
     void removeSteeringPin();
     void notifyGroundOperations(PushBackVehicleReceipt pushBackVehicleReceipt);

}
