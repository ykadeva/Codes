/******************************************************************************

Display Multiplication Table
*******************************************************************************/
import java.util.*;
public class Main{
      public static void main(String args[]){
          System.out.println("Enter no. to print it's multiplication table : ");
         int i=0,n,multi;
         Scanner input=new Scanner(System.in);
         n= input.nextInt();
         for(i=0;i<=10;i++)
         {
             multi=i*n;
          
           System.out.printf("%d * %d = %d \n ",n,i,multi); 
         }
          
         
         
          
   }
}