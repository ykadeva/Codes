/******************************************************************************

Factorial Recursive
*******************************************************************************/
import java.util.*;
public class Main
{
    public static int factorial(int x)
    {
        if(x<=1){
            return 1;
        }
        else 
            return x*factorial(x-1);
    }
	public static void main(String[] args) {
	    System.out.println("Enter no. to find factorial : ");
	    Scanner input = new Scanner(System.in);
	   int n= input.nextInt();
		System.out.println("factorial : "+factorial(n));
	}
}
