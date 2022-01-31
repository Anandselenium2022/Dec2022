	package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		
		//Logic sum of digits 2+4+6=12
		
			int  num=246;
			int sum=0;
			while(num>0)
			{
				int last=num%10;
				sum=sum+last;
				num=num/10;
			}
			System.out.println(sum);
			

	}

}
