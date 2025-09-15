package basic.to.intermediate;

import java.util.Scanner;
public class Q02_SimpleInterest {
	
	
	/**
	 * Write a Java program to calculate Simple Interest using the formula:
 		SI = (P × N × R) / 100
 		Where:
		P = Principal amount
		N = Number of years
		R = Rate of interest
		
		Problem Flow:
		User inputs:
			Principal (P)
			Rate (R)
			Years (N)
		Program calculates:
			SI = (P × N × R) / 100
		Output displays the Simple Interest value.
		
		Input / Output Example:
		Input:
		Enter Principal Amount: 10000  
		Enter Rate of Interest: 5  
		Enter No. of Years: 2
		Output:
		Simple Interest = 1000.00
	 */
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	int p,n,r;
	float si;
	System.out.println("Enter Principal Amount");
	p=sc.nextInt();
	System.out.println("enter Rate of Interest:");
	r=sc.nextInt();
	System.out.println("Enter no. of years:");
	n=sc.nextInt();
	si=(p * n * r / 100);
	System.out.println("output");
	System.out.printf("Simple Interest =%.2f ",+si);
	
	}

}