/*
  program to demonstrate do while and print the reverse counting from the user input number
 name : swapnali lote.
 date : 12/10/2022.
 */


package dowhile_loop;
import java.util.Scanner;
public class dowhile {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter Number");
	  int a = input.nextInt();
	  
	  do
	  {
		  System.out.println(a);
		  a--;
	  }  
	  while(a>0);
	  
	  
	  }
}

