import java.util.Scanner;
public class Extremum
{
     public static void main (String [] args)
     {
          Scanner scan = new Scanner (System.in);
          double val1 = 0, val2 = 0, val3 = 0;
          System.out.print("Enter three numbers of your choice  ");
          val1 = scan.nextDouble();
          val2 = scan.nextDouble();
          val3 = scan.nextDouble();
          System.out.printf ("the maximum number between the 3 entered values is %.2f and the minimum number is %.2f ", Math.max( val3, Math.max(val1, val2)), Math.min( val3, Math.min(val1, val2)) );
     }
}