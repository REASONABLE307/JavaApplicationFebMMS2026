import java.util.Scanner;

public class QualityPoints {

    public static int qualityPoints(int average) {

        if (average >= 90 && average <= 100) {
            return 4;
        } else if (average >= 80 && average <= 89) {
            return 3;
        } else if (average >= 70 && average <= 79) {
            return 2;
        } else if (average >= 60 && average <= 69) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's average: ");
        int average = input.nextInt();

        if (average < 0 || average > 100) {
            System.out.println("Invalid average.");
        } else {
            System.out.println("Quality points: " +
                    qualityPoints(average));
        }
    }
}