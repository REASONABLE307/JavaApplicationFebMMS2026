import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int employee = 1; employee <= 3; employee++) {
            System.out.print("Enter hours worked by employee "
                    + employee + ": ");
            double hours = input.nextDouble();

            System.out.print("Enter hourly rate: ");
            double rate = input.nextDouble();

            double grossPay;

            if (hours <= 40) {
                grossPay = hours * rate;
            } else {
                grossPay = (40 * rate)
                        + ((hours - 40) * rate * 1.5);
            }

            System.out.printf("Employee %d gross pay: $%.2f%n",
                    employee, grossPay);

            System.out.println();
        }

        input.close();
    }
}