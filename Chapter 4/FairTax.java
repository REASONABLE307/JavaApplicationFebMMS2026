import java.util.Scanner;

public class FairTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double housing, food, clothing, transportation;
        double education, healthcare, vacations, other;
        double totalExpenses, fairTax;

        System.out.print("Enter housing expenses: ");
        housing = input.nextDouble();

        System.out.print("Enter food expenses: ");
        food = input.nextDouble();

        System.out.print("Enter clothing expenses: ");
        clothing = input.nextDouble();

        System.out.print("Enter transportation expenses: ");
        transportation = input.nextDouble();

        System.out.print("Enter education expenses: ");
        education = input.nextDouble();

        System.out.print("Enter healthcare expenses: ");
        healthcare = input.nextDouble();

        System.out.print("Enter vacation expenses: ");
        vacations = input.nextDouble();

        System.out.print("Enter other expenses: ");
        other = input.nextDouble();

        totalExpenses = housing + food + clothing + transportation
                + education + healthcare + vacations + other;

        fairTax = totalExpenses * 0.23;

        System.out.printf("Total expenses: $%.2f%n", totalExpenses);
        System.out.printf("Estimated FairTax (23%%): $%.2f%n", fairTax);

        input.close();
    }
}
