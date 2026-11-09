import java.util.Scanner;

public class CircleArea {

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle radius: ");
        double radius = input.nextDouble();

        System.out.println("Circle area: " + circleArea(radius));
    }
}