import java.time.LocalDate;
import java.util.Scanner;

public class UsingLocalDate{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in)
		LocalDate currentDate = LocalDate.now();
		LocalDate examDate = LocalDate.Of(2026,12,18);
		
		System.out.print("ENTER YOUR DATE OF BIRTH(YYYY-MM-DD): ");
		String birthDate = scan.nextLine();
		
		LocalDate userBirthDate = LocalDate.parse(birthDate);
		
		if(userBirthDate.isLeapYear()){
			System.out.printf("%s is a leap year",userBirthDate);
		}
		else{
			System.out.printf("%s is not a leap year",userBirthDate);
		}
		
		if(examDate.equals(currentDate)){
			System.out.println("TODAY IS MY EXAM");
		}
		
		System.out.printf("Today's Date is %s%n",currentDate);
		System.out.printf("My Java exam is on %s%n",currentDate);
		System.out.printf("Your Date Of Birth Is %s%n",userBirthDate);
		System.out.printf("The year of birth is %d%n",userBirthDate.getYear());
		System.out.println(examDate.plusDays(5));
		
	}
}