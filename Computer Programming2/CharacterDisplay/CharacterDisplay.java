/* CharacterDisplay : Calculate the average ASCII value of all the all the characters within a String entered by the user
 * Author : Nehemie Nguimbous T00694095
 */
import java.util.Scanner;                               // necessary for user input
public class CharacterDisplay
{
     public static void main (String [] args)
     {
          String phrase = "";                           // will contain the user input
          int chrValue = 0, total = 0;                  // will contain the ascii value of each characters and the total value of all
          double average = 0.0;
          Scanner scan = new Scanner (System.in);       // initialise the console input object
          System.out.print ("String to display: ");                // ask the user for the phrase
          phrase = scan.nextLine();                     // store the input in phrase
          
         // goes throught the phrase and stores each of its character
          
          for (int i = 0; i < phrase.length(); i++)     // will run untill it reaches the end of the phrase
          {
               chrValue = (int)(phrase.charAt (i));    // cast and store the i+1 character in  chrValue
               total += chrValue;                      // add each value to total
               
               System.out.printf ("%c - %d %n", phrase.charAt (i), chrValue);     // display each character with its ASCII value
          }
          
          average = ((double)total / phrase.length());     // average value ASCII value of all characters
          System.out.printf ("Average: %.1f %n", average);      //display the average value
     }
}
               