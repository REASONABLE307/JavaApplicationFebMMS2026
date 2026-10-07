import java.util.Scanner;


public class DoubleSelection{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Fullname: ");
		String fullname = scan.nextLine();
		
		System.out.print("Enter username: ");
		String username = scan.nextLine();
		
		System.out.print("Enter password: ");
		String password = scan.nextLine();
		
		
		if(username.equals("Johnny Depp") && password.equals("12345")){
			System.out.println("ACCESS GRANTED");
			System.out.println(fullname + ", You are welcome");
		}
		else{
			System.out.println("ACCESS DENIED");
		}
	}
}