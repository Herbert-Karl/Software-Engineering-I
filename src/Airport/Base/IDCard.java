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

    ///
    /// Getter:
    ///


    public Employee getEmployee() {
        return employee;
    }

    public String getUuid() {
        return uuid;
    }

    public String getPassword() {
        return password;
    }

    ///
    /// Setter:
    ///
    public void setEmployee(Employee employee){
       this.employee = employee;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
