/******************************************************************************

Palindrome number
*******************************************************************************/
import java.util.*;
public class Main{  
 public static void main(String args[]){  
  int r,sum=0,temp;
  System.out.println("Enter the number : ");
  Scanner input = new Scanner(System.in);
  int n=input.nextInt();  
  System.out.print("Result :  ");
  temp=n;    
  while(n>0){    
   r=n%10;   
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("Palindrome number ");    
  else    
   System.out.println("Not palindrome");    
}  
}  