public class MethodOverloadingDemo{
	public static void main(String[] args){
		addition(20);
		addition(20,40,40);
		addition(20,40);
		addition(20,60,10,10);
		subtraction(100,60);
	}
	
	public static void addition(int a){
		int sum = a;
		System.out.println("YOUR SUM IS: " + sum);
	}
	
	public static void addition(int a,int b){
		int sum = a + b;
		System.out.println("YOUR SUM IS: " + sum);
	}
	
	public static void addition(int a,int b,int c){
		int sum = a + b + c;
		System.out.println("YOUR SUM IS: " + sum);
	}
	
	public static void addition(int a,int b,int c, int d){
		int sum = a + b + c + d;
		System.out.println("YOUR SUM IS: " + sum);
	}
	
	public static void subtraction(int a,int b){
		int sum = a - b;
		System.out.println("---------------------");
		System.out.println("YOUR SUM IS: " + sum);
	}
}