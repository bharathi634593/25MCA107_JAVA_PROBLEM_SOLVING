package conditional_statements;
import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	4. Check Leap Year or Not
		   Check if a given year is a leap year.
		   Sample Input: 2024
		   Sample Output: Leap Year
*/
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the year:");
		        int year = sc.nextInt();

		        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
		            System.out.println("Leap Year");
		        else
		            System.out.println("Not a Leap Year");
		    }
		}

