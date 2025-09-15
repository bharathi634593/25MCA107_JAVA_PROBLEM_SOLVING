package basic.to.intermediate;

import java.util.Scanner;

public class Q04_Fahrenheit2Celsius {
	
	/**
	 * This program converts temperature from Fahrenheit to Celsius using the formula:
		C = (5/9) × (F - 32)
		
	Problem Flow:
	Input temperature in Fahrenheit
	Apply formula: C = (5 / 9.0) × (F - 32)
	Display result in Celsius
	
	Input / Output Example:
	Sample Inputs to Test (from question):
	68, 150, 212, 0, -22
	Sample Output (for 68°F):
	68.000000 deg F is 20.000000 deg C
	
	 */
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	double f,c;
	System.out.println("enter fahrenheit");
	f=sc.nextFloat();
	c=(5/9.0) * (f-32);
	System.out.println("output:");
	System.out.printf("%.6f def f is %.6f deg c",f,c);
}
}