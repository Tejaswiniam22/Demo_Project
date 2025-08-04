public class Employee {
    private String employeeName = "Tejaswini";
    private String employeeDesignation = "GET";
    private int employeeSalary = 100000;
    private String employeeDOB = "22-02-2003";
    private String employeeAddress = "Bangalore";

    public void setEmployeeName(String employeeName){
        this.employeeName =employeeName;
    }
    public String getEmployeeName(){
       return employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void displayEmployeeDetails()
    {
        System.out.println("Employee Name:" +getEmployeeName() + "\n" + "Employee Designation:" +getEmployeeDesignation() + "\n" + "Employee salary:" +employeeSalary + "\n" + "Employee DOB:" +employeeDOB + "\n" + "Employee Address:" +employeeAddress+ "\n" );
    }
}
