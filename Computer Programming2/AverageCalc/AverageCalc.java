/* AverageCalc : Calculate the average value of 3 numbers entered by the useer
 * Author : Nehemie Nguimbous T00694095
 */
import java.util.Scanner; // we import a class of input purposes 

public class AverageCalc {
     public static void main ( String [] args)
     {
          double val1, val2, val3, total, average; // create 5 double variables at the same time
          Scanner scan = new Scanner(System.in); // initialise the console input object
          System.out.println ("Enter 3 double values");
          val1 = scan.nextDouble(); // store the user input in val1
          val2 = scan.nextDouble(); //store the user input in val2
          val3 = scan.nextDouble(); //store the user input in val3
          
          total = val1 + val2 + val3; // store the sum of the 3 values 
          average = total / 3; // calculate the average value 
          
           // display the result
          
          System.out.println("The total is " + total + " and the average is " + average);
          System.out.println ();
     }
}
          
          