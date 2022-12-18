import java.util.Scanner;
import java.util.Random;
public class GuessingGame
{
     public static void main (String [] args)
     {
          String phrase = "";
          char letter1 = 0, letter2 = 0;
          int pos1 = 0, pos2 = 0, maxPlays = 0, play = 1;
          Scanner scan = new Scanner (System.in);
          Random rand = new Random();
          System.out.println ("Enter the guessing phrase");
          phrase = scan.nextLine().toUpperCase();
          phrase = phrase.replace (" ", "");
          maxPlays = (phrase.length() /2) - 1;
          pos1 = rand.nextInt (phrase.length());
          letter1 = phrase.charAt (pos1);
          
          while (letter1 != letter2 && play <= maxPlays)
          {
              
               System.out.printf ("Play %d: Guess which letter was picked", play);
               letter2 = scan.next().toUpperCase().charAt(0);
               pos2 = phrase.indexOf(letter2);
               if (pos2 == -1)
               {
                    System.out.println ("That is not a valid symbol");
               }
               else
               {
                    
                    
                    if (letter1 == letter2)
                    {
                         System.out.println ("Exellent guess, you got it");
                    }
                    else
                    {
                         phrase = phrase.replace ("" +letter2, "");
                         System.out.println (phrase);
                         if (pos1 > pos2)
                         {
                              System.out.printf ("Nope. The letter is before the guess %n");
                              play++;
                         }
                         else 
                         {
                              System.out.printf ("Nope. The letter is after the guess %n");
                              play++;
                         }
                    }
               }
               
          }
          if (letter1 != letter2)
          {
               System.out.printf ("The correct letter was %c ", letter1);
          }
     }
}
