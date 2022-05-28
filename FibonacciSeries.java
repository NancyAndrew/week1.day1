package week1.day1;

public class FibonacciSeries {
	
	/*
	 * Goal: to find Fibonacci Series for a given range
	 * 
	 * input(range): 8
	 * Output: 0,1,1,2,3,5,8,13,21,24
	 * 
	 */

	public static void main(String[] args) {
		
		int range= 8, firstNum = 0, secNum = 1, sum=0;
		
		System.out.print(firstNum+",");
		System.out.print(secNum+",");
		
		for (int i=1 ; i<=range; i++)
			
		{sum=firstNum+secNum;
		
		firstNum=secNum;
		secNum=sum;
		System.out.print(sum+",");
			
		}
	}
}
