package Airport.pushback_vehicle;

import Airplane.Aircraft.Airplane;
import Airport.airport.Airport;
import Airport.airport.TaxiWay;

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
    private Airport airport;

    public PushBackVehicle(String uuid, String id, String type, boolean isAirplaneConnected, int speedInMPH, int degree, boolean isUp, boolean isFlashingLightOn, boolean isSteeringPinSet, Airport airport) {
        this.uuid = uuid;
        this.id = id;
        this.type = type;
        this.isAirplaneConnected = isAirplaneConnected;
        this.speedInMPH = speedInMPH;
        this.degree = degree;
        this.isUp = isUp;
        this.isFlashingLightOn = isFlashingLightOn;
        this.isSteeringPinSet = isSteeringPinSet;
        this.airport = airport;
    }

    @Override
    public void connect(Airplane airplane) {

    }

    @Override
    public void disconnectAirplane() {

    }

    @Override
    public void execute(Airplane airplane, TaxiWay taxiWay) {

    }

    @Override
    public void forward(int speedInMPH) {

    }

    @Override
    public void backward(int speedInMPH) {

    }

    @Override
    public void turnLeft(int degree) {

    }

    @Override
    public void turnRight(int degree) {

    }

    @Override
    public void stop() {

    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }

    @Override
    public void setFlashingLightOn() {

    }

    @Override
    public void setFlashingLightOff() {

    }

    @Override
    public void setSteeringPin() {

    }

    @Override
    public void removeSteeringPin() {

    }

    @Override
    public void notifyGroundOperations(PushBackVehicleReceipt pushBackVehicleReceipt) {

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAirplaneConnected() {
        return isAirplaneConnected;
    }

    public void setAirplaneConnected(boolean airplaneConnected) {
        isAirplaneConnected = airplaneConnected;
    }

    public int getSpeedInMPH() {
        return speedInMPH;
    }

    public void setSpeedInMPH(int speedInMPH) {
        this.speedInMPH = speedInMPH;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public boolean isUp() {
        return isUp;
    }

    public void setUp(boolean up) {
        isUp = up;
    }

    public boolean isFlashingLightOn() {
        return isFlashingLightOn;
    }

    public void setFlashingLightOn(boolean flashingLightOn) {
        isFlashingLightOn = flashingLightOn;
    }

    public boolean isSteeringPinSet() {
        return isSteeringPinSet;
    }

    public void setSteeringPinSet(boolean steeringPinSet) {
        isSteeringPinSet = steeringPinSet;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}
