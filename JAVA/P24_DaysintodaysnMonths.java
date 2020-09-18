/******************************************************************************

 Days to no. of days and Months

*******************************************************************************/
import java.util.*;

public class Main{
 
 public static void main(String[] args) {
     Scanner X = new Scanner(System.in);
     System.out.print("Enter Days:  ");
   int inputdays, outputdays, outputmonths;
   inputdays = X.nextInt();
   outputmonths=inputdays/30;
   outputdays=inputdays%30;
   System.out.println(inputdays + " days are :  "+outputmonths+" Months & " +outputdays+" days ");
 }
 }