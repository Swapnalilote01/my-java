
/*
 print sum of 10 natural number using while loop.
   name : swapnali lote 
  date : 13/10/2022.
 */

package Natural_number;
import java.util.Scanner;
public class Number {
public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);//user defined.	
			
			int n = 0;
			int p;
			int q=1;
			while(q<=10)//using while loop.
			{
				System.out.print("enter number:");//enter any number.
				p = sc.nextInt();
				if(p<=0) {
					
				}else {
				
					n=n+p;
				}
				q++;
			}
			System.out.println();
			System.out.println("sum of natural number is");//input defined.
			System.out.println(n);
		
		}}
	

