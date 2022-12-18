import java.util.Scanner;
public class StrManipulation
{
     public static void main (String [] args)
     {
          Scanner scan = new Scanner (System.in);
          String name = "", first = "", last = "";
          char initial;
          int pos = 0;
          System.out.println ("What is your full name please ?");
          name = scan.nextLine();
          pos = name.indexOf(' ');
          first = name.substring(0, pos);
          last = name.substring(pos,  name.length());
          initial = name.charAt(0);
          System.out.printf(" your first name is %s and your last name is %s \n ", first, last);
          System.out.printf ("Honorific : DR %c.  %s ", initial, last);
                            }
          
   }       
          
          
          
          