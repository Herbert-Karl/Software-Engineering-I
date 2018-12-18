package Airport.Base;

public class AirportFuelTank{
    private int id;
    private int amount;

    public AirportFuelTank(int id, int amount){
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }
}