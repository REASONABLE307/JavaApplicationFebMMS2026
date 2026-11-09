public class ExhaustiveQueens {

    static int[] queens = new int[8];
    static int solutions = 0;

    static boolean safe(int row, int col) {

        for (int i = 0; i < row; i++) {

            if (queens[i] == col ||
                Math.abs(queens[i] - col) == row - i) {
                return false;
            }
        }

        return true;
    }

    static void solve(int row) {

        if (row == 8) {
            solutions++;
            return;
        }

        for (int col = 0; col < 8; col++) {

            if (safe(row, col)) {
                queens[row] = col;
                solve(row + 1);
            }
        }
    }

    public static void main(String[] args) {

        solve(0);

        System.out.println("Total solutions: " + solutions);
    }
}