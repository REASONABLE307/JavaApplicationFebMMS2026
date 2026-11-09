import java.util.Scanner;
import java.security.SecureRandom;

public class DifficultyLevels {

    static SecureRandom random = new SecureRandom();

    public static int generateNumber(int level) {
        int maximum = (int) Math.pow(10, level);

        return 1 + random.nextInt(maximum - 1);
    }

    public static int generateQuestion(int level) {
        int number1 = generateNumber(level);
        int number2 = generateNumber(level);

        System.out.println("\nHow much is " +
                number1 + " times " + number2 + "?");

        return number1 * number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter difficulty level: ");
        int level = input.nextInt();

        if (level < 1 || level > 9) {
            System.out.println("Enter a level between 1 and 9.");
            return;
        }

        int answer = generateQuestion(level);

        while (true) {

            System.out.print("Your answer: ");
            int response = input.nextInt();

            if (response == answer) {
                System.out.println("Very good!");

                answer = generateQuestion(level);

            } else {
                System.out.println("No. Please try again.");
            }
        }
    }
}