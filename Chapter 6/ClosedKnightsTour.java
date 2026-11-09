public class ClosedKnightsTour {

    static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {

        int[][] board = new int[8][8];

        int row = 0, col = 0;
        int startRow = row, startCol = col;

        board[row][col] = 1;

        int count = 1;

        while (count < 64) {

            boolean moved = false;

            for (int i = 0; i < 8; i++) {

                int r = row + vertical[i];
                int c = col + horizontal[i];

                if (r >= 0 && r < 8 && c >= 0 && c < 8
                    && board[r][c] == 0) {

                    row = r;
                    col = c;

                    board[row][col] = ++count;

                    moved = true;
                    break;
                }
            }

            if (!moved) {
                break;
            }
        }

        System.out.println("Moves: " + count);

        if (count == 64) {

            boolean closed = false;

            for (int i = 0; i < 8; i++) {

                if (row + vertical[i] == startRow &&
                    col + horizontal[i] == startCol) {
                    closed = true;
                    break;
                }
            }

            System.out.println(closed ?
                "Closed tour found." : "Open tour found.");
        }
    }
}