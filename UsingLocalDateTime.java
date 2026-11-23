import java.time.LocalDateTime;

public class UsingLocalDateTime{
	public static void main(String[] args){
		LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDateTime currentDateTime = LocalDateTime.parse();
		
		System.out.printf("Todays date and time is %s%n",currentDateTime);
	}
}