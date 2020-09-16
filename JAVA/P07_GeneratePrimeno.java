/******************************************************************************

Generate prime no.
*******************************************************************************/
import java.util.*;
public class Main{  
 public static void main(String args[]){  
  System.out.println("Enter n : ");
  Scanner input = new Scanner(System.in);
  int n=input.nextInt();  
  System.out.print("Result :  ");
  for(int i=1;i<=n;i++)
  {
      checkprime(i);
  }
}  
public static void checkprime(int n){    
    
  int i,flag=0;
  int m=n/2;      
    if(n==0||n==1){ flag = 1;}
   for(i=2;i<=m;i++){      
    if(n%i==0){      
        flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.print(n + " "); }  
   
}    
}   