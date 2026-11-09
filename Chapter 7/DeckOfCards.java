import java.util.Random;

public class DeckOfCards {
    private Card[] deck = new Card[52];
    private int currentCard = 0;

    private String[] faces = {
        "Ace", "Deuce", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten",
        "Jack", "Queen", "King"
    };

    private String[] suits = {
        "Hearts", "Diamonds", "Clubs", "Spades"
    };

    public DeckOfCards() {
        int count = 0;

        for (String suit : suits) {
            for (String face : faces) {
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

    public boolean hasPair(Card[] hand) {
        return countPairs(hand) >= 1;
    }

    public boolean hasTwoPairs(Card[] hand) {
        return countPairs(hand) == 2;
    }

    public boolean hasThreeOfAKind(Card[] hand) {
        return hasCount(hand, 3);
    }

    public boolean hasFourOfAKind(Card[] hand) {
        return hasCount(hand, 4);
    }

    public boolean hasFlush(Card[] hand) {
        for (int i = 1; i < hand.length; i++) {
            if (!hand[i].getSuit().equals(hand[0].getSuit())) {
                return false;
            }
        }

        return true;
    }

    private int getValue(Card card) {
        String face = card.getFace();

        if (face.equals("Ace")) return 14;
        if (face.equals("King")) return 13;
        if (face.equals("Queen")) return 12;
        if (face.equals("Jack")) return 11;

        if (face.equals("Deuce")) return 2;

        String[] names = {
            "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten"
        };

        for (int i = 0; i < names.length; i++) {
            if (face.equals(names[i])) return i + 3;
        }

        return 0;
    }

    public boolean hasStraight(Card[] hand) {
        int[] values = new int[5];

        for (int i = 0; i < 5; i++) {
            values[i] = getValue(hand[i]);
        }

        java.util.Arrays.sort(values);

        boolean normal = true;

        for (int i = 1; i < 5; i++) {
            if (values[i] != values[i - 1] + 1) {
                normal = false;
                break;
            }
        }

        boolean aceLow = values[0] == 2 &&
                         values[1] == 3 &&
                         values[2] == 4 &&
                         values[3] == 5 &&
                         values[4] == 14;

        return normal || aceLow;
    }

    public boolean hasFullHouse(Card[] hand) {
        return hasCount(hand, 3) && hasCount(hand, 2);
    }

    private boolean hasCount(Card[] hand, int count) {
        int[] frequencies = new int[15];

        for (Card card : hand) {
            frequencies[getValue(card)]++;
        }

        for (int frequency : frequencies) {
            if (frequency == count) {
                return true;
            }
        }

        return false;
    }

    private int countPairs(Card[] hand) {
        int[] frequencies = new int[15];

        for (Card card : hand) {
            frequencies[getValue(card)]++;
        }

        int pairs = 0;

        for (int frequency : frequencies) {
            if (frequency == 2) {
                pairs++;
            }
        }

        return pairs;
    }
}