package objectCommunicationsAndEvents.workForce.interfaces;

import java.util.List;

public interface Observable {

    void passWeek();

    void addJob(Job job);

    void removeJob(Job job);
}
