public class UsingMathClass{
	public static void main(String[] args){
		int absoluteNumber = Math.abs(-200);
		double maximumNumber = Math.max(12,3);
		double minimumNumber = Math.min(12,3);
		int minimumNumber = Math.sqrt(64);
		double power = Math.pow(64,2);
		double randomNumber = Math.Random();
		
		System.out.println("The Value is " + absoluteNumber);
		System.out.println("The Value is " + maximumNumber);
		System.out.println("The Value is " + minimumNumber);
		System.out.println("The Value is " + squarRoot);
		System.out.println("The Value is " + power);
		System.out.printf("The Value is %.2f%n",randomNumber);
	}
}