/******************************************************************************

Sum integers greater than 100 and less than 200 that are divisible 7
*******************************************************************************/

public class Main{
      public static void main(String args[]){
         
          int sum=0,i;
          for(i=100;i<200;i++)
          {
              if(i%7==0){
                  sum=sum+i;
              }
          }
           System.out.print("Sum integers greater than 100 and less than 200 that are divisible 7 = "+sum);
   }
}