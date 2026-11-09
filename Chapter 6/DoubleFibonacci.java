import java.util.Scanner;

public class DoubleFibonacci {

    public static double fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        double first = 0;
        double second = 1;
        double result = 0;

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