import java.util.Random;

public class TortoiseAndHare {

    public static void main(String[] args) {

        Random random = new Random();

        int tortoise = 1;
        int hare = 1;

        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");

        while (tortoise < 70 && hare < 70) {

            int t = random.nextInt(10) + 1;

            if (t <= 5) {
                tortoise += 3;
            } else if (t <= 7) {
                tortoise -= 6;
            } else {
                tortoise += 1;
            }

            int h = random.nextInt(10) + 1;

            if (h <= 2) {
                hare += 0;
            } else if (h <= 4) {
                hare += 9;
            } else if (h == 5) {
                hare -= 12;
            } else if (h <= 8) {
                hare += 1;
            } else {
                hare -= 2;
            }

            tortoise = Math.max(1, tortoise);
            hare = Math.max(1, hare);

            tortoise = Math.min(70, tortoise);
            hare = Math.min(70, hare);

            for (int i = 1; i <= 70; i++) {

                if (i == tortoise && i == hare) {
                    System.out.print("OUCH!!!");
                    i += 6;
                } else if (i == tortoise) {
                    System.out.print("T");
                } else if (i == hare) {
                    System.out.print("H");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        if (tortoise >= 70 && hare >= 70) {
            System.out.println("It's a tie.");
        } else if (tortoise >= 70) {
            System.out.println("TORTOISE WINS!!! YAY!!!");
        } else {
            System.out.println("Hare wins. Yuch.");
        }
    }
}