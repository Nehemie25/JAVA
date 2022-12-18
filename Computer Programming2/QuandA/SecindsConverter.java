import java.util.Scanner;
public class SecindsConverter
{
     public static void main (String [] args)
     {
          int hours = 0, minutes = 0, seconds = 0, imputSeconds = 0;
          Scanner scan = new Scanner (System.in);
          System.out.println("Enter the number of seconds you want to convert");
          imputSeconds = scan.nextInt();
          hours = imputSeconds / 3600;
          minutes = (imputSeconds % 3600) / 60;
          seconds = (imputSeconds % 3600) % 60;
           System.out.printf(" %d  seconds corresponds to %d hours  %d minutes and %d seconds ", imputSeconds, hours, minutes, seconds);
     }
}
          
          
          
          