package objectCommunicationsAndEvents.workForce.models.jobs;

import objectCommunicationsAndEvents.workForce.interfaces.Employee;
import objectCommunicationsAndEvents.workForce.interfaces.Job;
import objectCommunicationsAndEvents.workForce.interfaces.Observable;

public class JobImpl implements Job{

    private String name;

    private Employee employee;

    private int hoursOfWorkRequired;

    public JobImpl(String name, Employee employee, int hoursOfWorkRequired) {
        this.setName(name);
        this.setEmployee(employee);
        this.setHoursOfWorkRequired(hoursOfWorkRequired);
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public int getHoursOfWorkRequired() {
        return this.hoursOfWorkRequired;
    }

    private void setHoursOfWorkRequired(int hoursOfWorkRequired) {
        this.hoursOfWorkRequired = hoursOfWorkRequired;
    }

    @Override
    public void update(Observable observable) {
        this.setHoursOfWorkRequired(this.getHoursOfWorkRequired() - this.employee.getWorkHoursPerWeek());
        if (this.getHoursOfWorkRequired() <= 0){
            System.out.printf("Job %s done!\n", this.getName());
            observable.removeJob(this);
        }
    }
}
