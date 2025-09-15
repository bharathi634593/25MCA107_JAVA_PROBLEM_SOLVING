package conditional_statements;
import java.util.Scanner;
public class BuildCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		9. Switch Case Calculator
		   Build a calculator using switch case.
		   Sample Input: 5 + 2
		   Sample Output: 7
*/
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter first number: ");
		        int a = sc.nextInt();
		        System.out.println("Enter operator (+, -, *, /, %): ");
		        char op = sc.next().charAt(0);
		        System.out.println("Enter second number: ");
		        int b = sc.nextInt();

		        switch (op) {
		            case '+': System.out.println("Result = " + (a + b)); break;
		            case '-': System.out.println("Result = " + (a - b)); break;
		            case '*': System.out.println("Result = " + (a * b)); break;
		            case '/': 
		                if (b != 0) System.out.println("Result = " + (a / b)); 
		                else System.out.println("Division by zero not allowed");
		                break;
		            case '%': 
		                if (b != 0) System.out.println("Result = " + (a % b)); 
		                else System.out.println("Modulo by zero not allowed");
		                break;
		            default: System.out.println("Invalid Operator");
		        }
		    }
		}
	