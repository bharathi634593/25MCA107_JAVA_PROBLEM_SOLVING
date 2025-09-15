package looping;
import java.util.Scanner;
public class ProductNum1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	5. Product of numbers from 1 to n (Factorial)
		   Sample Input: 5
		   Sample Output: 120
    */
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the number: ");
		        int n = sc.nextInt();

		        if (n < 0) {
		            System.out.println("Factorial not defined for negative numbers");
		            return;
		        }

		        long fact = 1;
		        for (int i = 1; i <= n; i++) fact *= i;

		        System.out.println("Factorial = " + fact);
		        sc.close();
		    }
		}


