/******************************************************************************

 Program to Swap the values.

*******************************************************************************/
import java.util.*;

public class Main{
 
 public static void main(String[] args) {
     Scanner X = new Scanner(System.in);
     System.out.println("Enter two no.s");
   int a, b, temp;
   a = X.nextInt();
   b = X.nextInt();
   System.out.println("Before swapping : a, b = "+a+", "+ + b);
   temp = a;
   a = b;
   b = temp;   
  System.out.println("After swapping : a, b = "+a+", "+ + b);
 }
 }