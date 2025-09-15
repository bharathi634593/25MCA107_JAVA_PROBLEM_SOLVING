package conditional_statements;
import java.util.Scanner;
public class Check_HH_MM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*8. Validate Time
		   Check if time is valid in HH\:MM format.
		   Sample Input: 13:45
		   Sample Output: Valid Time
*/
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter time (HH:MM): ");
		        String time = sc.next();

		        String[] parts = time.split(":");
		        int h = Integer.parseInt(parts[0]);
		        int m = Integer.parseInt(parts[1]);

		        if (h >= 0 && h <= 23 && m >= 0 && m <= 59)
		            System.out.println("Valid Time");
		        else
		            System.out.println("Invalid Time");
		    }
		}
