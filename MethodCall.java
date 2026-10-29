public class MethodCall{
	public static void main(String[] args){
	}
	public static void checkAge(int age){
		if(age >=18){
			System.out.println("ADULT");
		}
		else{
			System.out.printin("MINOR");
		}
		greetings();
	}
	public static void greetings(){
		System.out.println("HELLO EVERYONE");
		addMe(2,15);
	}
	public static void addMe(int x, int y){
		int sum = x + y;
	}
}