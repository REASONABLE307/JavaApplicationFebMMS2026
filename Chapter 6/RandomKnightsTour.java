import java.util.Random;

public class RandomKnightsTour {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] board = new int[8][8];

        int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

        int row = 0, col = 0;
        int count = 1;

        board[row][col] = count;

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

        System.out.println("Moves: " + count);

        for (int[] line : board) {
            for (int value : line) {
                System.out.printf("%3d", value);
            }
            System.out.println();
        }
    }
}