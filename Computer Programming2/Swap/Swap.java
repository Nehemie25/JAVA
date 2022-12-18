import java.util.Scanner;
public class Swap
{
     public static void main (String [] args)
     {
          Scanner scan = new Scanner (System.in);
          double a = 0.0, b = 0.0, c=0.0;
          System.out.print ("Enter a and b :");
          a = scan.nextDouble();
          b = scan.nextDouble();
         
          if (a == b)
          {
               System.out.println ("\n Same values");
          }
          else
          {
              System.out.printf ("\n Orig :  %.2f  %.2f", a, b);
              c = a;
              a = b;
              b = c;
              System.out.printf ("\n Swap :  %.2f  %.2f", a, b);
          }
     }
}
          
          
          