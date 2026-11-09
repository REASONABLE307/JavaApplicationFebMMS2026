import java.util.Random;

public class DeckOfCards {

    private Card[] deck = new Card[52];

    private int currentCard = 0;

    private Face[] faces = Face.values();
    private Suit[] suits = Suit.values();

    public DeckOfCards() {

        int count = 0;

        for (Suit suit : suits) {
            for (Face face : faces) {
                deck[count++] = new Card(face, suit);
            }
        }
    }

    public void shuffle() {

        Random random = new Random();

        for (int i = deck.length - 1; i > 0; i--) {

            int j = random.nextInt(i + 1);

            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        currentCard = 0;
    }

    public Card dealCard() {

        if (currentCard < deck.length) {
            return deck[currentCard++];
        }

        return null;
    }
}