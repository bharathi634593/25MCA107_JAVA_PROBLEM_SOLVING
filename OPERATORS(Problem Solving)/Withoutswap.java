package operator;
import java.util.Scanner;
public class Withoutswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5. Swap two numbers without using a temporary variable
		  // Write a program to swap two integers without using a temporary variable.*
		  // Sample Input: a = 5, b = 10
		   //Sample Output: a = 10, b = 5*/


		

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first number (a): ");
		        int a = sc.nextInt();

		        System.out.print("Enter second number (b): ");
		        int b = sc.nextInt();

		        a = a + b; 
		        b = a - b; 
		        a = a - b; 

		        System.out.println("After swapping: a = " + a + ", b = " + b);
		    }
		
	}


