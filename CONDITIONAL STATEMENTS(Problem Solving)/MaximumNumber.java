package conditional_statements;
import java.util.Scanner;
public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	2. Find maximum of 2, 3, 4 numbers
		   Use if-else ladder or nested if to find the maximum.
		   Sample Input: 7 15 3 9
		   Sample Output: Maximum: 15
    */
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the number:");
		        int a = sc.nextInt(), 
		        		
		        	b = sc.nextInt(), 
		        	c = sc.nextInt(), d = sc.nextInt();

		        int max;
		        if (a >= b && a >= c && a >= d) max = a;
		        else if (b >= c && b >= d) max = b;
		        else if (c >= d) max = c;
		        else max = d;

		        System.out.println("Maximum: " + max);
		    }
		}
	