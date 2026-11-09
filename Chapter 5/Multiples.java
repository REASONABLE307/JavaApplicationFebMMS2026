import java.util.Scanner;

public class Multiples {

    public static boolean isMultiple(int first, int second) {
        return second % first == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int first = input.nextInt();

        System.out.print("Enter second integer: ");
        int second = input.nextInt();

        if (first == 0) {
            System.out.println("First integer cannot be zero.");
        } else if (isMultiple(first, second)) {
            System.out.println(second + " is a multiple of " + first);
        } else {
            System.out.println(second + " is not a multiple of " + first);
        }
    }
}