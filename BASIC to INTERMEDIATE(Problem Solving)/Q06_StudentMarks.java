package basic.to.intermediate;

import java.util.Scanner;

public class Q06_StudentMarks {
	
	/**
	 * This program allows the user to enter 3 test marks of a student, 
	 calculates the total and average, and displays the result.
	 
	Problem Flow:
	Get 3 marks from user
	Add marks → total
	Divide total by 3.0 → average
	Display total and average
	
	Input / Output Example:
	Input:
	Enter Mark 1: 80  
	Enter Mark 2: 75  
	Enter Mark 3: 85  
	Output:
	Total Marks   = 240  
	Average Marks = 80.0
	 */
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter mark 1:");
		a=sc.nextInt();
		System.out.println("enter mark 2:");
		b=sc.nextInt();
		System.out.println("enter mark 3:");
        c=sc.nextInt();
        int t=a+b+c;
        float avg=t/3;
        System.out.println("Total marks= "+t);
        System.out.println("Average= "+avg);
        
		
	}
}