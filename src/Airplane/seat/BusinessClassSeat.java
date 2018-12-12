package Airplane.seat;

import Airport.base.Passenger;

public class BusinessClassSeat implements IBusinessClassSeat {
    private IReadingLight readingLight;

    public BusinessClassSeat(IReadingLight readingLight) {
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

    public IReadingLight getReadingLight() {
        return readingLight;
    }

    public void setReadingLight(IReadingLight readingLight) {
        this.readingLight = readingLight;
    }
}
