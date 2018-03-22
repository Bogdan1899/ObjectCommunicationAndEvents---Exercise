package objectCommunicationsAndEvents.workForce.models.employees;

public class StandartEmployee extends EmployeeImpl {

    private static final int WORK_HOURS_PER_WEEK = 40;

    public StandartEmployee(String name) {
        super(name, WORK_HOURS_PER_WEEK);
    }
}
