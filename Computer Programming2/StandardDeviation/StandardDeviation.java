import java.util.Random;
public class StandardDeviation
{
     public static void main (String [] args)
     {
          Random rand = new Random();
          int [] values = new int [5];
          int sum = 0, sumOfDif = 0;
          double mean = 0.0, standardDeviation = 0.0;
          
          for (int i=0; i < values.length; i++)
          {
               values[i] = rand.nextInt (100);
               sum += values[i];
               System.out.println (values[i]);
          }
          mean = (double)sum / values.length;
          
          for (int j = 0; j < values.length; j++)
          {
               sumOfDif += Math.pow ((values[j] - mean), 2);
          }
          standardDeviation = Math.sqrt ((double)sumOfDif / (values.length));
          
          System.out.printf ("The mean values is %.3f %n", mean);
          System.out.printf ("The standard deviation  values is %.8f %n", standardDeviation);
     }
}
          
          