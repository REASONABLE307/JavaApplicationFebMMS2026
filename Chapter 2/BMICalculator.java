import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int weight;
        int height;
        int bmi;

        System.out.print("Enter weight in pounds: ");
        weight = input.nextInt();

        System.out.print("Enter height in inches: ");
        height = input.nextInt();

        bmi = weight * 703 / (height * height);

        System.out.printf("Your BMI is %d%n", bmi);

        System.out.println("\nBMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      18.5 - 24.9");
        System.out.println("Overweight:  25 - 29.9");
        System.out.println("Obesity:     30 or greater");

        input.close();
    }
}
