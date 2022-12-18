/*PlayingWithRandom: This program highlights the usefulness of Random values in our daily lives :
 * allows us to apply random values in well known subjects of our lives 
 * Author: Nehemie Nguimbous T00694095
 */


import java.util.Scanner;
import java.util.Random;
public class PlayingWithRandom
{
     public static void main (String [] args)
     {
      Random rand  = new Random();     // creation of a new Random object
      String phrase = "AbcDE-12345_!@#$%";     // creation and initialization of a String object
      
      // direct integration of our different random values in our printf method 
      
      System.out.printf(" Game score:  %d ", (rand.nextInt( 120 -20 + 1) + 20));  // display a random score between 20 and 120
      
      
      System.out.printf("\n Answer is:  %b ", rand.nextBoolean());     // choose randomly between True and  False
      
      System.out.printf("\n Roll:  %d" , (rand.nextInt(6-1+ 1)+1));     // dice's game : choose randomly integers between 1 and 6
      
      
      System.out.printf("\n Temperature:  %.2f C " , (rand.nextDouble()*(300 +200 +1) -200) );     //choose randomly a temperature between -200 and 300
      
      
      System.out.printf("\n Letter:  %c ", (char)((rand.nextInt('Z' - 'A' + 1) + 'A')));     // choose randomly a letter 
      System.out.printf("\n Symbol (in phrase):  %c ", phrase.charAt(rand.nextInt(phrase.length())));     // choose randomly a symbol in the phrase String
     }
}