public class ReturnArrayFromMethod{
	public static void main(String[] args){
		int[] values = getNumbers();
		
		for(int i = 0; i < values.length; i++){
			System.out.println(values[i]);
		}
	}
	public static int[] getNumbers(){
		int[] numbers = {9,7,4,3,2,1,8,0,6,5};
		
		return numbers;
	}
}