package operator;

import java.util.Scanner;
public class AlphabetorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3. Check if a character is an alphabet or not
		   Write a program to check whether the given character is an alphabet.*
		   Sample Input: A
		   Sample Output: Alphabet
          */
		
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a character: ");
		        char ch = sc.next().charAt(0);

		        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
		            System.out.println("Alphabet");
		        } else {
		            System.out.println("Not an Alphabet");
		        }
		    }
		
}
