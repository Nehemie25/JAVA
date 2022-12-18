import java.util.Scanner;
import java.util.Random;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
public class RandomSequence
{
     public static void main (String [] args) throws IOException
     {
          int n = 0, randValue = 0;
          String outStr = "", outputFileName = "";
          Scanner scan = new Scanner (System.in);
          Random rand = new Random();
          System.out.print ("Enter the file name");
          outputFileName = scan.next();
          PrintWriter outputFile = new PrintWriter (outputFileName);
          System.out.print ("How many values ?:");
          n = scan.nextInt();
          
          for (int i=0; i < n; i++)
          {
              randValue = rand.nextInt (500 - 0 + 1) + 0;
              
              outStr += outStr.format ("%4d :", randValue);
                  
              for (int j = 0; j < randValue; j++)
              {
                  
                   outStr += "*";
              }
             outStr += outStr.format ("%n");
              
          }
          System.out.println (outStr);
          outputFile.print (outStr);
          outputFile.close();
          
          
     }
}