import java.util.Scanner;
public class AbsoluteValue
{
     public static void main (String [] args)
     {
         Scanner scan = new Scanner(System.in);
          double number=0, absValue =0;
          System.out.println ("This program calculate the absolute value of any number");
          System.out.println("Enter a number");
          number = scan.nextDouble();
          absValue = (number > 0) ? number : - number;
          
          System.out.printf(" First method the absolute value of %.2f is  %.2f", number , Math.sqrt(number *number));
          
          System.out.printf("\n Second method the absolute value of %.2f is  %.2f", number , Math.sqrt(Math.pow(number, 2)));
           
          System.out.printf("\n Third method the absolute value of %.2f is  %.2f", number , Math.abs(number));
          
          System.out.printf("\n Fourth method the absolute value of %.2f is  %.2f", number , absValue);
          
          
          
     }
}