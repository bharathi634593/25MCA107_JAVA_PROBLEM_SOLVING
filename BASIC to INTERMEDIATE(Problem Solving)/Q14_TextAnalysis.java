package basic.to.intermediate;

import java.util.Scanner;

public class Q14_TextAnalysis {
	
	/**
	 *  This program will read a line of text from the user, analyze 
	 each character, and count how many are letters, digits, whitespace, 
	 or other types of characters (like punctuation).
	 
	 Problem Flow:
	Prompt the user to input a line of text.
	Initialize counters for letters, digits, spaces, and other characters.
	Loop through each character and classify it into one of the categories.
	Display the count for each category: letters, digits, spaces, and others.

	Sample Input / Output:
	Input:
	Enter the text below:
	Hello World! 123

	Output:
	Letters : 10
	Digits : 3
	Space Chars : 2
	Others : 2

	 */
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the text below:");
	String a=sc.nextLine();
	int l=0;
	int d=0;
	int s=0;
	int others=0;
	for(int i=0;i<a.length();i++)
	{
		char ch=a.charAt(i);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			l++;
		}
		else if(ch>='0' && ch<='9')
		{
			d++;
		}
		else if(ch==' ')
		{
			s++;
		}
		else
		{
			others++;
		}
	}
	System.out.println("Output:");
	System.out.println("Letters :"+l);
	System.out.println("Digits :"+d);
	System.out.println("space chars :"+s);
	System.out.println("others :"+others);
}
}