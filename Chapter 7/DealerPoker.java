import java.util.*;

public class DealerPoker {

    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        Card[] dealer = new Card[5];

        for (int i = 0; i < 5; i++) {
            dealer[i] = deck.dealCard();
        }

        int replacements = 3;

        if (deck.hasFourOfAKind(dealer) ||
            deck.hasFullHouse(dealer) ||
            deck.hasFlush(dealer) ||
            deck.hasStraight(dealer)) {
            replacements = 0;
        } else if (deck.hasThreeOfAKind(dealer)) {
            replacements = 2;
        } else if (deck.hasTwoPairs(dealer)) {
            replacements = 1;
        } else if (deck.hasPair(dealer)) {
            replacements = 3;
        }

        System.out.println("Dealer's initial hand: ");

        for (Card card : dealer) {
            System.out.println(card);
        }

        for (int i = 0; i < replacements; i++) {
            dealer[i] = deck.dealCard();
        }

        System.out.println("\nDealer's final hand:");

        for (Card card : dealer) {
            System.out.println(card);
        }

        System.out.println("\nFinal Evaluation:");

        if (deck.hasFullHouse(dealer))
            System.out.println("Full House");
        else if (deck.hasFourOfAKind(dealer))
            System.out.println("Four of a Kind");
        else if (deck.hasFlush(dealer))
            System.out.println("Flush");
        else if (deck.hasStraight(dealer))
            System.out.println("Straight");
        else if (deck.hasThreeOfAKind(dealer))
            System.out.println("Three of a Kind");
        else if (deck.hasTwoPairs(dealer))
            System.out.println("Two Pairs");
        else if (deck.hasPair(dealer))
            System.out.println("One Pair");
        else
            System.out.println("High Card");
    }
}