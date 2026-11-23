import java.time.LocalTime

public class UsingLocalTime{
	public static void main(String[] args){
		LocalTime currentTime = LocalTime.now();
		LocalTime meetingTime = LocalTime.of(12,30,25);
		
		if(meetingTime.isBefore(currentTime)){
			System.out.println("FUCK YOU");
		}
		
		if(meetingTime.isAfter(currentTime)){
			System.out.println("FUCK YOU HOMIE");
		}
		
		System.out.printf("The meeting time is %s%n",currentTime);
		System.out.printf("The time for our class party is %s%n",meetingTime);
	}
}