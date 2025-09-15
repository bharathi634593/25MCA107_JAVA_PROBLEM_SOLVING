package looping;
import java.util.Scanner;
public class PrintNum1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	1. Print numbers from 1 to n
		   Sample Input: 5
		   Sample Output: 1 2 3 4 5
    */
	
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the number: ");
		        int n = sc.nextInt();

		        for (int i = 1; i <= n; i++) {
		            System.out.print(i);
		            if (i < n) System.out.print(" ");
		        }
		        System.out.println();
		        sc.close(); // good practice
		    }
		}
		


