package Airport.Airport;

public class AirportFuelTank{
    private int amount;

    public AirportFuelTank(){
        amount = 1000000;
    }

    public int takeOut(int a){
        amount = amount - a;
        return amount;
    }

    public int refill(){
        amount = 1000000;
        return amount;
    }

    public int refill(int a){
        amount = amount + a;
        return amount;
    }

    public int getAmount() {
        return amount;
    }
}