package Airport.Customs;

import Airport.Base.BoardingPass;
import java.util.UUID;
import java.util.ArrayList;

public class CustomsReceipt {
    String uiid;
    int numberOfPassportVerified;

    public String getUiid() {
        return uiid;
    }

    public void setUiid(String uiid) {
        this.uiid = uiid;
    }

    public int getNumberOfPassportVerified() {
        return numberOfPassportVerified;
    }

    public void setNumberOfPassportVerified(int numberOfPassportVerified) {
        this.numberOfPassportVerified = numberOfPassportVerified;
    }

    public int getNumberOfBoardingPassVerified() {
        return numberOfBoardingPassVerified;
    }

    public void setNumberOfBoardingPassVerified(int numberOfBoardingPassVerified) {
        this.numberOfBoardingPassVerified = numberOfBoardingPassVerified;
    }

    public int getNumberOfBaggageScanned() {
        return numberOfBaggageScanned;
    }

    public void setNumberOfBaggageScanned(int numberOfBaggageScanned) {
        this.numberOfBaggageScanned = numberOfBaggageScanned;
    }

    public int getNumberOfBaggageExcessAmountMoney() {
        return numberOfBaggageExcessAmountMoney;
    }

    public void setNumberOfBaggageExcessAmountMoney(int numberOfBaggageExcessAmountMoney) {
        this.numberOfBaggageExcessAmountMoney = numberOfBaggageExcessAmountMoney;
    }

    public int getNumberOfKeepSafeBaggage() {
        return numberOfKeepSafeBaggage;
    }

    public void setNumberOfKeepSafeBaggage(int numberOfKeepSafeBaggage) {
        this.numberOfKeepSafeBaggage = numberOfKeepSafeBaggage;
    }

    public int getNumberOfKeepSafeItem() {
        return numberOfKeepSafeItem;
    }

    public void setNumberOfKeepSafeItem(int numberOfKeepSafeItem) {
        this.numberOfKeepSafeItem = numberOfKeepSafeItem;
    }

    public CustomsReceipt(int numberOfPassportVerified, int numberOfBoardingPassVerified, int numberOfBaggageScanned, int numberOfBaggageExcessAmountMoney, int numberOfKeepSafeBaggage, int numberOfKeepSafeItem) {

        this.uiid = java.util.UUID.randomUUID().toString();
        this.numberOfPassportVerified = numberOfPassportVerified;
        this.numberOfBoardingPassVerified = numberOfBoardingPassVerified;
        this.numberOfBaggageScanned = numberOfBaggageScanned;
        this.numberOfBaggageExcessAmountMoney = numberOfBaggageExcessAmountMoney;
        this.numberOfKeepSafeBaggage = numberOfKeepSafeBaggage;
        this.numberOfKeepSafeItem = numberOfKeepSafeItem;
    }

    int numberOfBoardingPassVerified;
    int numberOfBaggageScanned;
    int numberOfBaggageExcessAmountMoney;
    int numberOfKeepSafeBaggage;
    int numberOfKeepSafeItem;
}
