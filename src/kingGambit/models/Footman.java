package objectCommunicationsAndEvents.kingGambit.models;

public class Footman extends PersonImpl{

    private static final int NUMBER_OF_LIVES = 2;

    public Footman(String name) {
        super(name, NUMBER_OF_LIVES);
    }

    protected void respondToAttack() {
        System.out.printf("Footman %s is panicking!\n", this.getName());
    }
}
