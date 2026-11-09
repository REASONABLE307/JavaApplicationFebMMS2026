import java.util.Scanner;
import java.security.SecureRandom;

public class MonitoringStudentPerformance {

    static SecureRandom random = new SecureRandom();

    public static int generateQuestion() {
        int a = 1 + random.nextInt(9);
        int b = 1 + random.nextInt(9);

        System.out.println("How much is " + a + " times " + b + "?");

        return a * b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int correct = 0;
            int incorrect = 0;
            int total = 0;

            int answer = generateQuestion();

            while (total < 10) {

                System.out.print("Your answer: ");
                int response = input.nextInt();

                total++;

                if (response == answer) {
                    correct++;

                    System.out.println("Very good!");

                    if (total < 10) {
                        answer = generateQuestion();
                    }

                } else {
                    incorrect++;
                    System.out.println("No. Please try again.");
                }
            }

            double percentage = correct * 100.0 / 10;

            System.out.println("\nCorrect answers: " + correct);
            System.out.println("Incorrect answers: " + incorrect);

            System.out.println("Percentage correct: " +
                    percentage + "%");

            if (percentage < 75) {
                System.out.println(
                        "Please ask your teacher for extra help.");
            } else {
                System.out.println(
                        "Congratulations, you are ready to go to the next level!");
            }

            System.out.println("\nStarting another student's test...\n");
        }
    }
}