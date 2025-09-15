package operator;

import java.util.Scanner;
public class PosORneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*2. Check if a given integer is positive or negative
   Write a program to check whether the given integer is positive, negative, or zero.*
   Sample Input: -12
   Sample Output: Negative*/

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter an integer: ");
		        int num = sc.nextInt();

		        if (num > 0) {
		            System.out.println("Positive");
		        } else if (num < 0) {
		            System.out.println("Negative");
		        } else {
		            System.out.println("Zero");
		        }
		    
		}
	}


