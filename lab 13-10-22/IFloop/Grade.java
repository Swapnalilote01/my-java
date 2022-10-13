/*
   demonstrate on nested if take the input from the users.
  name : swapnali lote 
  date : 13/10/2022.
 */
package IFloop;

import java.util.Scanner;

public class Grade {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter Number");
		int percentage = input.nextInt();
		String grade = input.nextLine();
		
		if (percentage >= 90) {
			grade = "O";	
		}
		else if(percentage >= 84) {
			grade = "A";
			
		}
		else if(percentage >= 74) {
			grade = "B";
			
		}
		else if(percentage >= 64) {
			grade = "C";
		}
		
		else if(percentage >= 42) {
			grade = "C";
		}
		
		else if(percentage <= 34) {
			grade = "F";
			
	}
		System.out.println("the grade is" + grade);
		

	}
}



