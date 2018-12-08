package Airport.Base;

public class IDCard{
    private String uuid;
    private Employee employee;
    private String password;

    public IDCard(String uuid){
        this.uuid = uuid;
        this.employee = null;
        this.password = "SHA-265";
    }

    public void setEmployee(Employee employee){
       this.employee = employee;
    }
}