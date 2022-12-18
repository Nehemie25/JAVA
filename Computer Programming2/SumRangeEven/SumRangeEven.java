import java.util.Scanner;
public class SumRangeEven
{
     public static void main (String [] args)
     {
          int n = 0, total = 0;
          Scanner scan = new Scanner (System.in);
             
          System.out.print ("Even summation from 1 to n:  ");
          n = scan.nextInt();
          
          for (int i = 1; i <= n ; i++)
          {
               total += 2;
          }
          System.out.printf ("Sum: %d", total);
     }

}
               
          