/*
 create a program for calculator.read three values from the user for operation
 first and second values as operands.
 third values as operator.
 if user press1=>print addition of first and second
 if user press2=>print subtraction of first and second
 if user press3=>print multiplication of first and second
 if user press4=>print division of first and second

  Name : Swapnali Lote
  date : 06/10/2022
  */

package operator;

public class Calculation {
	public static void main(String[]args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// taking first value from user
		System.out.print("enter the 1st number : ");
		double a = sc.nextInt();
	
		// taking second value from user
		System.out.print("enter the 2st number : ");
		double b = sc.nextInt();
		
		System.out.println("enter 1 to add  ");
		
		System.out.println("enter 2 to divide ");
		
		System.out.println("enter 3 to multiply ");
		
		System.out.println("enter 4 to subract ");
		
		int c = sc.nextInt();
		
		// use if else
		if(c==1) {
			System.out.println(a +b);
		}
	
		else if(c==2) {
			System.out.println(a /b);
		}
		else if(c==3) {
			System.out.println(a *b);
		}
		else if(c==4) {
			System.out.println(a -b);
		}
		else {
			System.out.println("invalid input");
			
		}
		
	
	
	
	
	
	
	
	
	}
	

}
