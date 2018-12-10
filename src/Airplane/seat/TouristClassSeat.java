package Airplane.seat;

public class TouristClassSeat implements ITouristClassSeat {
    String manufacturer;
    String type;
    String id;
    Passenger passenger;
    int level;
    INonSmokingSign nonSmokingSign;
    ISeatBeltSign seatBeltSign;

    public TouristClassSeat(String manufacturer, String type, String id, Passenger passenger, int level, INonSmokingSign nonSmokingSign, ISeatBeltSign seatBeltSign) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.passenger = passenger;
        this.level = level;
        this.nonSmokingSign = nonSmokingSign;
        this.seatBeltSign = seatBeltSign;
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

    @Override
    public String version() {
        return null;
    }

    @Override
    public void assign(Passenger passenger) {

    }

    @Override
    public void upRight() {

    }

    @Override
    public void level1() {

    }
}
