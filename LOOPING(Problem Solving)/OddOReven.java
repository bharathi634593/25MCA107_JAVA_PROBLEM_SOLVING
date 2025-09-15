package looping;
import java.util.Scanner;
public class OddOReven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	7. Sum of Even and Odd numbers separately
		   Sample Input: 10
		   Sample Output: Sum of Even = 30, Sum of Odd = 25
	*/
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the number: ");
		        int n = sc.nextInt();
		        long sumEven = 0, sumOdd = 0;
		        for (int i = 1; i <= n; i++) {
		            if (i % 2 == 0) sumEven += i;
		            else sumOdd += i;
		        }
		        System.out.println("Sum of Even = " + sumEven + ", Sum of Odd = " + sumOdd);
		        sc.close();
		    }
		}
