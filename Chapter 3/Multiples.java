import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        if (number2 == 0) {
            System.out.println("Cannot determine multiples using zero as the divisor.");
        } else if (number1 % number2 == 0) {
            System.out.println(number1 + " is a multiple of " + number2);
        } else {
            System.out.println(number1 + " is not a multiple of " + number2);
        }

        input.close();
    }
}