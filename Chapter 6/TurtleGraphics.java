public class TurtleGraphics {
    public static void main(String[] args) {
        int[][] floor = new int[20][20];

        int[] commands = {
            2, 5, 12, 3, 5, 12, 3, 5, 12,
            3, 5, 12, 1, 6, 9
        };

        int row = 0, col = 0;
        int direction = 0;
        boolean penDown = false;

        int[] rowMove = {-1, 0, 1, 0};
        int[] colMove = {0, 1, 0, -1};

        for (int i = 0; i < commands.length; i++) {
            int command = commands[i];

            switch (command) {
                case 1:
                    penDown = false;
                    break;

                case 2:
                    penDown = true;
                    break;

                case 3:
                    direction = (direction + 1) % 4;
                    break;

                case 4:
                    direction = (direction + 3) % 4;
                    break;

                case 5:
                    int steps = commands[++i];

                    for (int j = 0; j < steps; j++) {
                        if (penDown) {
                            floor[row][col] = 1;
                        }

                        row += rowMove[direction];
                        col += colMove[direction];

                        if (row < 0 || row >= 20 ||
                            col < 0 || col >= 20) {
                            break;
                        }
                    }
                    break;

                case 6:
                    for (int r = 0; r < 20; r++) {
                        for (int c = 0; c < 20; c++) {
                            System.out.print(
                                floor[r][c] == 1 ? "*" : " "
                            );
                        }
                        System.out.println();
                    }
                    break;

                case 9:
                    return;
            }
        }
    }
}