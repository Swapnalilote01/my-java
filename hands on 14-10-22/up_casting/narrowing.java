/*
 wap a narrowing up_casting
 Name = swapnali lote
 Name = 14/10/22
 */
package up_casting;
import java.util.Scanner;
public class narrowing {
	public static void main(String[]args) {
		double d;
		Scanner input=new Scanner(System.in);
		System.out.println("enter");
		d=input.nextInt();
		//explicit type casting required.
		long l=(long)d;
		//	//explicit type casting required.
		int i=(int)l;
		System.out.println("long value: " +l);
		System.out.println("int value: " +i);
		}
	

}