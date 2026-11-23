public class VarArgsDemo{
	public static void main(String[] args){
		addition();
		addition(10,10);
		addition(10,10,10);
		addition(10,10,10,10);
		addition(10,15);
		addition(10,10);
		addition(10);
	}
	
	public static void addition(int... numbers){
		int sum = 0;
		for(int num : numbers){
			sum += num;
		}
		System.out.println(sum);
	}
}