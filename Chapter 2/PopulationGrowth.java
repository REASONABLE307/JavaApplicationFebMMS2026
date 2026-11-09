import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double population;
        double growthRate;

        System.out.print("Enter current world population: ");
        population = input.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        growthRate = input.nextDouble();

        growthRate = growthRate / 100;

        System.out.printf("Population after 1 year: %.0f%n",
                          population * (1 + growthRate));

        System.out.printf("Population after 2 years: %.0f%n",
                          population * (1 + growthRate) * (1 + growthRate));

        System.out.printf("Population after 3 years: %.0f%n",
                          population * (1 + growthRate) * (1 + growthRate)
                          * (1 + growthRate));

        System.out.printf("Population after 4 years: %.0f%n",
                          population * (1 + growthRate) * (1 + growthRate)
                          * (1 + growthRate) * (1 + growthRate));

        System.out.printf("Population after 5 years: %.0f%n",
                          population * (1 + growthRate) * (1 + growthRate)
                          * (1 + growthRate) * (1 + growthRate)
                          * (1 + growthRate));

        input.close();
    }
}