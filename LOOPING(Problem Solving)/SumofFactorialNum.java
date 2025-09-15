package looping;
import java.util.Scanner;
import java.math.BigInteger;

public class SumofFactorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	6. Sum of factorial of n numbers
		   Sample Input: n = 3, Numbers: 2 3 4
		   Sample Output: 2! + 3! + 4! = 2 + 6 + 24 = 32
	*/
		
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter how many numbers: ");
		        int m = sc.nextInt(); 
		        BigInteger total = BigInteger.ZERO;
		        StringBuilder expr = new StringBuilder();
		        StringBuilder terms = new StringBuilder();

		        for (int i = 0; i < m; i++) {
		            System.out.print("Enter number " + (i + 1) + ": ");
		            int v = sc.nextInt();
		            BigInteger fact = BigInteger.ONE;
		            for (int j = 2; j <= v; j++) fact = fact.multiply(BigInteger.valueOf(j));

		            if (i > 0) {
		                expr.append(" + ");
		                terms.append(" + ");
		            }
		            expr.append(v).append("!");
		            terms.append(fact.toString());
		            total = total.add(fact);
		        }

		        System.out.println(expr.toString() + " = " + terms.toString() + " = " + total.toString());
		        sc.close();
		    }
		}
