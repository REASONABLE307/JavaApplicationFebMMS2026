import java.util.Random;

public class RandomQueens {

    public static void main(String[] args) {

        Random random = new Random();

        int[] queens = new int[8];

        boolean solved = false;

        while (!solved) {

            for (int i = 0; i < 8; i++) {
                queens[i] = random.nextInt(8);
            }

            solved = true;

            for (int i = 0; i < 8; i++) {
                for (int j = i + 1; j < 8; j++) {

                    if (queens[i] == queens[j] ||
                        Math.abs(queens[i] - queens[j]) == j - i) {
                        solved = false;
                    }
                }
            }
        }

        System.out.println("Solution found:");

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(queens[row] == col ? " Q " : " . ");
            }
            System.out.println();
        }
    }
}