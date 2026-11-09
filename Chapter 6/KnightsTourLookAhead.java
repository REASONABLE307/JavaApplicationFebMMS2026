public class KnightsTourLookAhead {
    static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    static int[][] board = new int[8][8];

    static int degree(int r, int c) {
        int count = 0;

        for (int i = 0; i < 8; i++) {
            int nr = r + vertical[i];
            int nc = c + horizontal[i];

            if (nr >= 0 && nr < 8 && nc >= 0 && nc < 8
                && board[nr][nc] == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int row = 0, col = 0;
        board[row][col] = 1;

        for (int count = 2; count <= 64; count++) {

            int bestMove = -1;
            int minimum = Integer.MAX_VALUE;

            for (int i = 0; i < 8; i++) {

                int r = row + vertical[i];
                int c = col + horizontal[i];

                if (r >= 0 && r < 8 && c >= 0 && c < 8
                    && board[r][c] == 0) {

                    int score = degree(r, c);

                    if (score < minimum) {
                        minimum = score;
                        bestMove = i;
                    }
                }
            }

            if (bestMove == -1) {
                break;
            }

            row += vertical[bestMove];
            col += horizontal[bestMove];

            board[row][col] = count;
        }

        System.out.println("Knight's Tour:");

        for (int[] line : board) {
            for (int value : line) {
                System.out.printf("%3d", value);
            }
            System.out.println();
        }
    }
}