import java.util.Scanner;
public class Utility
{
     public void hellows (int howMany)                 // display hellows method
     {
          for (int i = 0; i < howMany; i++)
          {
               System.out.println ("Hello World " + i );
          }
     }
     
     public double calculatePi (int terms)                // PI approximation method 
     {
          
          double approxPi = 0;
          
          for (int k = 0; k <= terms; k++)
          {
               approxPi += 4*( Math.pow (-1, k) / (double)(2*k + 1));
          }
          
          return approxPi;
          
     }
     
     public String reverse (String str)                 // reverse string method 
     {
          String reverse = "";
          
          for (int i = str.length() - 1; i >= 0; i--)
          {
               reverse += str.charAt (i);
          }
          return reverse;
     }
     
     public static boolean equalsString (String str1, String str2)  // String comparison methods
     {
          boolean result = true;
          if (str1.length() != str2.length())
          {
               result = false;
          }
          else
          {
               for (int pos = 0; pos < str1.length(); pos++)
               {
                    if (str1.charAt (pos) != str2.charAt (pos))
                    {
                         result = false;
                         break;
                    }
               }
          }
          
          return result;
     }
     
     public void show (String str)     // method used to display a string 
     {
          System.out.print (str);
     }
     
     public void show (int intNumber)   // method used to display an integer
     {
          System.out.print (intNumber);
     }
     
     public void show (char letter)    // method used to display a character 
     {
          System.out.print (letter);
     }
     
     public void show (double doubleNumber)  // method used to display a double number
     {
          System.out.print (doubleNumber);
     }
     
     public void showln ()                   // method used to insert a new line
     {
          System.out.print ("\n");
     }
     public static String inputWord (String str)
     {
          System.out.printf (str);
          Scanner scan = new Scanner (System.in);
          String word = "";
          word = scan.next();
          return word;
     }
     
     public static int maximum (int a, int b, int c)
     {
          int max = a;
          max = (max < b)? b : max ;
          max = (max < c)? c : max ;
          
          return max;
     }
     public static String multiConcat (String str, int howMany)
     {
         String res = "";
          for (int i=0; i < howMany; i++)
          {
               res += str;
               
          }
          return res;
     }
     
}