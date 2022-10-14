/*
 WAP a for array
 Name = swapnali lote
 date = 14/10/22
 */
package array;
import java.util.Scanner;
public class arrays {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array: ");
		int a=sc.nextInt();
		
		int b[]=new int[a];
		for(int i=0;i<b.length;i++) {
			
	
	
		System.out.print("enter "+i+"number of the array: ");
		int x=sc.nextInt();
		
		b[i]=x;
		}	
		System.out.print("Array is[ ");
		for(int j=0;j<b.length;j++) {
			 
			if(j==(a-1)) {
				System.out.print(b[j]+"  ");
			}else {
				System.out.print(b[j]+" ");
				
				
			}
			 
		}
		 System.out.print(" ]");
	}}
