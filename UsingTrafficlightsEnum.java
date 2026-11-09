import java.util.Scanner;

public class UsingTrafficlightsEnum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter light from 1-3: ");
		light = scan.next();
		
		switch(light){
			case 1:
					Trafficlights light1 = Trafficlights.RED;
					System.out.printf("The light you enter is %s%n",light1);
			break;
			
			case 2:
					Trafficlights light1 = Trafficlights.YELLOW;
					System.out.printf("The light you enter is %s%n",light2);
			break;
			
			case 3:
					Trafficlights light1 = Trafficlights.GREEN;
					System.out.printf("The light you enter is %s%n",light3);
			break;
			
			default:
					System.out.println("INVALID DAY");
		}
	}
}