public class SumArguments {
    public static void main(String[] args) {

        double total = 0.0;

        for (String value : args) {
            total += Double.parseDouble(value);
        }

        System.out.println("Sum = " + total);
    }
}