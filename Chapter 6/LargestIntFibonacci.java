public class LargestIntFibonacci {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;

        while (true) {

            int next = first + second;

            if (next < 0) {
                break;
            }

            first = second;
            second = next;
        }

        System.out.println("Largest Fibonacci number: " + second);
    }
}