public class TestDeck {

    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();

        deck.shuffle();

        for (int i = 0; i < 5; i++) {
            System.out.println(deck.dealCard());
        }
    }
}