import java.util.Scanner;
import java.util.Random;

public class CrapsGame {

    static Random random = new Random();

    public static int rollDice() {
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);

        System.out.println("You rolled " + die1 +
                " + " + die2 + " = " + (die1 + die2));

        return die1 + die2;
    }

    public static void chatter() {
        String[] messages = {
            "Oh, you're going for broke, huh?",
            "Aw c'mon, take a chance!",
            "You're up big. Now's the time to cash in your chips!",
            "Good luck! Let's see what happens."
        };

        System.out.println(
                messages[random.nextInt(messages.length)]);
    }

    public static boolean playGame() {
        int sum = rollDice();

        if (sum == 7 || sum == 11) {
            System.out.println("You win!");
            return true;
        }

        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose!");
            return false;
        }

        int point = sum;

        System.out.println("Point is " + point);

        while (true) {
            chatter();

            sum = rollDice();

            if (sum == point) {
                System.out.println("You win!");
                return true;
            }

            if (sum == 7) {
                System.out.println("You lose!");
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bankBalance = 1000;

        while (bankBalance > 0) {

            System.out.println("\nBank balance: $" + bankBalance);

            int wager;

            do {
                System.out.print("Enter your wager: ");
                wager = input.nextInt();

                if (wager <= 0 || wager > bankBalance) {
                    System.out.println(
                            "Invalid wager. Enter a valid amount.");
                }

            } while (wager <= 0 || wager > bankBalance);

            boolean won = playGame();

            if (won) {
                bankBalance += wager;
            } else {
                bankBalance -= wager;
            }

            System.out.println("New bank balance: $" + bankBalance);

            if (bankBalance == 0) {
                System.out.println("Sorry. You busted!");
            } else {
                System.out.print("Play another game? (1=yes, 0=no): ");
                int choice = input.nextInt();

                if (choice != 1) {
                    break;
                }
            }
        }
    }
}