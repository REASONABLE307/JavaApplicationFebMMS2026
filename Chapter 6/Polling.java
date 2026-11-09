import java.util.Scanner;

public class Polling {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] topics = {
            "Education",
            "Healthcare",
            "Climate Change",
            "Unemployment",
            "Poverty"
        };

        int[][] responses = new int[5][10];

        int[] totals = new int[5];

        int[] ratingCounts = new int[5];

        for (int i = 0; i < topics.length; i++) {

            System.out.println("\nRate the following issue: " + topics[i]);

            System.out.print("Enter rating (1-10): ");
            int rating = input.nextInt();

            while (rating < 1 || rating > 10) {
                System.out.print("Enter a rating between 1 and 10: ");
                rating = input.nextInt();
            }

            responses[i][rating - 1]++;
            totals[i] += rating;
            ratingCounts[i]++;
        }

        System.out.println("\nPOLLING RESULTS");

        System.out.printf("%-20s", "Topic");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%5d", i);
        }

        System.out.printf("%12s%n", "Average");

        for (int i = 0; i < topics.length; i++) {

            System.out.printf("%-20s", topics[i]);

            for (int j = 0; j < 10; j++) {
                System.out.printf("%5d", responses[i][j]);
            }

            double average = (double) totals[i] / ratingCounts[i];

            System.out.printf("%12.2f%n", average);
        }

        int highest = 0;
        int lowest = 0;

        for (int i = 1; i < totals.length; i++) {

            if (totals[i] > totals[highest]) {
                highest = i;
            }

            if (totals[i] < totals[lowest]) {
                lowest = i;
            }
        }

        System.out.println("\nHighest Point Total:");
        System.out.println(topics[highest] + " = " + totals[highest]);

        System.out.println("\nLowest Point Total:");
        System.out.println(topics[lowest] + " = " + totals[lowest]);
    }
}