package operator;

import java.util.Scanner;

public class Oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6. Check whether a number is odd or even
		  // Write a program to check if the given integer is odd or even.*
		   //Sample Input: 7
		   //Sample Output: Odd

	    
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter an integer: ");
		        int num = sc.nextInt();

		        if (num % 2 == 0) {
		            System.out.println("Even");
		        } else {
		            System.out.println("Odd");
		        }
		   
	}

}
