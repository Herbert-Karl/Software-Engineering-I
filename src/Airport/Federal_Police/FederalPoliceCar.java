package Airport.Federal_Police;

import java.util.ArrayList;

public class FederalPoliceCar implements IFederalPoliceCar {
    private String uuid;
    private String id;
    private String type;
    private int speedInMPH;
    private ArrayList federalPoliceOfficerList = new ArrayList<FederalPoliceOfficer>();
    private boolean isFlashingLightOn;
    private int numberOfSeat;
    private String currentLocation;

    @Override
    public void forward(int speedInMPH) {

    }

    @Override
    public void backward(int speedInMPH) {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean setFlashLightOn() {

        isFlashingLightOn = true;
        return isFlashingLightOn;
    }

    @Override
    public boolean setFlashLightOff() {
        isFlashingLightOn=false;
        return isFlashingLightOn;
    }
}
