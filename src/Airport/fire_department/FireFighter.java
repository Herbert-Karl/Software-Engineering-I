package Airport.fire_department;

import Airport.Base.Gender;
import Airport.Base.IDCard;

import java.util.UUID;

public class FireFighter
{
    private String uuid= UUID.randomUUID().toString();
    private String id;
    private String name;
    private Gender gender;
    private IDCard idCard;
    private FireTruck fireTruck;

    public FireFighter(
        final String id,
        final String name,
        final Gender gender,
        final IDCard idCard
       )
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.idCard = idCard;
    }

    public void setFireTruck(FireTruck fireTruck) {
        this.fireTruck = fireTruck;
    }
}
