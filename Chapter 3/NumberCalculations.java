import java.util.Scanner;

public class NumberCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        int sum, average, product;
        int smallest, largest;

        System.out.print("Enter first integer: ");
        a = input.nextInt();

        System.out.print("Enter second integer: ");
        b = input.nextInt();

        System.out.print("Enter third integer: ");
        c = input.nextInt();

        sum = a + b + c;
        average = sum / 3;
        product = a * b * c;

        smallest = a;
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }

        largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Average is %d%n", average);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Smallest is %d%n", smallest);
        System.out.printf("Largest is %d%n", largest);

        input.close();
    }
}