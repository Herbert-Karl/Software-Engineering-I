package Airplane.seat;

import Airplane.airplanePart.*;

public class CrewSeat implements ICrewSeat {
    private IAirplanePart crewSeat;
    private IReadingLight readingLight;
    
    public CrewSeat() {
        crewSeat = new AirplanePart("CrewSeat");
        readingLight = new ReadingLight();
    }

    @Override
    //the version contains id and type
    public String version() {
        return crewSeat.version();
    }

    @Override
    // turns the reading light off
    public void readingLightOff() {
        readingLight.off();
    }

    @Override
    // turns the reading light on
    public void readingLightOn() {
        readingLight.on();
    }
}
