package basic.to.intermediate;

import java.util.Scanner;

public class Q17_IceWaterSteam {
	
	/**
	 *  This program checks the temperature value (temp) and determines 
	 the physical state of water:
		If temp < 0 → "ICE"
		If temp is between 0 and 100 (inclusive) → "WATER"
		If temp > 100 → "STEAM"
		
		Flow Summary:
		Get user input for temperature
		Use if-else to decide the state of water
		Display the result to the user
		
		Sample I/O:
		Input:
		Enter the water temperature: 120
		Output:
		Water status is STEAM for the Temperature 120.00

	 */
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Inout:");
		System.out.println("Enter the water temperature:");
		float t=sc.nextInt();
		System.out.println("Output:");
		if(t<0)
		{
			System.out.printf("Water status is ICE for the Temperature :%.2f",t);
		}
		else if(t>=0 && t<=100)
		{
			System.out.printf("Water status is WATER for the Temperature: %.2f",t);
		}
		else if(t>100)
		{
			System.out.printf("Water status is STEAM for the Temperature :%.2f",t);
			
		}
	}

}