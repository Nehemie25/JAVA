/* BaileyPi: Approximation of the value of pi using the Bailey�Borwein�Plouffe algorithm
 * Author: Nehemie Nguimbous T00694095
 */
public class BaileyPi
{
     public static void main (String [] args)
     {
          long n = 12;          //  number of terms
          double piValue = 0;      // will store the approximate value of pi
          
          // will approximate the value of pi using the Bailey�Borwein�Plouffe algorithm
          
          for (int k = 0; k <= n; k++)  // this forloop will run n+1 times 
          {
               //  will add to the piValue variable the value of this formula n+1 times
               piValue += ( 1/ (double)(Math.pow (16, k)) * ( (4 / (double)(8*k + 1)) - (2 /(double)(8*k + 4)) - (1 / (double)(8*k + 5)) - (1 / (double)(8*k + 6)) ));
          }
          
          
          System.out.printf ("%d terms:  %.16f\n", n,  piValue);   // displays the result of the piValue approximation 
     }
}