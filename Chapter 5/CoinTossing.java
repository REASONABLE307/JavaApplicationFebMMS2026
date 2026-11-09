import java.util.Scanner;
import java.util.Random;

public class CoinTossing {

    enum Coin {
        HEADS, TAILS
    }

    static Random random = new Random();

    public static Coin flip() {
        if (random.nextInt(2) == 0) {
            return Coin.HEADS;
        } else {
            return Coin.TAILS;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heads = 0;
        int tails = 0;

        int choice;

        do {
            System.out.println("\n1. Toss Coin");
            System.out.println("2. Display Results");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    Coin result = flip();

                    System.out.println("Result: " + result);

                    if (result == Coin.HEADS) {
                        heads++;
                    } else {
                        tails++;
                    }
                    break;

                case 2:
                    System.out.println("Heads: " + heads);
                    System.out.println("Tails: " + tails);
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 3);
    }
}