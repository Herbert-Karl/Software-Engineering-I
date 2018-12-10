package Airplane.seat;

public class FirstClassSeat extends Seat {

    private ReadingLight readingLight;

    public void readingLightOff() {
        readingLight.off();
    }

    public void readingLightOn() {
        readingLight.on();
    }

    @Override
    public void level(int lvl)
    {
        switch (lvl) {
            default: level = 0;
                break;
            case 0: level = 0;
                break;
            case 1: level = 1;
                break;
            case 2: level = 2;
                break;
            case 3: level = 3;
                break;
            case 4: level = 4;
                break;
        }
    }
}
