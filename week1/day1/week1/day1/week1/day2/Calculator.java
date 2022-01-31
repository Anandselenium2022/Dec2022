package week1.day2;

public class Calculator {

	public int add (int num1,int num2) {
		int output;
		output=num1+num2;
		return output;
	}
	
	
	public int sub (int num1,int num2) {
		int output;
		output=num1-num2;
		return output;
	}
	
	public int multiple (int num1,int num2) {
		int output;
		output=num1*num2;
		return output;
	}
	
	public int division (int num1,int num2) {
		int output;
		output=num1/num2;
		return output;
	}


	
	public static void main(String[] args) {
		
		Calculator calc=new Calculator();
		
		int result1=calc.add(10, 20);
		System.out.println(result1);
		
		int result2=calc.sub(10, 20);
		System.out.println(result2);
		
		int result3=calc.multiple(10, 20);
		System.out.println(result3);
		
		int result4=calc.division(20, 10);
		System.out.println(result4);
		

	}

}
