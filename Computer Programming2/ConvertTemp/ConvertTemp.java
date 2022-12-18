/*ConvertTemp - converts user input of Fahrenheit temperature   to equivalent Celcius and Kelvin 
*/
import java.util.Scanner; // use Scanner class for console input
public class ConvertTemp
{
     public static void main (String [] args)
     {
          final double CELCIUS = -32f, KELVIN = 459.67f, FRACTION = 5/9f; // declaration and of constant used in the conversion of Fahrenheit to Celcius and Kelvin
          double celciusT = 0f, kelvinT = 0f, imputFah = 0f; // declaration and initialisation of the variables that will contains respectively the celcius result, the kelvin result and the initial Fahrenheit input
          Scanner scan = new Scanner(System.in); // attach input to console (System.in)
          // collect  the user imput temperature in Fahrenheit
          System.out.println ("This program converts temperature between Fahrenheit and Celcius and then between Fahrenheit and Kelvin");
          System.out.println ("Enter your temperature in Fahrenheit");
          
          imputFah = scan.nextDouble();// get Fahrenheit from user
         
          celciusT = (imputFah + CELCIUS)* FRACTION; // convert to Celcius
          kelvinT = (imputFah + KELVIN)* FRACTION; // convert to Kelvin
          
          // display the outputs
          System.out.printf("The corresponding values of %.5f Fahrenheit are %.5f Celcius and %.5f Kelvin", imputFah, celciusT, kelvinT);
     }
}
          
          
          
          