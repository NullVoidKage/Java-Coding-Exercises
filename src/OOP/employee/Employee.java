package OOP.employee;

public abstract class Employee {


    protected String employeeName;
    protected String department;
    protected long employeeId;
    protected String position;
    protected long salary;

    public Employee(String employeeName, String department,
                    long employeeId, String position, long salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.employeeId = employeeId;
        this.position = position;
        this.salary = salary;
    }

    protected abstract void work();

    @Override
    public String toString() {
        return super.toString();
    }
}
