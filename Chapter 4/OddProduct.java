public class OddProduct {
    public static void main(String[] args) {
        long product = 1;

        for (int i = 1; i <= 15; i += 2)
            product *= i;

        System.out.println("Product: " + product);
    }
}
4.13 Factorials
public class Factorials {
    public static void main(String[] args) {
        long factorial = 1;

        System.out.println("Number\tFactorial");

        for (int i = 1; i <= 20; i++) {
            factorial *= i;
            System.out.println(i + "\t" + factorial);
        }
    }
}