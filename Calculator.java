import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate any two numbers");
		
		System.out.print("Enter the first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter any of these operators +,-,*,/,%: ");
		char operators = input.next().charAt(0);
		
		switch(operators){
			case '+':
					int addition = num1 + num2;
					System.out.printf("%d + %d = %d",num1,num2,addition);
			break;
			case '-':
					int subtraction = num1 - num2;
					System.out.printf("%d - %d = %d",num1,num2,subtraction);
			break;
			case '*':
					int multiplication = num1 * num2;
					System.out.printf("%d * %d = %d",num1,num2,multiplication);
			break;
			case '/':
					int division = num1 / num2;
					System.out.printf("%d / %d = %d",num1,num2,division);
			break;
			case '%':
					int remainder = num1 % num2;
					System.out.printf("%d %% %d = %d",num1,num2,remainder);
			break;
			default:
					System.out.println("INVALID INPUT");
		}
	}
}