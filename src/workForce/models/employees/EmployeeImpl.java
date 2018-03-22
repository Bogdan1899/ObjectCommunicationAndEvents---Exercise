package objectCommunicationsAndEvents.workForce.models.employees;

import objectCommunicationsAndEvents.workForce.interfaces.Employee;

public abstract class EmployeeImpl implements Employee {

    private String name;

    private int workHoursPerWeek;

    protected EmployeeImpl(String name, int workHoursPerWeek) {
        this.setName(name);
        this.setWorkHoursPerWeek(workHoursPerWeek);
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWorkHoursPerWeek() {
        return this.workHoursPerWeek;
    }

    private void setWorkHoursPerWeek(int workHoursPerWeek) {
        this.workHoursPerWeek = workHoursPerWeek;
    }
}
