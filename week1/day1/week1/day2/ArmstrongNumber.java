package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int  num=153;
		int sum=0;
		while(num>0)
		{
			int last=num%10;
			sum=sum+(last*last*last);
			num=num/10;
		}
		
		if(sum==num)
			
		System.out.println("The given number is Armstrong");
		
		else
			
			System.out.println("The given number is not Armstron");
		

	}

}
