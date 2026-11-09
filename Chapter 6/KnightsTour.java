import java.util.Random;

public class KnightsTour {
    public static void main(String[] args) {

        int[][] board = new int[8][8];

        int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

        int currentRow = 3;
        int currentColumn = 3;
        int count = 1;

        board[currentRow][currentColumn] = count;

        Random random = new Random();

        while (count < 64) {
            int[] validMoves = new int[8];
            int validCount = 0;

            for (int move = 0; move < 8; move++) {
                int newRow = currentRow + vertical[move];
                int newColumn = currentColumn + horizontal[move];

                if (newRow >= 0 && newRow < 8 &&
                    newColumn >= 0 && newColumn < 8 &&
                    board[newRow][newColumn] == 0) {

                    validMoves[validCount++] = move;
                }
            }

            if (validCount == 0) {
                break;
            }

            int move = validMoves[random.nextInt(validCount)];

            currentRow += vertical[move];
            currentColumn += horizontal[move];

            board[currentRow][currentColumn] = ++count;
        }

        System.out.println("Moves made: " + count);

        for (int[] row : board) {
            for (int value : row) {
                System.out.printf("%3d", value);
            }
            System.out.println();
        }
    }
}