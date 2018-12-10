package Airport.Base;

import java.util.UUID;

public class IDCard{
    private String uuid;
    private Employee employee;
    private String password;

    public IDCard(){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        this.employee = null;
        this.password = "SHA-265";
    }

    public void setEmployee(Employee employee){
       this.employee = employee;
    }

    public String getPassword() {
        return password;
    }
}