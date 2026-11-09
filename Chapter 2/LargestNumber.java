import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest;

        System.out.print("Enter number 1: ");
        largest = input.nextInt();

        while (counter < 10) {
            counter++;

            System.out.print("Enter number " + counter + ": ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("The largest number is: " + largest);

        input.close();
    }
}