import java.util.Random;

public class UsingRandomClass{
	public static void main(String[] args){
		
		Random rand = new Random();
		
		int num1 = Math.abs(rand.nextInt());
		int num2 = rand.nextInt(100);
		boolean answer = rand.nextBoolean();
		char alpha = (char)(rand.nextInt(26) + 'A');
		
		System.out.println("--------------------------------");
		
		System.out.printf("The generated number is %d%n",num1);
		System.out.printf("The random number is %d%n",num1);
		System.out.printf("do you love java ? %b%n",answer);
		System.out.printf("the generated alphabet is %c%n",alpha);
		System.out.println("--------------------------------");
	}
}