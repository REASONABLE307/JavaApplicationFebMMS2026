import java.util.Random;

public class FullKnightsTour {

    static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    static int tour(Random random) {

        int[][] board = new int[8][8];

        int row = 0, col = 0;
        int count = 1;

        board[row][col] = 1;

        while (count < 64) {

            int[] moves = new int[8];
            int total = 0;

            for (int i = 0; i < 8; i++) {
                int r = row + vertical[i];
                int c = col + horizontal[i];

                if (r >= 0 && r < 8 && c >= 0 && c < 8
                    && board[r][c] == 0) {
                    moves[total++] = i;
                }
            }

            if (total == 0) {
                break;
            }

            int move = moves[random.nextInt(total)];

            row += vertical[move];
            col += horizontal[move];

            board[row][col] = ++count;
        }

        return count;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int[] frequency = new int[65];

        int attempts = 0;
        long start = System.currentTimeMillis();

        while (true) {

            attempts++;

            int moves = tour(random);
            frequency[moves]++;

            if (moves == 64) {
                break;
            }
        }

        long time = System.currentTimeMillis() - start;

        System.out.println("Full tour found!");
        System.out.println("Attempts: " + attempts);
        System.out.println("Time: " + time + " milliseconds");

        for (int i = 1; i <= 64; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + "\t" + frequency[i]);
            }
        }
    }
}