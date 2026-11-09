import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counters = new int[9];

        System.out.print("Enter number of salespeople: ");
        int people = input.nextInt();

        for (int i = 1; i <= people; i++) {
            System.out.print("Enter gross sales for salesperson " + i + ": ");
            double sales = input.nextDouble();

            int salary = (int) (200 + 0.09 * sales);

            if (salary >= 1000) {
                counters[8]++;
            } else {
                counters[(salary - 200) / 100]++;
            }
        }

        System.out.println("\nSalary Range\tNumber of Salespeople");

        String[] ranges = {
            "$200-$299", "$300-$399", "$400-$499",
            "$500-$599", "$600-$699", "$700-$799",
            "$800-$899", "$900-$999", "$1000 and over"
        };

        for (int i = 0; i < counters.length; i++) {
            System.out.println(ranges[i] + "\t" + counters[i]);
        }
    }
}