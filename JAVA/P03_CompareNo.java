import java.util.*;
public class Main
{

	public static void main(String[] args) {
	    System.out.println("Enter the two no. to compare : ");
	    Scanner input = new Scanner(System.in);
	   int n= input.nextInt();
	   int m= input.nextInt();
	    System.out.print("Result : ");
	    if(n==m)
	        System.out.println("Equal ");
	    
	    else
		    System.out.println("Not Equal ");
	}
}
