public class CalculatePi
{
     public static void main (String [] args)
     {
          long n = 12444;
          double firstPi = 0, secondPi = 0;
          
          for (int k = 0; k <= n; k++)
          {
               firstPi += 4*( Math.pow (-1, k) / (double)(2*k + 1));
          }
          
          for (int k = 0; k <= n; k++)
          {
               secondPi += ( 1/ (float)(Math.pow (16, k)) * ( (4 / (float)(8*k + 1)) - (2 /( float)(8*k + 4)) - (1 / (float)(8*k + 5)) - (1 / (float)(8*k + 6)) ));
          }
          
          
          System.out.printf ("Gregory–Leibniz pi value is  %f\n", firstPi);
          System.out.printf ("Bailey–Borwein–Plouffe pi value is  %f", secondPi);
          
     }
}