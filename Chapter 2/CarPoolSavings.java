import java.util.Scanner;

public class CarPoolSavings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double miles;
        double pricePerGallon;
        double milesPerGallon;
        double parking;
        double tolls;
        double fuelCost;
        double totalCost;

        System.out.print("Enter total miles driven per day: ");
        miles = input.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        pricePerGallon = input.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        milesPerGallon = input.nextDouble();

        System.out.print("Enter parking fees per day: ");
        parking = input.nextDouble();

        System.out.print("Enter tolls per day: ");
        tolls = input.nextDouble();

        if (milesPerGallon <= 0) {
            System.out.println("Miles per gallon must be greater than zero.");
        } else {
            fuelCost = (miles / milesPerGallon) * pricePerGallon;

            totalCost = fuelCost + parking + tolls;

            System.out.printf("Daily fuel cost: %.2f%n", fuelCost);
            System.out.printf("Total daily driving cost: %.2f%n", totalCost);
        }

        input.close();
    }
}




