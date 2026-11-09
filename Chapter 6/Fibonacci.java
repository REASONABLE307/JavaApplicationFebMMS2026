import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        int first = 0;
        int second = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {

            result = first + second;
            first = second;
            second = result;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println("Fibonacci number: " + fibonacci(n));
    }
}