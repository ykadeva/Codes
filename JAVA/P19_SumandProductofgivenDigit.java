/******************************************************************************

Sum and Product of a given Digit
*******************************************************************************/
import java.util.*;
public class Main{
      public static void main(String args[]){
          System.out.println("Enter Digit: ");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();        
            int temp = num,result=0;
            while(temp>0){
               result = result + temp;
               temp--;
            }
   System.out.println("Sum of Digit for " +num+ " is : "+result);
            temp = num;
            result = 1;
            while(temp > 0){
                 result = result * temp;
                 temp--;
            }
System.out.println("Product of Digit for "+num+" is : "+result);
   }
}