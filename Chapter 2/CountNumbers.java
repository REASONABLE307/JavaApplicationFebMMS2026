import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int positive = 0;
        int negative = 0;
        int zeros = 0;

        System.out.print("Enter first number: ");
        number = input.nextInt();

        if (number > 0) {
            positive++;
        } else if (number < 0) {
            negative++;
        } else {
            zeros++;
        }

        System.out.print("Enter second number: ");
        number = input.nextInt();

        if (number > 0) {
            positive++;
        } else if (number < 0) {
            negative++;
        } else {
            zeros++;
        }

        System.out.print("Enter third number: ");
        number = input.nextInt();

        if (number > 0) {
            positive++;
        } else if (number < 0) {
            negative++;
        } else {
            zeros++;
        }

        System.out.print("Enter fourth number: ");
        number = input.nextInt();

        if (number > 0) {
            positive++;
        } else if (number < 0) {
            negative++;
        } else {
            zeros++;
        }

        System.out.print("Enter fifth number: ");
        number = input.nextInt();

        if (number > 0) {
            positive++;
        } else if (number < 0) {
            negative++;
        } else {
            zeros++;
        }

        System.out.printf("Positive numbers: %d%n", positive);
        System.out.printf("Negative numbers: %d%n", negative);
        System.out.printf("Zeros: %d%n", zeros);

        input.close();
    }
}
