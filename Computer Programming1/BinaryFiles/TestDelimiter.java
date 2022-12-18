import java.util.Scanner;
public class TestDelimiter
{
     public static void main (String [] args)
     {
          Scanner scan = new Scanner (System.in);
          String phrase = "";
          scan.useDelimiter ("he");
          phrase = scan.nextLine();
          
          System.out.println (phrase);
     }
}
          