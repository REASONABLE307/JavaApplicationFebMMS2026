public class StaticMethod{
	public static void main(String[] args){
		int result1 = addNumbers(60,500);
		System.out.println("The answer is " + result1);
		
		int result5 = StaticMethod.addNumbers(9,1000);
		System.out.println("The answer is " + result5);
	}
	public static int addNumbers(int num1, int num2){
		int addition = num1 + num2;
		
		return addition;
	}
	
}