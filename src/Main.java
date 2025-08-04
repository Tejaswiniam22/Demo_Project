//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee myemployee = new Employee();
        myemployee.setEmployeeName("Teju");
        myemployee.setEmployeeDesignation("Manager");
        myemployee.getEmployeeDesignation();
        myemployee.displayEmployeeDetails();

        switchexecute switching = new switchexecute();
        switching.switchmethod();


        NumberLoop number = new NumberLoop();
        number.printNumberOfTimes(5);
        }
    }
