/******************************************************************************

Revered Pyramid
*******************************************************************************/
import java.util.*;
public class Main{
    public static void space(int x){
        for(int i=0;i<=x;i++){
            System.out.print(" ");
        }
    }
 public static void main(String args[]){
    int i=0,j=0;
  System.out.println("Enter height : ");
  Scanner input = new Scanner(System.in);
  int n=input.nextInt();  
  for(i=n;i>=1;i--){
      space(n-i);
      for(j=1;j<=i;j++){
      System.out.print("* ");
      
      }
      System.out.println("");
      }
  }}