import java.util.Scanner;

public class SeparatingDigits {

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int number) {
        int divisor = 10000;

        while (divisor > 0) {
            int digit = quotient(number, divisor);

            if (digit > 0 || divisor == 1) {
                System.out.print(digit);
                if (divisor > 1) {
                    System.out.print("  ");
                }
            }

            number = remainder(number, divisor);
            divisor /= 10;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (1-99999): ");
        int number = input.nextInt();

        displayDigits(number);
    }
}