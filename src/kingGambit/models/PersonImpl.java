package objectCommunicationsAndEvents.kingGambit.models;

import objectCommunicationsAndEvents.kingGambit.interfaces.Observable;
import objectCommunicationsAndEvents.kingGambit.interfaces.Observer;
import objectCommunicationsAndEvents.kingGambit.interfaces.Person;

public abstract class PersonImpl implements Person, Observer{

    private String name;

    private int numberOfLives;

    protected PersonImpl(String name){
        this.setName(name);
        this.setNumberOfLives(0);
    }

    protected PersonImpl(String name, int numberOfLives) {
        this.setName(name);
        this.setNumberOfLives(numberOfLives);
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    private void getKilled(Observable observable){
        this.setNumberOfLives(this.numberOfLives - 1);
        if (this.numberOfLives < 1){
            observable.removeCharacter(this);
        }
    }

    @Override
    public void update(String[] message, Observable observable) {
        if (message[0].equalsIgnoreCase("attack")){
            this.respondToAttack();
        } else {
            if (this.getName().equalsIgnoreCase(message[1])){
                this.getKilled(observable);
            }
        }
    }

    protected abstract void respondToAttack();
}
