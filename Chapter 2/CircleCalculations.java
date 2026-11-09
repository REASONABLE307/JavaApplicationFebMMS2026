import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int radius;

        System.out.print("Enter the radius of the circle: ");
        radius = input.nextInt();

        System.out.printf("Diameter is %d%n", 2 * radius);

        System.out.printf(
            "Circumference is %f%n",
            2 * 3.14159 * radius
        );

        System.out.printf(
            "Area is %f%n",
            3.14159 * radius * radius
        );

        input.close();
    }
}