import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] sales = new double[5][4];

        System.out.print("Enter number of sales slips: ");
        int slips = input.nextInt();

        for (int i = 0; i < slips; i++) {

            System.out.print("Enter salesperson number (1-4): ");
            int salesperson = input.nextInt();

            System.out.print("Enter product number (1-5): ");
            int product = input.nextInt();

            System.out.print("Enter total dollar value: ");
            double amount = input.nextDouble();

            if (salesperson >= 1 && salesperson <= 4 &&
                product >= 1 && product <= 5 && amount >= 0) {

                sales[product - 1][salesperson - 1] += amount;
            } else {
                System.out.println("Invalid entry.");
                i--;
            }
        }

        System.out.println("\nPRODUCT\tSP1\tSP2\tSP3\tSP4\tTOTAL");

        double[] salespersonTotals = new double[4];

        for (int row = 0; row < 5; row++) {

            double productTotal = 0;

            System.out.print((row + 1) + "\t");

            for (int col = 0; col < 4; col++) {

                System.out.printf("%.2f\t", sales[row][col]);

                productTotal += sales[row][col];
                salespersonTotals[col] += sales[row][col];
            }

            System.out.printf("%.2f%n", productTotal);
        }

        System.out.print("TOTAL\t");

        double grandTotal = 0;

        for (int col = 0; col < 4; col++) {
            System.out.printf("%.2f\t", salespersonTotals[col]);
            grandTotal += salespersonTotals[col];
        }

        System.out.printf("%.2f%n", grandTotal);
    }
}