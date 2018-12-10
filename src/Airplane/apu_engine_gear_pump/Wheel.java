package Airplane.apu_engine_gear_pump;

public class Wheel {
    String id;
    long dateOfManufacture;
    Brake brake;

    public Wheel(String id, long dateOfManufacture, Brake brake) {
        this.id = id;
        this.dateOfManufacture = dateOfManufacture;
        this.brake = brake;
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

    public Brake getBrake() {
        return brake;
    }

    public void setBrake(Brake brake) {
        this.brake = brake;
    }
}
