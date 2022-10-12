
/*
  program to demonstrate while loop continues until entered number is positive
 name : swapnali lote
 date : 12/10/2022
 */

package Whileloop;

import java.util.Scanner;

public class While_loop {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);		
		
		while(true)
		{
			System.out.println("Enter number: ");
			int num= sc.nextInt();
			
			if(num<0)
			{
				System.out.println("core java");
				break;
			}

			
		}
		
	}

}


