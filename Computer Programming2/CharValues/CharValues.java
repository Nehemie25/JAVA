/*CharValues: get a three letter word from the user, extracts each letter and displays them as their UniCode values
 * and their Hexadecimal values
 * */
import java.util.Scanner; // use scanner class for console input
public class CharValues 
{
     public static void main (String [] args)
     {
          Scanner scan = new Scanner (System.in);  // attach input to console (System.in)
          String imputWord = ""; // variable used to store the user input
          char char1 = 0, char2 = 0, char3 = 0; // variables used to store the 3 extracted letters
          int val1 = 0, val2 = 0, val3 = 0;  // variables used to store their corresponding UniCode values 
          // Introduce the ptogram and ask the word to the user 
          System.out.println("This program extracts all the characters of a 3 letter string and display each of them seperately as hexadecinal");
          System.out.println("Enter your 3 letters string please");
          
          imputWord = scan.nextLine(); // assignment of the user imput to the imputWord variable
          //extraction of  all the 3 letters 
          char1 = imputWord.charAt(0); // extraction of the first letter
          char2 = imputWord.charAt(1); // ectraction of the second letter 
          char3 = imputWord.charAt(2); // extraction of the third letter
          
          val1 = char1;  
          val2 = char2;
          val3 = char3;
          
          System.out.printf("Our original word contains the following 3 letters %c  %c  %c and the corresponding hexadecimal values are :\n", char1, char2, char3);
          System.out.printf("Their corresponding UniCode values are  %d  %d  %d \n", val1, val2, val3);
          System.out.printf("Their corresponding hexadecimal  values are  %x  %x  %x \n ", val1, val2, val3);
          
     }
}
        
          
          
          
          