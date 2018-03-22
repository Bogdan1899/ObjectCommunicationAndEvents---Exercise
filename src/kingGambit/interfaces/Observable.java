package objectCommunicationsAndEvents.kingGambit.interfaces;

import objectCommunicationsAndEvents.kingGambit.models.PersonImpl;

public interface Observable {

    void addCharacter(PersonImpl character);

    void removeCharacter(PersonImpl character);

    void processCommand(String[] command);
}
