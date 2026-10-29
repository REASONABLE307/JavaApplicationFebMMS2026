import java.util.Random;
import java.util.Scanner;

public class StudentID{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter Class: ");
        String studentClass = input.nextLine();

        int number = 10000 + random.nextInt(90000);
        String studentID = "STU" + number;

        System.out.println("\n---------STUDENT IDENTIFICATION---------");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Class: " + studentClass);
		System.out.println("\n----------------------------------------");
        
		System.out.println("\n---------DISPLAY ID---------");
		System.out.println("Student ID: " + studentID);
		
		
    }
}


