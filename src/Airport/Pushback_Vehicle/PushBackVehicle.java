package Airport.Pushback_Vehicle;

import Airplane.Aircraft.Airplane;
import Airport.Airport.TaxiWay;
import Airport.Ground_Operations.GroundOperationsCenter;
import Airport.Pushback_Vehicle.IPushBackVehicle;
import Airport.Pushback_Vehicle.PushBackVehicleReceipt;

public class PushBackVehicle implements IPushBackVehicle {

    private String uuid;
    private String id;
    private String type;
    private boolean isAirplaneConnected;
    private int speedInMPH;
    private int degree;
    private boolean isUp;
    private boolean isFlashingLightOn;
    private boolean isSteeringPinSet;

    public PushBackVehicle(String uuid, String id, String type, boolean isAirplaneConnected, int speedInMPH, int degree, boolean isUp, boolean isFlashingLightOn, boolean isSteeringPinSet) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.isAirplaneConnected = isAirplaneConnected;
        this.speedInMPH = speedInMPH;
        this.degree = degree;
        this.isUp = isUp;
        this.isFlashingLightOn = isFlashingLightOn;
        this.isSteeringPinSet = isSteeringPinSet;
    }

    public void connect(Airplane airplane) {
        isAirplaneConnected = true;
    }

    public void disconnectAirplane() {
        isAirplaneConnected = false;
    }

    public void execute(Airplane airplane, TaxiWay taxiWay) {

    }

    public void forward(int speedInMPH){
        this.speedInMPH += speedInMPH;
    }

    public void backward(int speedInMPH) {
        this.speedInMPH -= speedInMPH;
    }

    public void turnLeft(int degree) {
        this.degree -= degree;
    }

    public void turnRight(int degree) {
        this.degree += degree;
    }

    public void stop() {
        speedInMPH = 0;
    }

    public void up() {
        isUp = true;
    }

    public void down() {
        isUp = false;
    }

    public void setFlashingLightOn() {
        isFlashingLightOn = true;
    }

    public void setFlashingLightOff() {
        isFlashingLightOn = false;
    }

    public void setSteeringPin() {
        isSteeringPinSet = true;
    }

    public void removeSteeringPin() {
        isSteeringPinSet = false;
    }

    public void notifyGroundOperations(PushBackVehicleReceipt pushBackVehicleReceipt) {
        GroundOperationsCenter.receive(pushBackVehicleReceipt);
    }




}
