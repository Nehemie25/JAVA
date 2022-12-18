import java.util.Scanner;
public class VowelsCount
{
     public static void main (String [] args)
     {
          String phrase = ""; 
          char letter = ' ';
          int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0, yCount = 0;
          Scanner scan = new Scanner (System.in);
          System.out.print ("String: ");
          phrase = scan.nextLine();
          
          for (int i = 0; i < phrase.length() - 1 ; i ++)
          {
               letter = phrase.toUpperCase().charAt (i);
               
               switch (letter)
               {
                    case 'A': 
                         aCount++;
                         break;
                         
                    case 'E': 
                         eCount++;
                         break;
                         
                    case 'I': 
                         iCount++;
                         break;
                         
                    case 'O': 
                         oCount++;
                         break;
                         
                    case 'U': 
                         uCount++;
                         break;
                         
                    case 'Y': 
                         yCount++;
                         break;
               }
               
          }
          
          
          System.out.printf ("a - %d %n", aCount);
          System.out.printf ("e - %d %n", eCount);
          System.out.printf ("i - %d %n", iCount);
          System.out.printf ("o - %d %n", oCount);
          System.out.printf ("u - %d %n", uCount);
          System.out.printf ("y - %d %n", yCount);
          
     }
}