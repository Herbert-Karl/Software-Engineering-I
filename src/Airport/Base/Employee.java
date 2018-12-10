package Airport.Base;

import java.util.UUID;

public class Employee {
    private String uuid;
    private int id;
    private String name;
    private Gender gender;
    private IDCard idCard;


    public Employee(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.idCard = null;
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }

    public IDCard getIdCard() {
        return idCard;
    }

}