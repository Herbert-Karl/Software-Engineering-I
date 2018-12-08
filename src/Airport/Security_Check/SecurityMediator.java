package Airport.Security_Check;

import java.util.ArrayList;
import java.util.List;

public class SecurityMediator {

    private List<IAutomaticBoardingPassControl> automaticBoardingPassControlList;
    private List<ISecurityCheck> securityCheckList;
    private List<IPassportControl> passportControlList;

    public SecurityMediator() {
        automaticBoardingPassControlList = new ArrayList<IAutomaticBoardingPassControl>();
        securityCheckList = new ArrayList<ISecurityCheck>();
        passportControlList = new ArrayList<IPassportControl>();
    }

    public void build() {

    }
    public void executeRequest() {

    }
}
