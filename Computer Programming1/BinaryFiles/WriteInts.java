import java.io.*;

public class WriteInts
{
     public static void main (String [] args) throws IOException
     {
          int [] numbers = {2, 4, 6, 8, 10, 12, 14};
          FileOutputStream fstream = new FileOutputStream ("numbers.dat");
          ObjectOutputStream outputFile = new ObjectOutputStream (fstream);
          
          for (int i = 0; i < numbers.length; i++)
          {
               outputFile.writeInt (numbers [i]);
          }
          outputFile.close();
     }
}