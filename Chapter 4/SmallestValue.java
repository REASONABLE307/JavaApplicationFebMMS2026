import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int count = input.nextInt();

        System.out.print("Enter an integer: ");
        int smallest = input.nextInt();

        for (int i = 2; i <= count; i++) {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();

            if (number < smallest)
                smallest = number;
        }

        System.out.println("Smallest value: " + smallest);

        input.close();
    }
}