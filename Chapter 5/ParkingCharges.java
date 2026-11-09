import java.util.Scanner;

public class ParkingCharges {
    public static double calculateCharges(double hours) {
        double charge;

        if (hours <= 3) {
            charge = 2.00;
        } else {
            charge = 2.00 + Math.ceil(hours - 3) * 0.50;
        }

        if (charge > 10.00) {
            charge = 10.00;
        }

        return charge;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;

        System.out.print("Enter number of customers: ");
        int customers = input.nextInt();

        for (int i = 1; i <= customers; i++) {
            System.out.print("Enter hours parked: ");
            double hours = input.nextDouble();

            double charge = calculateCharges(hours);
            total += charge;

            System.out.printf("Customer %d charge: $%.2f%n",
                    i, charge);
        }

        System.out.printf("Total receipts: $%.2f%n", total);
    }
}