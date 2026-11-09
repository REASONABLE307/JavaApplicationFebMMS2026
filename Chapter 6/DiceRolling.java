import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {

        Random random = new Random();
        int[] frequencies = new int[13];

        for (int i = 1; i <= 36000000; i++) {
            int die1 = 1 + random.nextInt(6);
            int die2 = 1 + random.nextInt(6);

            int sum = die1 + die2;

            frequencies[sum]++;
        }

        System.out.println("Sum\tFrequency");

        for (int i = 2; i <= 12; i++) {
            System.out.printf("%d\t%d%n", i, frequencies[i]);
        }
    }
}