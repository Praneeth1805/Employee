
package employee;

public class Employee {
    
    public static void main(String[] args) {
        EmployeeDetails employeeDetails = new EmployeeDetails("Susan Meyers",47899,"Accounting","Vice President");
        System.out.println(employeeDetails);
        EmployeeDetails employeeDetails1 = new EmployeeDetails("Mark Jones",39119,"IT","Programmer");
        System.out.println(employeeDetails1);
        EmployeeDetails employeeDetails2 = new EmployeeDetails("Joy Rogers",81774,"Manufacturing","Engineer");
        System.out.println(employeeDetails2);
    }
    
}
