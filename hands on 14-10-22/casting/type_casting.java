/*
 write a program for type casting.
 Name = swapnali lote
 date = 14/10/22
 */
package casting;
import java.util.Scanner;
public class type_casting {
	public static void main(String[]args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter");
		int i = sc.nextInt();
		
		
		//no explicit type casting required.
		long l=i;
		//no explicit type casting required.
		float f=l;
		
		System.out.println("enter value is: " +i);
		System.out.println("enter  value is: "+l);
		System.out.println("enter  value is: "+f);
		}

}
