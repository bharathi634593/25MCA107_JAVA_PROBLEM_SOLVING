package conditional_statements;
import java.util.Scanner;
public class Trianglecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6. Check if 3 sides form a Triangle
		   Check triangle condition: a + b > c, etc.
		   Sample Input: 3 4 5
		   Sample Output: Triangle is possible
		   */
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter three sides of triangle: ");
		        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

		        if (a + b > c && a + c > b && b + c > a)
		            System.out.println("Triangle is possible");
		        else
		            System.out.println("Triangle is not possible");
		    }
		}

