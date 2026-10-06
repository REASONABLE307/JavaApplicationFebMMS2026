public class OperatorsPart1{
	
	public static void main(String[] args){
		//Arithmetic operator(=)
		
		int num = 100;
		System.out.printf("Number is %d%n",num);
		
		//Arithmetic operator(+,-,*,/,%)
		int num1 = 50;
		int num2 = 200;
		
		int addition = num1 + num2;
		int subtraction = num1 - num2;
		int multiplication = num1 * num2;
		double division = num1 / num2;
		int remainder = num1 % num2;
		
		//Compound assignment operators(+=,-=,*=,/=,%=)
		int number1 = 20;
		int number2 = 2;
		
		System.out.println("---------------------Arithmetic Output------------------------");
		
		System.out.printf("%d + %d = %d%n",num1,num2,addition);
		System.out.printf("%d - %d = %d%n",num1,num2,subtraction);
		System.out.printf("%d * %d = %d%n",num1,num2,multiplication);
		System.out.printf("%d / %d = %.2f%n",num1,num2,division);
		System.out.printf("%d %% %d = %d%n",num1,num2,remainder);
		System.out.println("----------------------Arithmetic Output------------------------");
		
		System.out.println("---------------------Compound Assignment Output-----------------------");
		number1 += number2;
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		
		number1 -= number2;
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		
		number1 *= number2;
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		
		number1 /= number2;
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		
		number1 %= number2;
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		System.out.println("---------------------Compound Assignment Output-----------------------");
		
		//Relational operator(>,<.>=,<=,==,!=)
		int x =90;
		int y =51;
		
		boolean isGreater = x > y;
		boolean isLessThan = x < y;
		boolean isGreaterOrEqualTo = x >= y;
		boolean isLessOrEqualTo = x <= y;
		boolean isEqualTo = x == y;
		boolean isNotEqualTo = x != y;
		
		System.out.println("---------------Relational Output-----------------");
		System.out.printf("Is %d > %d = %b%n",x,y,isGreater);
		System.out.printf("Is %d < %d = %b%n",x,y,isLessThan);
		System.out.printf("Is %d >= %d = %b%n",x,y,isGreaterOrEqualTo);
		System.out.printf("Is %d <= %d = %b%n",x,y,isLessOrEqualTo);
		System.out.printf("Is %d == %d = %b%n",x,y,isEqualTo);
		System.out.printf("Is %d != %d = %b%n",x,y,isNotEqualTo);
	}
}