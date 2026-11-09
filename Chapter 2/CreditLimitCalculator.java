import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int accountNumber;
        int beginningBalance;
        int totalCharges;
        int totalCredits;
        int creditLimit;
        int newBalance;

        System.out.print("Enter account number (-1 to quit): ");
        accountNumber = input.nextInt();

        while (accountNumber != -1) {
            System.out.print("Enter beginning balance: ");
            beginningBalance = input.nextInt();

            System.out.print("Enter total charges: ");
            totalCharges = input.nextInt();

            System.out.print("Enter total credits: ");
            totalCredits = input.nextInt();

            System.out.print("Enter credit limit: ");
            creditLimit = input.nextInt();

            newBalance = beginningBalance + totalCharges - totalCredits;

            System.out.println("Account number: " + accountNumber);
            System.out.println("New balance: " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }

            System.out.print("\nEnter account number (-1 to quit): ");
            accountNumber = input.nextInt();
        }

        input.close();
    }
}