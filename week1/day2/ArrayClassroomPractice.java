package week1.day2;

import java.util.Arrays;

public class ArrayClassroomPractice {

	public static void main(String[] args) {

		int[] numbers= {3,2,11,4,6,7};
		int len=numbers.length;
		
		Arrays.sort(numbers);
		//System.out.println(numbers);
		for(int i=0;i<numbers.length;i++)
		{
			//int num=number[i];
			System.out.println(numbers[i]);
		}
	

	}

}
