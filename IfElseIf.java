import java.util.Scanner;
public class IfElseIf{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("----------------------------\n");
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		
		System.out.print("Enter your age: ");
		byte age = scan.nextByte();
		
		System.out.print("Enter your score: ");
		int score = scan.nextInt();
		System.out.println("----------------------------\n");
		if(score > 0 && score <= 100){
		
		if(score >= 70){
			System.out.println("Name: " + name);
			System.out.println("Age: " + age );
			System.out.println("score: "+ score);
			System.out.println("Grade: A");
		}
		else if(score >= 60){
		    System.out.println("Name: " + name);
			System.out.println("Age: " + age );
			System.out.println("score: "+ score);
			System.out.println("Grade: B");
		}
		else if(score >= 50){
		    System.out.println("Name: " + name);
			System.out.println("Age: " + age );
			System.out.println("score: "+ score);
			System.out.println("Grade: C");
		}
		else if(score >= 40){
		    System.out.println("Name: " + name);
			System.out.println("Age: " + age );
			System.out.println("score: "+ score);
			System.out.println("Grade: D");
		}
		else if(score >= 40){
		    System.out.println("Name: " + name);
			System.out.println("Age: " + age );
			System.out.println("score: "+ score);
			System.out.println("Grade: E");
		}
		else
			System.out.printf("Score must be less or equal to 100");
		}
	}
}

