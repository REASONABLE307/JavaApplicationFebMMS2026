import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles, gallons;
        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            if (gallons <= 0) {
                System.out.println("Gallons must be greater than zero.");
            } else {
                double mpg = (double) miles / gallons;

                System.out.printf("Miles per gallon: %.2f%n", mpg);

                totalMiles += miles;
                totalGallons += gallons;

                System.out.printf("Combined miles per gallon: %.2f%n",
                        (double) totalMiles / totalGallons);
            }

            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }

        input.close();
    }
}