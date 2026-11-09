public class KnightsTourHeuristic {

    static int[][] board = new int[8][8];

    static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    static int[][] accessibility = {
        {2, 3, 4, 4, 4, 4, 3, 2},
        {3, 4, 6, 6, 6, 6, 4, 3},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {3, 4, 6, 6, 6, 6, 4, 3},
        {2, 3, 4, 4, 4, 4, 3, 2}
    };

    public static void main(String[] args) {

        int row = 0, col = 0;
        board[row][col] = 1;

        for (int count = 2; count <= 64; count++) {

            int bestMove = -1;
            int lowest = Integer.MAX_VALUE;

            for (int move = 0; move < 8; move++) {
                int r = row + vertical[move];
                int c = col + horizontal[move];

                if (r >= 0 && r < 8 && c >= 0 && c < 8 &&
                    board[r][c] == 0) {

                    if (accessibility[r][c] < lowest) {
                        lowest = accessibility[r][c];
                        bestMove = move;
                    }
                }
            }

            if (bestMove == -1) {
                break;
            }

            row += vertical[bestMove];
            col += horizontal[bestMove];

            board[row][col] = count;

            for (int move = 0; move < 8; move++) {
                int r = row + vertical[move];
                int c = col + horizontal[move];

                if (r >= 0 && r < 8 && c >= 0 && c < 8) {
                    accessibility[r][c]--;
                }
            }
        }

        for (int[] line : board) {
            for (int value : line) {
                System.out.printf("%3d", value);
            }
            System.out.println();
        }
    }
}