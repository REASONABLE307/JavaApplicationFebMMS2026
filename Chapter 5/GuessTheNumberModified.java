import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberModified {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String playAgain;

        do {
            int answer = 1 + random.nextInt(1000);
            int guess;
            int count = 0;

            System.out.println("Guess a number between 1 and 1000");

            do {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                count++;

                if (guess > answer) {
                    System.out.println("Too high. Try again.");
                } else if (guess < answer) {
                    System.out.println("Too low. Try again.");
                }

            } while (guess != answer);

            System.out.println(
                    "Congratulations. You guessed the number!");

            System.out.println("Number of guesses: " + count);

            if (count < 10) {
                System.out.println(
                        "Either you know the secret or you got lucky!");
            } else if (count == 10) {
                System.out.println("Aha! You know the secret!");
            } else {
                System.out.println(
                        "You should be able to do better!");
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = input.next();

        } while (playAgain.equalsIgnoreCase("yes"));
    }
}