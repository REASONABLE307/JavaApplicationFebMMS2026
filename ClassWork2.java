public class ClassWork2{
	public static void main(String[] args){
		checkAge(23);
		checkAge(18);
		checkAge(16);
	}
	
	public static void checkAge(int Age){
		if(Age >= 18){
			System.out.println("YOU ARE AN ADULT");
		}
		else{
			System.out.println("YOU ARE STILL A MINOR");
		}
	}
}