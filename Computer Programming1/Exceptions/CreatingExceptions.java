//********************************************************************
//  CreatingExceptions.java       Java Foundations  p. 453
//  Demonstrates the ability to define an exception via inheritance.
//********************************************************************

import java.util.Scanner;

public class CreatingExceptions
{
     //-----------------------------------------------------------------
     //  Creates an exception object and possibly throws it.
     //-----------------------------------------------------------------
     public static void main (String[] args) 
     {
          final int MIN = 25, MAX = 40;
          Scanner scan = new Scanner (System.in);
          
               System.out.print ("Enter an integer value between " + MIN +
                                 " and " + MAX + ", inclusive: ");
               int value = scan.nextInt();
               
               //  Determine if the exception should be thrown
               if (value < MIN || value > MAX)
                    throw new OutOfRangeException("Input value is out of range");
               
          
     }
}