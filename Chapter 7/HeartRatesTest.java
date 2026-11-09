import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter birth month: ");
        int month = input.nextInt();

        System.out.print("Enter birth day: ");
        int day = input.nextInt();

        System.out.print("Enter birth year: ");
        int year = input.nextInt();

        HeartRates person = new HeartRates(
            firstName, lastName, month, day, year
        );

        System.out.println("\nPERSONAL INFORMATION");

        System.out.println("First Name: " +
                           person.getFirstName());

        System.out.println("Last Name: " +
                           person.getLastName());

        System.out.println("Date of Birth: " +
                           person.getMonth() + "/" +
                           person.getDay() + "/" +
                           person.getYear());

        System.out.println("Age: " +
                           person.getAge() + " years");

        System.out.println("Maximum Heart Rate: " +
                           person.getMaximumHeartRate() +
                           " beats per minute");

        System.out.println("Target Heart Rate: " +
                           person.getTargetHeartRate());
    }
}