public class Fibonacci
{
     public static void main (String [] args)
     {
          int [] fib = new int[10000];
          fib[0] = 0;
          fib[1] = 1;
          for (int i = 2; i < fib.length; i++)
          {
               fib [i] = fib [i-1] + fib [i-2];
          }
          for (int j = 0; j < fib.length; j++)
          {
               System.out.printf ("%4d -  %-4d %n", j, fib [j]);
          }
     }
}
          