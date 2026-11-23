import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.Scanner;

public class StudentRegistration{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Ask the student to enter their full name
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        LocalDate currentDate = LocalDate.now();

        LocalTime currentTime = LocalTime.now();

        LocalDateTime registrationDateTime = LocalDateTime.now();

        System.out.println("\n----------------------------------");
        System.out.println("       STUDENT REGISTRATION REPORT");
        System.out.println("------------------------------------");

        System.out.println("Student Name       : " + fullName);
        System.out.println("Registration Date  : " + currentDate);
        System.out.println("Registration Time  : " + currentTime);
        System.out.println("Date and Time      : " + registrationDateTime);

        System.out.println("------------------------------------");
        System.out.println(" Registration Successful!");
        System.out.println("------------------------------------");

        input.close();
    }
}
