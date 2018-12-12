package Airport.security_check;

import java.util.ArrayList;

public class SecurityMediator {
    private ArrayList<IAutomaticBoardingPassControl> automaticBoardingPassControlArrayList;
    private ArrayList<ISecurityCheck> securityCheckArrayList;
    private ArrayList<IPassportControl> passportControlArrayList;

    public SecurityMediator(ArrayList<IAutomaticBoardingPassControl> automaticBoardingPassControlArrayList, ArrayList<ISecurityCheck> securityCheckArrayList, ArrayList<IPassportControl> passportControlArrayList) {
        this.automaticBoardingPassControlArrayList = automaticBoardingPassControlArrayList;
        this.securityCheckArrayList = securityCheckArrayList;
        this.passportControlArrayList = passportControlArrayList;
    }

    public void build() {

    }

    public void executeRequest() {

    }

    public ArrayList<IAutomaticBoardingPassControl> getAutomaticBoardingPassControlArrayList() {
        return automaticBoardingPassControlArrayList;
    }

    public void setAutomaticBoardingPassControlArrayList(ArrayList<IAutomaticBoardingPassControl> automaticBoardingPassControlArrayList) {
        this.automaticBoardingPassControlArrayList = automaticBoardingPassControlArrayList;
    }

    public ArrayList<ISecurityCheck> getSecurityCheckArrayList() {
        return securityCheckArrayList;
    }

    public void setSecurityCheckArrayList(ArrayList<ISecurityCheck> securityCheckArrayList) {
        this.securityCheckArrayList = securityCheckArrayList;
    }

    public ArrayList<IPassportControl> getPassportControlArrayList() {
        return passportControlArrayList;
    }

    public void setPassportControlArrayList(ArrayList<IPassportControl> passportControlArrayList) {
        this.passportControlArrayList = passportControlArrayList;
    }
}
