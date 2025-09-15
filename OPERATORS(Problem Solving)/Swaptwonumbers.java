package operator;
import java.util.Scanner;
public class Swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//4. Swap two numbers using a temporary variable
  // Write a program to swap two integers using a temporary variable.*
   //Sample Input: a = 5, b = 10
   //Sample Output: a = 10, b = 5

		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first number (a): ");
		        int a = sc.nextInt();

		        System.out.print("Enter second number (b): ");
		        int b = sc.nextInt();

		        int temp = a;
		        a = b;
		        b = temp;

		        System.out.println("After swapping: a = " + a + ", b = " + b);
		    }
		}
