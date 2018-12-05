public class Passport{
    private String uuid;
    private String id;
    private String picture;
    private Passenger passenger;

    public Passport(String uuid, String id, String picture, Passenger passenger){
        this.uuid = uuid;
        this.id = id;
        this.picture = picture;
        this.passenger = passenger;
    }
}