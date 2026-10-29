// class work

public class StudentResult{
	public static void main(String[] args){
		StudentResult student = new StudentResult();
		
		student.calculateResult(65);
		student.calculateResult(70,40);
		student.calculateResult(70,40,65);
		student.calculateResult(85.5,85.0);
	}
	
	public void calculateResult(int score){
		System.out.println("Single Score: " + score);
	}
	
	public void calculateResult(int score1, int score2){
		double average = (score1 + score2);
		System.out.println("Average of two Scores: " + average);
	}
	
	public void calculateResult(int score1, int score2, int score3){
		double average = (score1 + score2 + score3);
		System.out.println("Average of three Scores: " + average);
	}
	
	public void calculateResult(double score1, double score2){
		double average = (score1 + score2);
		System.out.println("Average of two Decimal Scores: " + average);
	}
}