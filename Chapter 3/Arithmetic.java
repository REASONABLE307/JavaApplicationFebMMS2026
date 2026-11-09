import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.printf("Sum is %d%n", number1 + number2);
        System.out.printf("Product is %d%n", number1 * number2);
        System.out.printf("Difference is %d%n", number1 - number2);

        if (number2 != 0) {
            System.out.printf("Quotient is %d%n", number1 / number2);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        input.close();
    }
}