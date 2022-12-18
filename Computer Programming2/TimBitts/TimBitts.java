import java.util.Scanner;
public class TimBitts
{
     public static void main (String [] args)
     {
          Scanner scan = new Scanner (System.in);
          int pos = 0;
          String fullName = "", firstName = "", lastName = "", newFisrtName = "", newLastName = "";
          char firstInitial = 0,lastInitial =0;
          System.out.println ("Here is the Implementation of the Tim Bitts application");
          System.out.println ("Enter both your first name and your last name with space between");
          fullName = scan.nextLine();
          System.out.printf ("Your full name is  %s ", fullName.toUpperCase());
          pos = fullName.indexOf(' ');
          lastName = fullName.substring(pos);
          firstName = fullName.substring(0, pos);
          firstInitial = firstName.charAt(0);
          lastInitial = lastName.charAt(1);
          System.out.printf("\nYour initials are %c.%c. ", firstInitial, lastInitial);
          System.out.printf("\n Your fisrt name has %d letters ", firstName.length());
          System.out.printf("\n Your last name has %d letters ",  lastName.length()-1);
          System.out.printf("\n The total length of your name is  %d", firstName.length() + lastName.length() - 1);
          
          firstInitial = 'Z';
          lastInitial = 'Z';
          
          System.out.printf ("\nYour funny name is  %s  %s  ", firstInitial + firstName.substring(1), lastInitial + lastName.substring(2));
          
          System.out.printf("\n Your secret name is %s  %s  ", firstName.substring(firstName.length() - 2).toUpperCase(), lastName.substring(lastName.length() - 2).toUpperCase());
          
        
          
     }
}
          
     