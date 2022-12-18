import java.util.Scanner;
public class LeapYearCheckerRange
{
     public static void main (String [] args)
     {
          int startYear = 0, endYear = 0;
          Scanner scan = new Scanner(System.in);
          final char SENTINEL1 = 'Y', SENTINEL2 = 'N';
          char chrInput =' ';
          
          
    
          System.out.println ("Check for leap years, start and end years:\n");
          startYear = scan.nextInt();
          endYear = scan.nextInt();
          
          for (int year = startYear; year <= endYear; year++)
          {
          
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
          
          System.out.println (" \n Check another year? (Y/N)");
          chrInput = scan.next().toUpperCase().charAt (0);
          
          }
     }
}
               
                    
                         
               
                    