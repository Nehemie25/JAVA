import java.util.Scanner;
import java.util.Random;
public class ArrayTest
{
     public static void main (String [] args)
     {
          int [] numbers  =  new int[5];
          int total = 0, minValue = 0, maxValue = 0;
          Random rand = new Random();
          
          for (int i = 0; i < numbers.length; i++)
          {
               numbers[i] = rand.nextInt (10 + 10 +1) - 10;
               System.out.println (numbers[i]);
          }
          
          maxValue = numbers[0];
          minValue = numbers[0];
          for (int j = 0; j < numbers.length; j++)
          {
               total += numbers[j];
               if (maxValue < numbers[j])
               {
                    maxValue = numbers[j];
               }
               if (minValue > numbers[j])
               {
                    minValue = numbers[j];
               }
               
               
               
          }
          System.out.printf ("The maximum value is %d , the minimum is %d and the total is %d", maxValue, minValue, total);
          
     }
}