package conditional_statements;
import java.util.Scanner; class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	1. Odd or Even
		   Check whether the number is odd or even.
		   Sample Input: 10
		   Sample Output: Even
    */

		        Scanner sc = new Scanner(System.in);

		        // User-friendly message
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        if (num % 2 == 0) {
		            System.out.println("Even");
		        } else {
		            System.out.println("Odd");
		        }

		        sc.close();
		    }
}
