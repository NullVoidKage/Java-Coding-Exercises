package OOP.employee;

public class Manager extends Employee{
    public Manager(String employeeName, String department,
                   long employeeId, String position, long salary) {
        super(employeeName, department, employeeId, position, salary);
    }

    /**
     *
     */
    @Override
    protected void work() {
        System.out.println("Employee");
    }
}
