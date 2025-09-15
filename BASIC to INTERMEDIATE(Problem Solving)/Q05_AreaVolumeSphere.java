package basic.to.intermediate;

import java.util.Scanner;

public class Q05_AreaVolumeSphere {
	
	/**
	 *  This program calculates the Volume and Surface Area of a sphere 
	 *  using the following formulas:
			Volume (V) = (4/3) × π × r³
			Area (A) = 4 × π × r²
	
	Problem Flow:
	Get r (radius) from user
	Calculate area using A = 4πr²
	Calculate volume using V = (4/3)πr³
	Display both values
	
	 Input / Output Example:
	Input:
	Enter Radius of Sphere: 7
	Output:
	Volume of Sphere: 1436.571429
	Area of Sphere  : 615.428571
	
	 */
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double r;
		double v,a;
		System.out.println("enter radius of sphere");
		r=sc.nextDouble();
		v=1.33*3.14*( r * r * r);
		a=4 * 3.14 * (r * r);
		System.out.println("output:");
		System.out.printf("Volume of sphere :%.6f \n",v);
		System.out.printf("Area of sphere : %.6f",a);
	}

}