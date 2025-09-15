package looping;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	3. Multiplication Table of a number
		   Sample Input: 5
		   Sample Output: 5 10 15 20 25 30 35 40 45 50
		   */
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number: ");
		        int x = sc.nextInt();
		        for (int i = 1; i <= 10; i++) {
		            System.out.print(x * i);
		            if (i < 10) System.out.print(" ");
		        }
		        System.out.println();
		        sc.close();
		    }
		}
