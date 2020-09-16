import java.util.*;
public class Main
{
   

	public static void main(String[] args) {
	    System.out.println("Enter no. of Terms : ");
	    int a=0,b=1,next=0;
	    Scanner input = new Scanner(System.in);
	   int n= input.nextInt();
	   System.out.print("Fibonacci Series: ");
	   for (int i = 1; i <= n; ++i) 
	   {
         System.out.print(a + " ");
        next = a + b;
        a = b;
        b = next;
        }}}