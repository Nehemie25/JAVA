import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
public class Panlindrome
{
     public static void main (String [] args)
          throws IOException
     {
          
          Scanner scan = new Scanner (System.in);
          String str = "", reverseStr = "";
          String inputFileName = "samples.txt";
          File inputFile = new File (inputFileName);
          Scanner scanFile = new Scanner (inputFile);
          
          while (scanFile.hasNext())
          {
               str = scanFile.nextLine();
             
               str = str.toUpperCase();
               str = str.replace(".", "");
               str = str.replace(",", "");
               str = str.replace("'", "");
               str = str.replace(" ", "");
               str = str.replace("?", "");
               str = str.replace("!", "");
               for (int i = str.length() - 1; i >=0; i--)
               {
                    reverseStr += str.charAt(i);
               }
               
               if (str.equals (reverseStr))
               {
                    System.out.printf ("%s  is palindrome %n", str);
               }
               else 
               {
                    System.out.printf ("%s is not palindrome %n", str);
               }
               reverseStr = "";
               
          }
          scanFile.close();
     }
}