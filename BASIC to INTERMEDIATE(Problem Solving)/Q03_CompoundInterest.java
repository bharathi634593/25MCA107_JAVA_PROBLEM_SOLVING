package basic.to.intermediate;

import java.util.Scanner;

public class Q03_CompoundInterest {
	
	/**
	 * This program calculates Compound Interest using the formula:
 		F = P × (1 + i)ⁿ
 		Where:
			P = Principal amount
			i = Rate/100
			n = Number of years
 			Here, F is the final amount (principal + interest)
	
		 Problem Flow:
		Input P, R, and N from user
		Calculate i = R / 100
		Use formula F = P × (1 + i)^N
		Display the final compound amount
		
		Input / Output Example:
		Input:
		Enter Principal Value: 10000  
		Enter Rate of Interest: 10  
		Enter No. of Years: 2
		Output:
		Compound Interest 12100.00
	 */
	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
int p,r,n;
float f;
double i;
System.out.println("enter principal amount:");
p=sc.nextInt();
System.out.println("enter rate of interest:");
r=sc.nextInt();
System.out.println("enter no. of years:");
n=sc.nextInt();
i=r / 100.0;
f=(float) (p *(Math.pow(i+1, n)));
System.out.printf("compound interest  %.2f",f);
sc.close();

}
}