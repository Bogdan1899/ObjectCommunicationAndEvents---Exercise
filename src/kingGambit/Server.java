package objectCommunicationsAndEvents.kingGambit;

import objectCommunicationsAndEvents.kingGambit.interfaces.Observable;
import objectCommunicationsAndEvents.kingGambit.models.PersonImpl;

import java.util.LinkedList;
import java.util.List;

public class Server implements Observable{

    private List<PersonImpl> characters;

    public Server() {
        this.setCharacters(new LinkedList<>());
    }

    private void setCharacters(List<PersonImpl> characters) {
        this.characters = characters;
    }

    public void addCharacter(PersonImpl character){
        if (!this.characters.contains(character)){
            this.characters.add(character);
        }
    }

    public void removeCharacter(PersonImpl character){
        if (this.characters.contains(character)){
            this.characters.remove(character);
        }
    }

    public void processCommand(String[] command){
        for (PersonImpl character : characters) {
            character.update(command, this);
        }
    }
}
