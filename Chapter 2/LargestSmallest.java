import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int largest, smallest;

        System.out.print("Enter integer 1: ");
        number = input.nextInt();

        largest = number;
        smallest = number;

        System.out.print("Enter integer 2: ");
        number = input.nextInt();

        if (number > largest) {
            largest = number;
        }
        if (number < smallest) {
            smallest = number;
        }

        System.out.print("Enter integer 3: ");
        number = input.nextInt();

        if (number > largest) {
            largest = number;
        }
        if (number < smallest) {
            smallest = number;
        }

        System.out.print("Enter integer 4: ");
        number = input.nextInt();

        if (number > largest) {
            largest = number;
        }
        if (number < smallest) {
            smallest = number;
        }

        System.out.print("Enter integer 5: ");
        number = input.nextInt();

        if (number > largest) {
            largest = number;
        }
        if (number < smallest) {
            smallest = number;
        }

        System.out.printf("Largest integer is %d%n", largest);
        System.out.printf("Smallest integer is %d%n", smallest);

        input.close();
    }
}