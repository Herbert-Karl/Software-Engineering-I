package Airport.fire_department;

import Airport.base.Gender;
import Airport.base.IDCard;

public class FireFighter {
    private String uuid;
    private String id;
    private String name;
    private Gender gender;
    private IDCard idCard;
    private IFireTruck fireTruck;

    public FireFighter(String uuid, String id, String name, Gender gender, IDCard idCard, IFireTruck fireTruck) {
        this.uuid = uuid;
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.idCard = idCard;
        this.fireTruck = fireTruck;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }

    public IFireTruck getFireTruck() {
        return fireTruck;
    }

    public void setFireTruck(IFireTruck fireTruck) {
        this.fireTruck = fireTruck;
    }
}
