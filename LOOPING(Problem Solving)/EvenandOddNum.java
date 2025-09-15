package looping;
import java.util.Scanner;
public class EvenandOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		2. Print all odd and even numbers up to n
		   Sample Input: 10
		   Sample Output: Odd: 1 3 5 7 9, Even: 2 4 6 8 10
    */
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the number: ");
		        int n = sc.nextInt();

		        System.out.print("Odd: ");
		        boolean first = true;
		        for (int i = 1; i <= n; i += 2) {
		            if (!first) System.out.print(" ");
		            System.out.print(i);
		            first = false;
		        }

		        System.out.print(", Even: ");
		        first = true;
		        for (int i = 2; i <= n; i += 2) {
		            if (!first) System.out.print(" ");
		            System.out.print(i);
		            first = false;
		        }
		        System.out.println();
		        sc.close();
		    }
		}


