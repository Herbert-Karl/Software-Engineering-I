package Airport.base;

public class IDCard {
    private String uuid;
    private Employee employee;
    private String password;

    public IDCard(String uuid, Employee employee, String password) {
        this.uuid = uuid;
        this.employee = employee;
        this.password = password;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
