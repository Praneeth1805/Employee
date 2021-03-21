
package employee;

public class EmployeeDetails {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public EmployeeDetails(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public EmployeeDetails(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }

    public EmployeeDetails() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" + "name=" + name + ", idNumber=" + idNumber + ", department=" + department + ", position=" + position + '}';
    } 
}
