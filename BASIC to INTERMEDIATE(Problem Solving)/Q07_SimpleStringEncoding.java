package basic.to.intermediate;

import java.util.Scanner;

public class Q07_SimpleStringEncoding {
	
	/**
	 * This program reads a five-letter word from the user and encodes 
	 it by subtracting 1 from the ASCII value of each character. 
	 It then prints the newly encoded word.
	 
	 Problem Flow:
	Get 5-letter word input
	Loop each character → subtract 1 from ASCII
	Build new string with changed characters
	Print encoded result
	
	Input / Output Example:
	Input:
	Enter a Five letter word: white
	Output:
	Encoded Word: vghsd
	 */
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    
	    System.out.println("enter a five letter word: ");
	    String a=sc.nextLine();
	    String count="";
	    for(int i=0;i<a.length();i++)
	    {
	    	char c=a.charAt(i);
	    	char encode=(char)(c-1);
	    	count=count+encode;
	    	
	    }
	    System.out.println("Encoded word:"+ count);
	    
		
	}

}