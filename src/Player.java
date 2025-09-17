public class Player {
    private final String name;
    private int balance;
    private int bet;
    private final Hand hand = new Hand();

    public Player(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public Hand getHand() { return hand; }
    public String getName() { return name; }
}
