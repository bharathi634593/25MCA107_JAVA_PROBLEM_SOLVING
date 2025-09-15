package basic.to.intermediate;

import java.util.Scanner;

public class Q08_SumOfOddIntegers {
	
	/**
	 * This program calculates the sum of the first n odd integers 
	 (Example: 1 + 3 + 5 + ... + (2n - 1)).
	 
	 Problem Flow:
	Input n from user
	Loop from 1 to (2n−1) in steps of 2
	Accumulate the sum
	Print the result
	
	Input / Output Example:
	Input:
	Enter how many odd numbers to sum: 5
	Output:
	Sum of first 5 odd numbers is 25
	(1 + 3 + 5 + 7 + 9 = 25)

	 */
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.println("enter how many odd numbers to sum: ");
	    int n=sc.nextInt();
	    for(int i=1;i<=2*n-1;i+=2)
	    {
	    	c=c+i;
	    	 
	    }
	    System.out.printf("sum of first 5 odd numbers is  %d",c);
	    }

}