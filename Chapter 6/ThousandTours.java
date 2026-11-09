import java.util.Random;

public class ThousandTours {

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

        for (int i = 0; i < 1000; i++) {
            int moves = tour(random);
            frequency[moves]++;
        }

        System.out.println("Tour Length\tFrequency");

        for (int i = 1; i <= 64; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + "\t\t" + frequency[i]);
            }
        }
    }
}