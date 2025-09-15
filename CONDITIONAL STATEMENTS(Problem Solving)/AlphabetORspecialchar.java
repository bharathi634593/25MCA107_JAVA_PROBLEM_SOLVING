package conditional_statements;
import java.util.Scanner;
public class AlphabetORspecialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3. Alphabet, Number, or Special Character
		   Identify the type of the character.
		   Sample Input: @
		   Sample Output: Special Character*/
	

		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the value:");
		        char ch = sc.next().charAt(0);

		        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		            System.out.println("Alphabet");
		        else if (ch >= '0' && ch <= '9')
		            System.out.println("Number");
		        else
		            System.out.println("Special Character");
		    }
		}

	