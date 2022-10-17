/*
 addition of two matrices.
 Name = swapnali lote
 Date = 17/10/22
 */
package matrix_addition;
import java.util.Scanner;
class Matrix_add{
          public static void main(String []args){
	
         int a, b,i,j;
         Scanner in = new Scanner(System.in);
 
         System.out.println("Enter the number of rows");
         a= in.nextInt();
 
         System.out.println("Enter the number columns");
         b= in.nextInt();
 
         int x[][] = new int[a][b];
         int y[][] = new int[a][b];
         int sum[][] = new int[a][b];
 
         System.out.println("Enter the elements of matrix1");
 
         for (i=0;i<a;i++)
         { 
         for (j=0;j<b;j++)
         x[i][j] = in.nextInt();
         }
         System.out.println("Enter the elements of matrix2");
 
         for (i=0;i<a;i++)
         {
         for (j=0;j<b;j++)
         y[i][j] = in.nextInt();
         }
 
          for (i=0;i<a;i++)
          for (j=0;j<b;j++)
          sum[i][j] = x[i][j] + y[i][j] ; 
 
          System.out.println("Sum of matrices:");
 
            for (i=0;i<a;i++)
           { 
            for (j=0;j<b;j++)
            System.out.print(sum[i][j]+" ");
 
            System.out.println();
}
 
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	