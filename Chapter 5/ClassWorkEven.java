import java.util.Scanner

public class ClassWorkEven{

    public static boolean isEven(int numbers) {
        return numbers % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int number = input.nextInt();

        if (isEven(numbers)) {
            System.out.println(numbers + " are even.");
        } else {
            System.out.println(numbers + " are odd.");
        }
    }
}
