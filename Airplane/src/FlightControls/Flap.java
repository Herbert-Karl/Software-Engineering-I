package FlightControls;

import FlightControls.Interfaces.IFlap;
import FlightControls.Enums.FlapType;

public class Flap extends FlightControl implements IFlap {
    private FlapType flapType;

    public Flap(String manufacturer, String type, String id, FlapType flapType) throws IllegalArgumentException {
        super(manufacturer, type, id);
        this.degree = 0;
        this.flapType = flapType;
        if (flapType != FlapType.A350APP
                && flapType != FlapType.A350TOInboard
                && flapType != FlapType.A350TOOutboard
                && flapType != FlapType.A380) {
            throw new IllegalArgumentException("Type of airplane not supported");
        }
    }

    public int levelOne() throws IllegalArgumentException {
        switch (flapType) {
            case A350APP:
                degree = 9;
                break;
            case A350TOInboard:
                degree = 6;
                break;
            case A350TOOutboard:
                degree = 12;
                break;
            case A380:
                degree = 8;
                break;
            default:
                throw new IllegalArgumentException("Type of airplane not supported");
        }
        return degree;
    }

    public int levelTwo() throws IllegalArgumentException {
        switch (flapType) {
            case A350APP:
            case A350TOInboard:
            case A350TOOutboard:
                degree = 20;
                break;
            case A380:
                degree = 17;
                break;
            default:
                throw new IllegalArgumentException("Type of airplane not supported");
        }
        return degree;
    }

    public int levelThree() throws IllegalArgumentException {
        switch (flapType) {
            case A350APP:
            case A350TOInboard:
            case A350TOOutboard:
            case A380:
                degree = 26;
                break;
            default:
                throw new IllegalArgumentException("Type of airplane not supported");
        }
        return degree;
    }
}
