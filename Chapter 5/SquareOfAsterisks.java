import java.util.Scanner;

public class SquareOfAsterisks {

    public static void squareOfAsterisks(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter square side: ");
        int side = input.nextInt();

        squareOfAsterisks(side);
    }
}