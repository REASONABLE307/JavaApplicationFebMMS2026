import java.util.Scanner;

public class TemperatureConversions {

    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");

        System.out.print("Choose conversion: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter Fahrenheit: ");
            double f = input.nextDouble();

            System.out.println("Celsius: " + celsius(f));

        } else if (choice == 2) {
            System.out.print("Enter Celsius: ");
            double c = input.nextDouble();

            System.out.println("Fahrenheit: " + fahrenheit(c));

        } else {
            System.out.println("Invalid choice.");
        }
    }
}