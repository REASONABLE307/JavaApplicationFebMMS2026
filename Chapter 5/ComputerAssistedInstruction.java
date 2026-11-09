import java.util.Scanner;
import java.security.SecureRandom;

public class ComputerAssistedInstruction {

    static SecureRandom random = new SecureRandom();

    public static int generateQuestion() {
        int number1 = 1 + random.nextInt(9);
        int number2 = 1 + random.nextInt(9);

        System.out.println("\nHow much is " +
                number1 + " times " + number2 + "?");

        return number1 * number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int answer = generateQuestion();

        while (true) {

            System.out.print("Your answer: ");
            int response = input.nextInt();

            if (response == answer) {
                System.out.println("Very good!");

                answer = generateQuestion();

            } else {
                System.out.println("No. Please try again.");
            }
        }
    }
}