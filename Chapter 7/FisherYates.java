import java.util.Random;

public class FisherYates {

    public static void shuffle(int[] array) {

        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {

            int j = random.nextInt(i + 1);

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        shuffle(numbers);

        System.out.println("Shuffled Array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}