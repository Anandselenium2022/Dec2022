package week1.day1;

public class Factorial {

	public static void main(String[] args) {

		//logic 5 fact 1*2*3*4*5
		
		System.out.println("Factorial Program....");
		
		int input=5;
		int fact=1;
		
		for (int j=1;j<=input;j++) {
			
			fact=fact*j;
			
		}
		
		System.out.println(fact);
	}

}
