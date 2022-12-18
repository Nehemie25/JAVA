import java.io.IOException;// IOException class, to handle input/output errors 
/* TestSystemIn - a simple test program to experiment with System.in.read(), proving * that the Scanner class is the much, much better approach for console input 
 * */ 
public class TestSystemIn 
{
     public static void main (String[] args)
          throws IOException // handler for input/output problems (such as with System.in.read() ) 
     { 
          char inChar1, inChar2, inChar3; // store the three (3) characters from the console/keyboard // characters read from System.in, by .read() returns an int, so casting back to char
          System.out.println ("Three char input"); // is ENTER a character? (ASCII 10)
          inChar1 = (char)System.in.read();
          inChar2 = (char)System.in.read(); 
          inChar3 = (char)System.in.read(); // display the three characters input from the console
          System.out.println ("Input char 1: " + inChar1 + " value: " + (int)inChar1);
          System.out.println ("Input char 2: " + inChar2 + " value: " + (int)inChar2); 
          System.out.println ("Input char 3: " + inChar3 + " value: " + (int)inChar3);
     } 
}