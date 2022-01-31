package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		
		//Logic 0,1,1,2,3,5,8 for 10 iterations.
		
		int num1=0;
		int num2=1;
		int result;
		
		System.out.println(num1);
		System.out.println(num2);
		
		for(int i=1;i<=8;i++)
		{
			
			result=num1+num2;
			num1=num2;
			num2=result;
	
			System.out.println(result);
		}
		

	}

}
