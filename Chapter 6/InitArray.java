public class InitArray {
    public static void main(String[] args) {

        int arraySize = 10;

        if (args.length > 0) {
            arraySize = Integer.parseInt(args[0]);
        }

        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d%n", i, array[i]);
        }
    }
}