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

    ///
    /// Getter:
    ///

    public String getUuid(){
        return uuid;
    }

    public int getId() {
        return id;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public IDCard getIdCard() {
        return idCard;
    }

    ///
    /// Setter:
    ///

    public void setIdCard(IDCard idCard){
       this.idCard = idCard;
    }

    public void setName(String name) {
        this.name = name;
    }
}
