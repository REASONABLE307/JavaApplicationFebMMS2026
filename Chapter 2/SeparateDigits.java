import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a five-digit number: ");
        number = input.nextInt();

        System.out.printf("%d   ", number / 10000);
        System.out.printf("%d   ", (number % 10000) / 1000);
        System.out.printf("%d   ", (number % 1000) / 100);
        System.out.printf("%d   ", (number % 100) / 10);
        System.out.printf("%d%n", number % 10);

        input.close();
    }
}