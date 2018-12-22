package Airport.Federal_Police;

import Airplane.Aircraft.Airplane;
import Airplane.Aircraft.Configuration;
import Airplane.Lights.Position;
import Airplane.Management.CheckPoint;
import Airport.Airport.Runway;
import Airport.Airport.RunwayCheckPointID;
import Airport.Airport.RunwayID;
import Airport.Airport.WindDirectionSensor;
import Airport.Base.AlarmType;
import Airport.Security_Check.AutomaticBoardingPassControl;
import Airport.Security_Check.AutomaticBoardingPassControlID;
import Airport.Security_Check.IDoor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FederalPoliceTest {
    private FederalPolice federalPolice;
    private Runway runway;
    private ArrayList<RunwayCheckPointID> checkPointIDS;
    private AutomaticBoardingPassControl automaticBoardingPassControl;
    private FederalPoliceCar federalPoliceCar;
    private FederalPoliceReceipt federalPoliceReceipt;

    @BeforeEach
    void setUp() {
        federalPolice = new FederalPolice();
        checkPointIDS = new ArrayList<>();
        runway = new Runway(RunwayID.R08L, Airport.Airport.Position.North,checkPointIDS,new WindDirectionSensor(),true,true,new Airplane(new Configuration(2,60,10,10,5)));
        automaticBoardingPassControl = new AutomaticBoardingPassControl(AutomaticBoardingPassControlID.ABC_02,federalPolice);
        federalPoliceCar = new FederalPoliceCar();
        federalPoliceReceipt = new FederalPoliceReceipt();
    }

    @Test
    void alarm() {
        federalPolice.alarm(runway,AlarmType.A);
    }

    @Test
    void alarm1() {
        federalPolice.alarm(automaticBoardingPassControl);
    }

    @Test
    void assignFederalPoliceOfficer() {
        federalPolice.assignFederalPoliceOfficer(federalPoliceCar);
    }

    @Test
    void receive() {

    }

    @Test
    void notifyGroundOperations() {
        federalPolice.notifyGroundOperations(federalPoliceReceipt);
    }
}