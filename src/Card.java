public class Card {
    private final String suit;   // colour (♥♠♦♣)
    private final String rank;   // value (2..10, J, Q, K, A)
    private final int value;     // numeric value (2..11)

    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public int getValue() { return value; }
    public String toString() { return rank + " de " + suit; }
}
