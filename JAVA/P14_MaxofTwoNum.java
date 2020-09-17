/******************************************************************************

Max of two no.

*******************************************************************************/
import java.util.*;
public class Main{
   
 public static void main(String args[]){
    int i,j;
  System.out.println("Enter two no. : ");
  Scanner input = new Scanner(System.in);
  i=input.nextInt();
  j=input.nextInt();
  System.out.print("Maximum : ");
  if(i>j){
      System.out.println(i);
      
  }
  else
    System.out.println(j);
    
 }}