package Airplane.seat;

import Airport.base.Passenger;

public class BusinessClassSeat implements IBusinessClassSeat {
    String manufacturer;
    String type;
    String id;
    Passenger passenger;
    int level;
    INonSmokingSign nonSmokingSign;
    ISeatBeltSign seatBeltSign;
    IReadingLight readingLight;

    public BusinessClassSeat(String manufacturer, String type, String id, Passenger passenger, int level, INonSmokingSign nonSmokingSign, ISeatBeltSign seatBeltSign, IReadingLight readingLight) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.passenger = passenger;
        this.level = level;
        this.nonSmokingSign = nonSmokingSign;
        this.seatBeltSign = seatBeltSign;
        this.readingLight = readingLight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public INonSmokingSign getNonSmokingSign() {
        return nonSmokingSign;
    }

    public void setNonSmokingSign(INonSmokingSign nonSmokingSign) {
        this.nonSmokingSign = nonSmokingSign;
    }

    public ISeatBeltSign getSeatBeltSign() {
        return seatBeltSign;
    }

    public void setSeatBeltSign(ISeatBeltSign seatBeltSign) {
        this.seatBeltSign = seatBeltSign;
    }

    public IReadingLight getReadingLight() {
        return readingLight;
    }

    public void setReadingLight(IReadingLight readingLight) {
        this.readingLight = readingLight;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void assign(Passenger passenger) {

    }

    @Override
    public void readingLightOn() {

    }

    @Override
    public void readingLightOff() {

    }

    @Override
    public void upRight() {

    }

    @Override
    public void level1() {

    }

    @Override
    public void level2() {

    }
}
