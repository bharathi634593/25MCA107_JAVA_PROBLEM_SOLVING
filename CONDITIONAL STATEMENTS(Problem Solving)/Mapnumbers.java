package conditional_statements;
import java.util.Scanner;
public class Mapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	5. Print Day based on input (1-7)
		   Map numbers 1-7 to days of the week.
		   Sample Input: 3
		   Sample Output: Wednesday
*/

		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter day number (1-7): ");
		        int day = sc.nextInt();

		        if (day == 1) System.out.println("Monday");
		        else if (day == 2) System.out.println("Tuesday");
		        else if (day == 3) System.out.println("Wednesday");
		        else if (day == 4) System.out.println("Thursday");
		        else if (day == 5) System.out.println("Friday");
		        else if (day == 6) System.out.println("Saturday");
		        else if (day == 7) System.out.println("Sunday");
		        else System.out.println("Invalid Day");
		    }
		}
	