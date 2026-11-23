import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeAttendance{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Ask the user to enter the employee's name
        System.out.print("Enter employee's name: ");
        String employeeName = input.nextLine();

        // Capture the current date
        LocalDate currentDate = LocalDate.now();

        // Capture the current time
        LocalTime currentTime = LocalTime.now();

        // Format the date as 19-November-2026
        DateTimeFormatter dateFormat =
                DateTimeFormatter.ofPattern("dd-MMMM-yyyy");

        // Format the time as 12:30 PM
        DateTimeFormatter timeFormat =
                DateTimeFormatter.ofPattern("hh:mm a");

        // Format the full date as Thursday, 19 November 2026
        DateTimeFormatter fullDateFormat =
                DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");

        // Display the attendance report
        System.out.println("\n------EMPLOYEE ATTENDANCE REPORT------");

        System.out.println("\nEmployee Name: " + employeeName);
        System.out.println("Date: " + currentDate.format(dateFormat));
        System.out.println("Time: " + currentTime.format(timeFormat));
        System.out.println("Full Date: " + currentDate.format(fullDateFormat));

        System.out.println("\nAttendance Status: Present");

        input.close();
    }
}
