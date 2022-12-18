import java.util.Scanner;
public class RollingDice
{
     public static void main (String [] args)
     {
          int n = 0, die1 = 0, die2 = 0, die3 = 0;
          Scanner scan = new Scanner (System.in);
          System.out.println ("Rolling dice program");
          System.out.println ("How many sides does your dicee have ");
          n = scan.nextInt();
          die1 = (int)(Math.random() *( n - 1 + 1) + 1);
          die2 = (int)(Math.random()*( n - 1 + 1) + 1);
          die3 =(int) (Math.random()*( n - 1 + 1) + 1);
          System.out.printf (" Your frist rolling value is %d ", die1);
          System.out.printf ("\n Your second rolling value is %d ", die2);
          System.out.printf ("\n Your third rolling value is %d ", die3);
          System.out.printf("\n The maximum of this value is  %d and the minimum is  %d ", Math.max( Math.max(die1, die2), die3), Math.min( Math.min(die1, die2), die3));
     }
}
          