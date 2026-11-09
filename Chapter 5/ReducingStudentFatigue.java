import java.util.Scanner;
import java.security.SecureRandom;

public class ReducingStudentFatigue {

    static SecureRandom random = new SecureRandom();

    public static int generateQuestion() {
        int a = 1 + random.nextInt(9);
        int b = 1 + random.nextInt(9);

        System.out.println("\nHow much is " + a + " times " + b + "?");

        return a * b;
    }

    public static void correctResponse() {
        switch (1 + random.nextInt(4)) {
            case 1:
                System.out.println("Very good!");
                break;

            case 2:
                System.out.println("Excellent!");
                break;

            case 3:
                System.out.println("Nice work!");
                break;

            case 4:
                System.out.println("Keep up the good work!");
                break;
        }
    }

    public static void incorrectResponse() {
        switch (1 + random.nextInt(4)) {
            case 1:
                System.out.println("No. Please try again.");
                break;

            case 2:
                System.out.println("Wrong. Try once more.");
                break;

            case 3:
                System.out.println("Don't give up! No.");
                break;

            case 4:
                System.out.println("Keep trying.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int answer = generateQuestion();

        while (true) {
            System.out.print("Your answer: ");
            int response = input.nextInt();

            if (response == answer) {
                correctResponse();
                answer = generateQuestion();
            } else {
                incorrectResponse();
            }
        }
    }
}