/* QuandA : ask for the firstname and the age of the user and displays them on the screen
 * Author : Nehemie Nguimbous T00694095
 */
import java.util.Scanner; // we import a class of input purposes 

public class QandA {
     public static void main (String[] args) 
     { 
          Scanner scan = new Scanner (System.in); // initialise the console input object
          String nameFirst = ""; //  our first name variable
          double age = 0; // our age variable
          double olderAge = 0; // our older age variable 
          
          // receiving the value of the first name and age of the user
          
          System.out.print ("What is your first name? "); 
          nameFirst = scan.next(); // will receive a single world value
          System.out.print ("How old are you? "); 
          age = scan.nextDouble(); // will receive any integer value
          olderAge = age + 10; // add 10 years to the current age

          // output results
          
          System.out.println ("Hello " + nameFirst);
          System.out.println ("You are " + age + " years old now, and " + olderAge + " in 10 years"); 
          System.out.println ();
          
          
     } // end of main()
}// end of class()