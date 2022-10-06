/*
 Question : create a program to find largest of two number
 Name : Swapnali Lote
 date : 6/10/2022
 */


package largenumber;

import java.util.Scanner;

public class Large {
	public static void main(String[]args)
	{
		int numone,numtwo,large;
		Scanner scan = new Scanner(System.in);
		//user defined
		System.out.print("Enter the first number: ");
		numone = scan.nextInt();
		
		
		System.out.print("Enter the second number: ");
		numtwo = scan.nextInt();
		
		if 
		(numone>numtwo)
		large = numone;
		
		else
			large = numtwo;
		 System.out.println("\nlargest = " +large);
	
	
	
	}
}

