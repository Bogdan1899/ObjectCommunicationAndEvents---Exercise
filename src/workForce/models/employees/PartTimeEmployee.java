package objectCommunicationsAndEvents.workForce.models.employees;

public class PartTimeEmployee extends EmployeeImpl {

    private static final int WORK_HOURS_PER_WEEK = 20;

    public PartTimeEmployee(String name) {
        super(name, WORK_HOURS_PER_WEEK);
    }
}
