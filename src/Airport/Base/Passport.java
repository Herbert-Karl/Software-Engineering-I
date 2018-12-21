package Airport.Base;

import java.util.UUID;

public class Passport{
    private String uuid;
    private String id;
    private String picture;
    private Passenger passenger;

    public Passport(String id, String picture, Passenger passenger){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        this.id = id;
        this.picture = picture;
        this.passenger = passenger;
    }

    ///
    /// Getter
    ///


    public String getId() {
        return id;
    }

    public Passenger getPassenger() {
         return passenger;
    }

    public String getPicture() {
        return picture;
    }

    public String getUuid() {
        return uuid;
    }

    ///
    /// Setter
    ///


    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}