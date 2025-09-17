import java.util.*;

public class Hand {
    private final List<Card> cards = new ArrayList<>();

    public void addCard(Card c) {
        cards.add(c);
    }

    public int getTotal() {
        int sum = 0;
        for (Card c : cards) sum += c.getValue();
        return sum;
    }

    public String toString() {
        return cards.toString() + " (total = " + getTotal() + ")";
    }
}
