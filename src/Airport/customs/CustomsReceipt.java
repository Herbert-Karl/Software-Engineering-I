package Airport.customs;

public class CustomsReceipt {
    private String uuid;
    private int numberOfPassportVerified;
    private int numberOFBoardingPassVerified;
    private int numberOfBaggageScanned;
    private int numberOfBaggageExcessAmountMoney;
    private int numberOfKeepSafeBaggage;
    private int numberOfKeepSafeItem;

    public CustomsReceipt(String uuid, int numberOfPassportVerified, int numberOFBoardingPassVerified, int numberOfBaggageScanned, int numberOfBaggageExcessAmountMoney, int numberOfKeepSafeBaggage, int numberOfKeepSafeItem) {
        this.uuid = uuid;
        this.numberOfPassportVerified = numberOfPassportVerified;
        this.numberOFBoardingPassVerified = numberOFBoardingPassVerified;
        this.numberOfBaggageScanned = numberOfBaggageScanned;
        this.numberOfBaggageExcessAmountMoney = numberOfBaggageExcessAmountMoney;
        this.numberOfKeepSafeBaggage = numberOfKeepSafeBaggage;
        this.numberOfKeepSafeItem = numberOfKeepSafeItem;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getNumberOfPassportVerified() {
        return numberOfPassportVerified;
    }

    public void setNumberOfPassportVerified(int numberOfPassportVerified) {
        this.numberOfPassportVerified = numberOfPassportVerified;
    }

    public int getNumberOFBoardingPassVerified() {
        return numberOFBoardingPassVerified;
    }

    public void setNumberOFBoardingPassVerified(int numberOFBoardingPassVerified) {
        this.numberOFBoardingPassVerified = numberOFBoardingPassVerified;
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
}
