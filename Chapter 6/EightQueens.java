public class EightQueens {

    static int[] queens = new int[8];

    static boolean safe(int row, int col) {

        for (int i = 0; i < row; i++) {

            if (queens[i] == col ||
                Math.abs(queens[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }

        return true;
    }

    static boolean solve(int row) {

        if (row == 8) {
            return true;
        }

        for (int col = 0; col < 8; col++) {

            if (safe(row, col)) {

                queens[row] = col;

                if (solve(row + 1)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        if (solve(0)) {

            for (int row = 0; row < 8; row++) {

                for (int col = 0; col < 8; col++) {

                    if (queens[row] == col) {
                        System.out.print(" Q ");
                    } else {
                        System.out.print(" . ");
                    }
                }

                System.out.println();
            }
        }
    }
}