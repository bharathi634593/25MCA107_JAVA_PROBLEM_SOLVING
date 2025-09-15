package operator;

import java.util.Scanner;


public class ternary {

	public static void main(String[] args) {
		  
		/*1. Find maximum of 2, 3, and 4 numbers using ternary operator
		   Write a program to determine the maximum among 2, 3, and 4     integers using ternary operator.*
		   Sample Input: 5 8 3 10
		   Sample Output: Maximum: 10*/
		
		Scanner sc = new Scanner(System.in);
			       
			        System.out.print("Enter 4 integers: ");
			        int a = sc.nextInt();
			        int b = sc.nextInt();
			        int c = sc.nextInt();
			        int d = sc.nextInt();

			       
			        int max2 = (a > b) ? a : b;

			        
			        int max3 = (max2 > c) ? max2 : c;

			   
			        int max4 = (max3 > d) ? max3 : d;

			        System.out.println("Maximum: " + max4);

			    
			}
}
