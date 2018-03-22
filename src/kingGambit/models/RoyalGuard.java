package objectCommunicationsAndEvents.kingGambit.models;

public class RoyalGuard extends PersonImpl{

    private static final int NUMBER_OF_LIVES = 3;

    public RoyalGuard(String name) {
        super(name, NUMBER_OF_LIVES);
    }

    protected void respondToAttack() {
        System.out.printf("Royal Guard %s is defending!\n", this.getName());
    }
}
