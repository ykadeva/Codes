/******************************************************************************

float

*******************************************************************************/
import java.util.*;
public class Main{
   
 public static void main(String args[]){
    float i;
    int j,k;
  System.out.println("Enter float : ");
  Scanner input = new Scanner(System.in);
  i=input.nextFloat();
j=(int)i;
if(j>i){
    k=j-1;
    System.out.print(k+"<"+i+"<"+j);
}
else
{k=j+1;
    System.out.print(j+" < "+i+" < "+k);}
 }}