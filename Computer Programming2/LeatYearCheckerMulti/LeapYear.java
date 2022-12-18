import java.util.Scanner;
public class LeapYearCheckerMulti
{
     public static void main (String [] args)
     {
          int year = 0;
          Scanner scan = new Scanner(System.in);
          final char SENTINEL1 = 'Y', SENTINEL2 = 'N';
          char chrInput =' ';
          
          
          do
          {
          System.out.println ("Ckeck for a leap year, enter a year \n");
          year = scan.nextInt();
          
          if (year < 1582)
          {
               System.out.println ("year before 1582 are invalid");
          }
          else
          {
          if (year % 4 ==0)
          {
               if (year % 100 == 0)
               {
                    if (year % 400 == 0)
                    {
                         System.out.printf ("%d is a leap year", year);
                    }
                    else
                    {
                         System.out.printf ("%d is not a leap year", year);
                    }
               }
               else
               {
                     System.out.printf ("%d is  a leap year", year);
               }
          }
          else
          {
               System.out.printf ("%d is not a leap year", year);
          }
          }
          
          System.out.println ("Check another year? (Y/N)");
          chrInput = scan.next().toUpperCase().charAt (0);
          
          } while (chrInput != 'Y');
     }
}
               
                    
                         
               
                    