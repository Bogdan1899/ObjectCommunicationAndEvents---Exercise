package objectCommunicationsAndEvents.kingGambit.models;

public class King extends PersonImpl{

    public King(String name) {
        super(name);
    }

    protected void respondToAttack() {
        System.out.printf("King %s is under attack!\n", this.getName());
    }
}
