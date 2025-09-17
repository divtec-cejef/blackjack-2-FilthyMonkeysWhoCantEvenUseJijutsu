public class Game {
    private final Deck deck = new Deck();
    private final Player player = new Player("Joueur", 100);
    private final Dealer dealer = new Dealer();

    public void start() {
        ConsoleIO.print("Bienvenue au Blackjack !");
        player.getHand().addCard(deck.draw());
        player.getHand().addCard(deck.draw());
        dealer.getHand().addCard(deck.draw());

        ConsoleIO.print(player.getName() + " : " + player.getHand());
        ConsoleIO.print("Dealer : " + dealer.getHand());
    }
}
