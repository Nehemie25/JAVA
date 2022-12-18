/* EuroCoins: Cauculate the total value of the coins within a jar
 * Converts the total amount in dollars
 * Author: Nehemie Nguimbous T00694095
 */

import java.util.Scanner;
public class EuroCoins
{
     public static void main (String [] args)
     {
          Scanner scan = new Scanner (System.in);     // creates a new Scanner object
          int twoCoin = 0, oneCoin = 0, fiftyCent = 0, twentyCent = 0,tenCent = 0, fiveCent = 0, twoCent = 0, oneCent = 0, totalCoin= 0;     //creates and initializes all our integers coins variables and their total
          double totalAmount = 0;     // creates and initializes our double total variable
          
          // asks the user to enter the amount of each coins he has
          System.out.println (" How many coins of each do you have ? ");
         
          System.out.print (" How many 2$ coins do you have ?");     
          twoCoin = scan.nextInt();     // requests and stored the amount of 2 coins of the user 
          
          System.out.print (" \n How many 1$ coins do you have ?");
          oneCoin = scan.nextInt();     // requests and stored the amount of 1 coin of the user
          
          System.out.print ("\n How many .50$ coins  do you have ?");
          fiftyCent = scan.nextInt();     // requests and stored the amount of 50 cents of the user
          
          System.out.print ("\n How many .20$ coins do you have ?");    
          twentyCent = scan.nextInt();      // requests and stored the amount of 20 cents of the user
          
          System.out.print ("\n How many .10$ coins do you have ?");
          tenCent = scan.nextInt();      // requested and stored the amount of 10 cents of the user
          
          System.out.print ("\n How many .05$ coins do you have ?");
          fiveCent = scan.nextInt();      // requests and stored the amount of 5 cents of the user
          
          System.out.print ("\n How many .02$ coins do you have ?");
          twoCent = scan.nextInt();      // requests and stored the amount of 2 cents of the user
          
          System.out.print ("\n How many .01$ coins do you have ?");
          oneCent = scan.nextInt();      // requests and stored the amount of 1 cent of the user
          
          totalCoin = twoCoin + oneCoin + fiftyCent + twentyCent + tenCent + fiveCent + twoCent + oneCent;     // calculate the amount of coins in the jar
          totalAmount = twoCoin *200 + oneCoin*100 + fiftyCent*50 + twentyCent*20 + tenCent*10 + fiveCent*5 + twoCent*2 + oneCent*1;     // calculate their total value
          
          System.out.printf("\n There are %d coins in the jar valued %.2f $ \n",totalCoin, totalAmount / 100);     // displays them to the user 
     }
}