import java.util.Scanner;
import java.util.Random;
public class RollingDice
{
     public static void main (String [] args)
     {
          char letter1 = 0, letter2 = 0;
          Scanner scan = new Scanner (System.in);
          Random rand = new Random();
          System.out.print ("Guess whitch letter was picked \n");
          letter1 = (char)(rand.nextInt('Z' - 'A' + 1) + 'A');
          letter2 = scan.next().toUpperCase().charAt(0);
  
          if (letter1 == letter2)
          {
               System.out.println ("Exellent guess, you got it");
          }
          if (letter1 > letter2)
          {
               
            System.out.printf ("\nNope. The letter is after the guess : %c", letter1);
          }
          if (letter1 < letter2)
          {
             System.out.printf ("\nNope. The letter is before the guess : %c", letter1);
          }
     }
}
     
          