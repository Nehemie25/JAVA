import java.util.Scanner;
public class UpdateMaxOrMin
{
     public static void main (String [] args)
     {
          Scanner scan = new Scanner (System.in);
          double val1 = 0, val2 = 0, val3 = 0, max = 0, min = 0;
          System.out.print ("Hi user, ineed three numbers:");
          val1 = scan.nextDouble();
          val2 = scan.nextDouble();
          val3 = scan.nextDouble();
          
          min = (val1 <val2) ? val1 : val2;
          min = (min <val3) ? min : val3;
          
          max = (val1 > val2) ? val1 : val2;
          max = (max > val3) ? max : val3;
          
          
          System.out.printf("\n the minimum is %.2f ", min);
          System.out.printf("\n the maximum is %.2f ", max);
     }
}