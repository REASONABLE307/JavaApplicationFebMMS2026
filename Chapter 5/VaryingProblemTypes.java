import java.util.Scanner;
import java.security.SecureRandom;

public class VaryingProblemTypes {

    static SecureRandom random = new SecureRandom();

    public static int generateNumber(int level) {
        int maximum = (int) Math.pow(10, level);

        return 1 + random.nextInt(maximum - 1);
    }

    public static int generateQuestion(int level, int type) {

        int operation = type;

        // Select a random operation if option 5 is chosen.
        if (type == 5) {
            operation = 1 + random.nextInt(4);
        }

        int a = generateNumber(level);
        int b = generateNumber(level);

        int answer = 0;

        switch (operation) {

            case 1:
                answer = a + b;
                System.out.println("How much is " +
                        a + " + " + b + "?");
                break;

            case 2:
                // Ensure the answer is not negative.
                if (a < b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }

                answer = a - b;

                System.out.println("How much is " +
                        a + " - " + b + "?");
                break;

            case 3:
                answer = a * b;

                System.out.println("How much is " +
                        a + " * " + b + "?");
                break;

            case 4:
                // Generate a division problem with an integer answer.
                int quotient = a;
                int divisor = b;

                int dividend = quotient * divisor;

                answer = quotient;

                System.out.println("How much is " +
                        dividend + " / " + divisor + "?");
                break;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("COMPUTER-ASSISTED INSTRUCTION");

        System.out.println("\nSelect difficulty level:");
        System.out.println("1. One-digit numbers");
        System.out.println("2. Two-digit numbers");
        System.out.println("3. Three-digit numbers");

        System.out.print("Enter difficulty level: ");
        int level = input.nextInt();

        if (level < 1 || level > 3) {
            System.out.println("Invalid difficulty level.");
            return;
        }

        System.out.println("\nSelect arithmetic operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Random mixture");

        System.out.print("Enter your choice: ");
        int type = input.nextInt();

        if (type < 1 || type > 5) {
            System.out.println("Invalid operation.");
            return;
        }

        int answer = generateQuestion(level, type);

        while (true) {

            System.out.print("Your answer: ");
            int response = input.nextInt();

            if (response == answer) {
                System.out.println("Very good!");

                answer = generateQuestion(level, type);

            } else {
                System.out.println("No. Please try again.");
            }
        }
    }
}