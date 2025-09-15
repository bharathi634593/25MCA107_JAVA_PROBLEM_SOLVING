package looping;
import java.util.Scanner;
public class SumNum1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	4. Sum of numbers from 1 to n
		   Sample Input: 5
		   Sample Output: 15
    */
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the number: ");
		        int n = sc.nextInt();
		        long sum = 0;
		        for (int i = 1; i <= n; i++) sum += i;
		        System.out.println("Sum = " + sum);
		        sc.close();
		    }
		}


