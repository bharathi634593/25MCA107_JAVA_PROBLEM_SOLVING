package basic.to.intermediate;

import java.util.Scanner;

public class Q09_SumOfEvenIntegers {
	
	/**
	 * This program finds the sum of even numbers between 2 and 30 (inclusive).
	 	
	 Problem Flow:
	Start loop from 2 to 30
	Check if number is even (i % 2 == 0)
	Add to sum
	Print final sum
	
	 Input / Output Example:
	Output:
	Sum of even numbers from 2 to 30 = 240
	(Even numbers: 2 + 4 + 6 + ... + 30 = 240)
	 */
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int c=0;
		for(int i=2;i<=30;i++)
		{
			if(i%2==0)
			{
				c=c+i;
			}
		}
		System.out.printf("sum of even numbers from 2 tp 30 is %d\n",c);
		System.out.println("(Even numbers: 2 + 4 + 6 + ... + 30 = 240)");
		
	}

}