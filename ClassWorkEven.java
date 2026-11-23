public class ClassWorkEven{
	public static void main(String[] args){
		
		int[] numbers = {2,11,13,8,6,4,9,17,3,10};
		
		int countofEven = 0;
		
		for(int i = 0; i < 10; i++){
			if(numbers[i] % 2 == 0){
				countofEven++;
			}
		}

		System.out.printf("THE COUNT OF EVEN IS %d%n",countofEven);
	}
}
