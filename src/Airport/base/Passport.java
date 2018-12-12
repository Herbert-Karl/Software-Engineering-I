package Airport.base;

public class Passport {
    private String uuid;
    private String id;
    private String image;
    private Passenger passenger;

    public Passport(String uuid, String id, String image, Passenger passenger) {
        this.uuid = uuid;
        this.id = id;
        this.image = image;
        this.passenger = passenger;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
