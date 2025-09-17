import java.util.*;

public class Deck {
    private final List<Card> cards = new ArrayList<>();
    private final Random rand = new Random();

    public Deck() {
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        int[] values   = { 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 ,10 ,10 ,10 ,11};

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new Card(suit, ranks[i], values[i]));
            }
        }
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(0);
    }
}
