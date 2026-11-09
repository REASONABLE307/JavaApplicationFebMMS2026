import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double itemValue;
        double totalSales = 0;
        double earnings;

        System.out.print("Enter item value (-1 to quit): ");
        itemValue = input.nextDouble();

        while (itemValue != -1) {
            if (itemValue >= 0) {
                totalSales += itemValue;
            } else {
                System.out.println("Enter a non-negative item value.");
            }

            System.out.print("Enter item value (-1 to quit): ");
            itemValue = input.nextDouble();
        }

        earnings = 200 + (0.09 * totalSales);

        System.out.printf("Total sales: $%.2f%n", totalSales);
        System.out.printf("Weekly earnings: $%.2f%n", earnings);

        input.close();
    }
}