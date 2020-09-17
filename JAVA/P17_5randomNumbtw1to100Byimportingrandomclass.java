/******************************************************************************

5 random no. by importing random class.


*******************************************************************************/
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
	    int max = 100,min = 1;
       Random randomNum = new Random();
       for(int i=1;i<=5;i++){
       int randomno = min + randomNum.nextInt(max);
		System.out.println(randomno);}
	}
}
