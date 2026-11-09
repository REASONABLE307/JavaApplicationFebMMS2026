public class SingleDimensionalArray{
	public static void main(String[] args){
		
		int[] ages = {18,17,16,20,19};
		
		System.out.println("ELEMENT OF THE ARRAY");
		
		for(int i = 0; i < 5; i++){
			System.out.println(ages[i]);
		}
		System.out.println("--------------------");
		if(ages[0] > ages[4]){
			System.out.println("HI THERE");
		}
		else{
			System.out.println("OH NO");
		}
	}
}