import java.util.Scanner;
public class MaxOrMin
{
     public static void main (String [] args)
     {
          Scanner scan = new Scanner (System.in);
          double val1 = 0, val2 = 0, val3 =0, min = 0, max = 0;
          System.out.print ("Hi user, ineed three numbers:");
          val1 = scan.nextDouble();
          val2 = scan.nextDouble();
          val3 = scan.nextDouble();
          if (val1 < val2 && val1 < val3)
          {
               min = val1;
          }
          else if ( val1 > val2 && val2 < val3)
          {
             min = val2;
          }
          else 
          {
               min = val3;
          }
          
          
          if (val1 > val2 && val1 > val3)
          {
               max = val1;
          }
          else if ( val1 <  val2 && val2 > val3)
          {
             max = val2;
          }
          else 
          {
               max = val3;
          }
          
          
     
     System.out.printf("\n the minimum is %.2f ", min);
     System.out.printf("\n the maximun is %.2f ", max);
     
               
     }
}
          
          
          