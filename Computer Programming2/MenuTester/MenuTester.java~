import java.util.Scanner;
public class MenuTester
{
     public static void main (String [] args)
     {
          Scanner scan = new Scanner (System.in);
          char option = ' ';
          String name = "";
          int n = 0, total = 0;
          String menu = "Menu:\n" +
                        "A) display \"Hello World\" \n" +
                        "B) display your name, one character per line\n" +
                        "C) calculate summation 1..n\n" +
                        "D) calculate an approximation to PI\n" +
                        "X) exit";
          System.out.print (menu);
          
          do
          {
               System.out.printf ("%nSelect an option: %n");
               option = scan.next().toUpperCase().charAt (0);
               scan.nextLine();               
               switch (option)
               {
                    case 'A':
                         System.out.println ("Hello World");
                         break;
                         
                    case 'B':
                    
                         System.out.print ("Your name: ");
                         name =  scan.nextLine();
                         for (int i = 0; i < name.length(); i ++)
                         {
                              System.out.println (name.charAt (i));
                         }
                         
                         break;
                    
                    case 'C':
                         System.out.print ("n: ");
                         n = scan.nextInt();
                         for (int i = 0; i <= n; i++)
                         {
                              total += i;
                         }
                         System.out.println (total);
                         break;
                    case 'X':
                         System.out.println ("Good bye");
                         break;
               }
          }while (option != 'X');
                         
                         
                         
               
     }
}
                        
               
               
               