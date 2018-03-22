package objectCommunicationsAndEvents.workForce;

import objectCommunicationsAndEvents.workForce.interfaces.Job;
import objectCommunicationsAndEvents.workForce.interfaces.Observable;

import java.util.ArrayList;
import java.util.List;

public class Server implements Observable{

    private List<Job> jobs;

    public Server() {
        this.setJobs(new ArrayList<>());
    }

    private void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @Override
    public void passWeek() {
        List<Job> clonedJobs = new ArrayList<>(this.jobs);

        for (Job job : clonedJobs) {
            job.update(this);
        }
    }

    @Override
    public void addJob(Job job) {
        if (!this.jobs.contains(job)){
            this.jobs.add(job);
        }
    }

    @Override
    public void removeJob(Job job) {
        if (this.jobs.contains(job)){
            this.jobs.remove(job);
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        for (Job job : jobs) {
            output.append(String.format("Job: %s Hours Remaining: %d", job.getName(), job.getHoursOfWorkRequired()));
            output.append(System.lineSeparator());
        }

        return output.toString();
    }
}
