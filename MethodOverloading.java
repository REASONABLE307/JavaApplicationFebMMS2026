import java.util.Scanner;

public class MethodOverloading{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------------------------");
		System.out.println("INPUT PERIMETER CALCULATION TERMS");
		System.out.println("--------------------------\n");
		System.out.println("Enter 1. Circle");
		System.out.println("Enter 2. Square");
		System.out.println("Enter 3. Rectangle");
		System.out.println("Enter 0. Exit");
		System.out.println("--------------------------\n");
		System.out.println("Enter your choice: ");
		int choice = scan.nextInt();
		
		switch(choice){
			case 1:
					System.out.print("ENTER RADIUS: ");
					double radius = scan.nextDouble();
					
					System.out.printf("THE PERIMETER IS %.2f%n",shape(radius));
			break;
			
			case 2:
					System.out.print("ENTER LENGTH OF SQUARE: ");
					int length = scan.nextInt();
					
					System.out.printf("THE PERIMETER IS %d%n",shape(length));
			break;
			
			case 3:
					System.out.print("ENTER LENGTH OF RECTANGLE: ");
					int lengthofRect = scan.nextInt();
					
					System.out.print("ENTER BREADTH OF RECTANGLE: ");
					int breadthofRect = scan.nextInt();
					
					System.out.printf("THE PERIMETER IS %d%n",shape(lengthofRect,breadthofRect));
			break;
			
			default:
			System.out.println("EXITING--------------GOOD BYE");
		}
		
	}
	
	public static double shape(double r){
		double perimeter = 2*Math.PI*r;
		
		return perimeter;
	}
	public static int shape(int l){
		int perimeter = 4*l;
		
		return perimeter;
	}
	public static int shape(int l, int b){
		int perimeter = 2*(l+b);
		
		return perimeter;
	}
	
}