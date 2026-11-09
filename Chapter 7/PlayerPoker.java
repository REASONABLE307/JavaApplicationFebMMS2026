import java.util.Scanner;

public class PlayerPoker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int playerWins = 0;
        int computerWins = 0;

        for (int game = 1; game <= 20; game++) {

            DeckOfCards deck = new DeckOfCards();
            deck.shuffle();

            Card[] player = new Card[5];
            Card[] dealer = new Card[5];

            for (int i = 0; i < 5; i++) {
                player[i] = deck.dealCard();
                dealer[i] = deck.dealCard();
            }

            System.out.println("\nYour Hand:");

            for (int i = 0; i < 5; i++) {
                System.out.println(i + ": " + player[i]);
            }

            System.out.print("Enter card positions to replace (e.g. 0 2): ");
            String positions = input.nextLine();

            if (!positions.trim().isEmpty()) {
                String[] selected = positions.trim().split("\\s+");

                for (String value : selected) {
                    int position = Integer.parseInt(value);

                    if (position >= 0 && position < 5) {
                        player[position] = deck.dealCard();
                    }
                }
            }

            System.out.println("\nYour Final Hand:");

            for (Card card : player) {
                System.out.println(card);
            }

            System.out.println("\nComputer's Hand:");

            for (Card card : dealer) {
                System.out.println(card);
            }

            System.out.println("\nGame " + game + " completed.");

            System.out.println("Player and computer hands have been dealt.");
        }

        System.out.println("\nGames Completed: 20");
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
    }
}