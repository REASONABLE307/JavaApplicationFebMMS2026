import java.util.Scanner;

public class SingleDimensionalArray2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[20];
		
		for(int i = 0; i < 20; i++){
			System.out.print("Enter any number: ");
			numbers[i] = scan.nextInt();

		}
		if(numbers[0] >= numbers[15]){
			System.out.println("BLAH BLAH BLAH");
		}
		else{
			System.out.println("BLUH BLUH BLUH");
		}
	}
}