package Airplane.apu_engine_gear_pump;

public class Brake {
    String id;
    long dateOfManufacture;
    int percentage;

    public Brake(String id, long dateOfManufacture, int percentage) {
        this.id = id;
        this.dateOfManufacture = dateOfManufacture;
        this.percentage = percentage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(long dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
