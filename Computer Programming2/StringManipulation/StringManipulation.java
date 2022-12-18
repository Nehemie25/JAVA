import java.util.Scanner;
public class StringManipulation 
{
     public static void main (String [] args)
     {
          Scanner scan = new Scanner (System.in);
          String sayHello = "";
          String newString = "";
          System.out.println("Let's have some fun with String manipulation");
          System.out.println(" Say hello to the world of programmming");
          
          sayHello = scan.nextLine();
           newString = sayHello.replace('a', '@');
          newString = newString.replace('e', '#');
          newString = newString.replace('l', '%');
          
          System.out.println (sayHello);
          System.out.println(sayHello.toUpperCase());
          System.out.println(sayHello.toLowerCase());
          System.out.println(newString);
         
          
     }
}
          