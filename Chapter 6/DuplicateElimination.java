import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] uniqueValues = new int[5];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number (10-100): ");
            int number = input.nextInt();

            if (number < 10 || number > 100) {
                System.out.println("Invalid number.");
                i--;
                continue;
            }

            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (uniqueValues[j] == number) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                uniqueValues[count] = number;
                count++;
            }

            System.out.print("Unique values: ");

            for (int j = 0; j < count; j++) {
                System.out.print(uniqueValues[j] + " ");
            }

            System.out.println();
        }
    }
}