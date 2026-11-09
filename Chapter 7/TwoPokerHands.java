public class TwoPokerHands {

    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        Card[] player1 = new Card[5];
        Card[] player2 = new Card[5];

        System.out.println("PLAYER 1");

        for (int i = 0; i < 5; i++) {
            player1[i] = deck.dealCard();
            System.out.println(player1[i]);
        }

        System.out.println("\nPLAYER 2");

        for (int i = 0; i < 5; i++) {
            player2[i] = deck.dealCard();
            System.out.println(player2[i]);
        }

        System.out.println("\nPlayer 1 Hand Evaluation:");
        evaluate(deck, player1);

        System.out.println("\nPlayer 2 Hand Evaluation:");
        evaluate(deck, player2);
    }

    public static void evaluate(DeckOfCards deck, Card[] hand) {

        if (deck.hasFullHouse(hand))
            System.out.println("Full House");
        else if (deck.hasFourOfAKind(hand))
            System.out.println("Four of a Kind");
        else if (deck.hasFlush(hand))
            System.out.println("Flush");
        else if (deck.hasStraight(hand))
            System.out.println("Straight");
        else if (deck.hasThreeOfAKind(hand))
            System.out.println("Three of a Kind");
        else if (deck.hasTwoPairs(hand))
            System.out.println("Two Pairs");
        else if (deck.hasPair(hand))
            System.out.println("One Pair");
        else
            System.out.println("High Card");
    }
}